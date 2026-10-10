package com.placement.placementaisystem.dto;

public class ProgressAnalysisResult {

    private String skillName;
    private Integer previousScore;
    private Integer currentScore;
    private Integer improvement;
    private Double improvementPercentage;

    public ProgressAnalysisResult() {
    }

    public ProgressAnalysisResult(
            String skillName,
            Integer previousScore,
            Integer currentScore,
            Integer improvement,
            Double improvementPercentage) {

        this.skillName = skillName;
        this.previousScore = previousScore;
        this.currentScore = currentScore;
        this.improvement = improvement;
        this.improvementPercentage = improvementPercentage;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public Integer getPreviousScore() {
        return previousScore;
    }

    public void setPreviousScore(Integer previousScore) {
        this.previousScore = previousScore;
    }

    public Integer getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(Integer currentScore) {
        this.currentScore = currentScore;
    }

    public Integer getImprovement() {
        return improvement;
    }

    public void setImprovement(Integer improvement) {
        this.improvement = improvement;
    }

    public Double getImprovementPercentage() {
        return improvementPercentage;
    }

    public void setImprovementPercentage(Double improvementPercentage) {
        this.improvementPercentage = improvementPercentage;
    }
}