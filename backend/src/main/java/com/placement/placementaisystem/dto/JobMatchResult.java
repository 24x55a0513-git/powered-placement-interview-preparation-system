package com.placement.placementaisystem.dto;

public class JobMatchResult {

    private Integer jobId;
    private String jobRole;
    private String companyName;
    private Double matchScore;
    private String location;
    private Double packageLpa;

    public JobMatchResult() {
    }

    public JobMatchResult(
            Integer jobId,
            String jobRole,
            String companyName,
            Double matchScore,
            String location,
            Double packageLpa) {

        this.jobId = jobId;
        this.jobRole = jobRole;
        this.companyName = companyName;
        this.matchScore = matchScore;
        this.location = location;
        this.packageLpa = packageLpa;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Double getMatchScore() {
        return matchScore;
    }

    public void setMatchScore(Double matchScore) {
        this.matchScore = matchScore;
    }
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getPackageLpa() {
        return packageLpa;
    }

    public void setPackageLpa(Double packageLpa) {
        this.packageLpa = packageLpa;
    }
}