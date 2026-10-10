const studentId = 1;

fetch(`http://localhost:8080/api/dashboard/${studentId}`)
    .then(response => response.json())
    .then(data => {

        // Student Profile
        document.getElementById("studentName").textContent =
            data.studentName;

        document.getElementById("studentEmail").textContent =
            data.email;

        document.getElementById("studentBranch").textContent =
            data.branch;

        document.getElementById("studentCgpa").textContent =
            data.cgpa;

        document.getElementById("graduationYear").textContent =
            data.graduationYear;


        // Performance
        document.getElementById("averageScore").textContent =
            data.performanceAnalysis.average_score;


        // Weak Skills
        const weakSkills = document.getElementById("weakSkills");

        weakSkills.innerHTML = "";

        data.performanceAnalysis.weak_skills.forEach(skill => {

            const li = document.createElement("li");

            li.textContent = skill;

            weakSkills.appendChild(li);
        });


        // Preparation Plan
        const preparationPlan =
            document.getElementById("preparationPlan");

        preparationPlan.innerHTML = "";

        data.performanceAnalysis.preparation_plan.forEach(item => {

            const div = document.createElement("div");

            div.className = "card";

            div.innerHTML = `
                <strong>${item.skill}</strong>
                <p>${item.recommendation}</p>
            `;

            preparationPlan.appendChild(div);
        });


        // Skill Progress
        const progressAnalysis =
            document.getElementById("progressAnalysis");

        progressAnalysis.innerHTML = "";

        data.progressAnalysis.forEach(progress => {

            const div = document.createElement("div");

            div.innerHTML = `
                <h3>${progress.skillName}</h3>
                <p>Previous Score: ${progress.previousScore}</p>
                <p>Current Score: ${progress.currentScore}</p>
                <p>Improvement: +${progress.improvement}</p>
                <p>Improvement Percentage: ${progress.improvementPercentage}%</p>
                <hr>
            `;

            progressAnalysis.appendChild(div);
        });


        // Recommended Jobs
        const jobMatches =
            document.getElementById("jobMatches");

        jobMatches.innerHTML = "";

        data.jobMatches.forEach(job => {

            const div = document.createElement("div");

            div.innerHTML = `
                <h3>${job.jobRole}</h3>
                <p>Company: ${job.companyName}</p>
                <p>Match Score: ${job.matchScore.toFixed(2)}%</p>
                <hr>
            `;

            jobMatches.appendChild(div);
        });

    })
    .catch(error => {

        console.error("Error loading dashboard:", error);

    });