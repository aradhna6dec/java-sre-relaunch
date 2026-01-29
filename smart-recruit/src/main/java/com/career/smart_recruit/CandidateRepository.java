package com.career.smart_recruit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Long> {
    // Isme koi code likhne ki zaroorat nahi, Spring Boot khud sambhal lega!
}   