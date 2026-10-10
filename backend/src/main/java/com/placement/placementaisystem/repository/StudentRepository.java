package com.placement.placementaisystem.repository;

import com.placement.placementaisystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;



import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    Optional<Student> findByEmail(String email);
}