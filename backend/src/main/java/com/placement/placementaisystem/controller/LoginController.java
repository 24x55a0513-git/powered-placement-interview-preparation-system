package com.placement.placementaisystem.controller;

import com.placement.placementaisystem.dto.LoginRequest;
import com.placement.placementaisystem.entity.Student;
import com.placement.placementaisystem.repository.StudentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/login")
@CrossOrigin(origins = "*")
public class LoginController {

    private final StudentRepository studentRepository;

    public LoginController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @PostMapping
    public Student login(@RequestBody LoginRequest request) {

        Optional<Student> student =
                studentRepository.findByEmail(request.getEmail());

        if (student.isPresent()
                && student.get().getPassword().equals(request.getPassword())) {

            return student.get();

        }

        throw new RuntimeException("Invalid email or password");
    }
}