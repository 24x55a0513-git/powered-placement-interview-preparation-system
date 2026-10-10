package com.placement.placementaisystem.dto;

import java.util.List;

public class DashboardResponse {

    private Integer studentId;
    private String studentName;
    private String email;
    private String branch;
    private Double cgpa;
    private Integer graduationYear;

    private List<JobMatchResult> jobMatches;
    private PythonAnalysisResponse performanceAnalysis;
    private List<ProgressAnalysisResult> progressAnalysis;

    public DashboardResponse() {
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Double getCgpa() {
        return cgpa;
    }

    public void setCgpa(Double cgpa) {
        this.cgpa = cgpa;
    }

    public Integer getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(Integer graduationYear) {
        this.graduationYear = graduationYear;
    }

    public List<JobMatchResult> getJobMatches() {
        return jobMatches;
    }

    public void setJobMatches(List<JobMatchResult> jobMatches) {
        this.jobMatches = jobMatches;
    }

    public PythonAnalysisResponse getPerformanceAnalysis() {
        return performanceAnalysis;
    }

    public void setPerformanceAnalysis(PythonAnalysisResponse performanceAnalysis) {
        this.performanceAnalysis = performanceAnalysis;
    }

    public List<ProgressAnalysisResult> getProgressAnalysis() {
        return progressAnalysis;
    }

    public void setProgressAnalysis(List<ProgressAnalysisResult> progressAnalysis) {
        this.progressAnalysis = progressAnalysis;
    }
}