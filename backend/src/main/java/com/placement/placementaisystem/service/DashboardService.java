package com.placement.placementaisystem.service;
import com.placement.placementaisystem.dto.DashboardResponse;
import com.placement.placementaisystem.dto.JobMatchResult;
import com.placement.placementaisystem.dto.ProgressAnalysisResult;
import com.placement.placementaisystem.dto.PythonAnalysisResponse;
import com.placement.placementaisystem.entity.Student;
import com.placement.placementaisystem.repository.StudentRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class DashboardService {
    private final StudentRepository studentRepository;
    private final MatchingService matchingService;
    private final PythonAiService pythonAiService;
    private final SkillProgressService skillProgressService;
    public DashboardService(
            StudentRepository studentRepository,
            MatchingService matchingService,
            PythonAiService pythonAiService,
            SkillProgressService skillProgressService) {
        this.studentRepository = studentRepository;
        this.matchingService = matchingService;
        this.pythonAiService = pythonAiService;
        this.skillProgressService = skillProgressService;
    }
    public DashboardResponse getDashboard(Integer studentId) {
        Student student =
                studentRepository.findById(studentId).orElse(null);
        if (student == null) {
            return null;
        }
        List<JobMatchResult> jobMatches =
                matchingService.findMatchingJobs(studentId);
        PythonAnalysisResponse performance =
                pythonAiService.analyzeStudent(studentId);
        List<ProgressAnalysisResult> progress =
                skillProgressService.analyzeAllSkills(studentId);
        DashboardResponse dashboard = new DashboardResponse();
        dashboard.setStudentId(student.getStudentId());
        dashboard.setStudentName(student.getName());
        dashboard.setEmail(student.getEmail());
        dashboard.setBranch(student.getBranch());
        dashboard.setCgpa(student.getCgpa());
        dashboard.setGraduationYear(student.getGraduationYear());
        dashboard.setJobMatches(jobMatches);
        dashboard.setPerformanceAnalysis(performance);
        dashboard.setProgressAnalysis(progress);
        return dashboard;
    }
}