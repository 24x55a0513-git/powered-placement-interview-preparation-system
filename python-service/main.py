from fastapi import FastAPI
import pandas as pd
import numpy as np
from question_bank import get_random_questions

app = FastAPI()


@app.get("/")
def home():
    return {"message": "Placement AI Python API is running"}


@app.get("/health")
def health():
    return {"status": "OK"}


@app.post("/analyze")
def analyze_performance(data: dict):

    df = pd.DataFrame({
        "Skill": data["skills"],
        "Score": data["scores"]
    })

    average = np.mean(df["Score"])

    def get_level(score):
        if score >= 80:
            return "Strong"
        elif score >= 70:
            return "Average"
        else:
            return "Weak"

    df["Level"] = df["Score"].apply(get_level)

    weak_skills = df[df["Level"] == "Weak"]["Skill"].tolist()

    recommendations = {
        "DSA": "Practice arrays, strings, sorting, searching and basic algorithms.",
        "SQL": "Practice SELECT, JOIN, GROUP BY, subqueries and SQL problems.",
        "Python": "Practice functions, lists, dictionaries, OOP and problem solving.",
        "Java": "Practice OOP, collections, exception handling and Java coding.",
        "OOP": "Practice inheritance, polymorphism, abstraction and encapsulation.",
        "NumPy": "Practice arrays, indexing, slicing and mathematical operations.",
        "Pandas": "Practice DataFrames, filtering, grouping and data analysis."
    }

    preparation_plan = []

    for skill in weak_skills:
        preparation_plan.append({
            "skill": skill,
            "recommendation": recommendations.get(
                skill,
                "Practice this skill with interview questions."
            )
        })

    return {
        "average_score": round(float(average), 2),
        "performance": df.to_dict(orient="records"),
        "weak_skills": weak_skills,
        "preparation_plan": preparation_plan,
        "ai_interview_questions": ""
    }


@app.post("/generate-questions")
def generate_questions(data: dict):

    weak_skills = data["weak_skills"]

    questions = get_random_questions(weak_skills, 4)

    return {
        "ai_interview_questions": questions
    }