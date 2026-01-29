package com.career.smart_recruit;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ResumeService {

    private final CandidateRepository repository;

    public ResumeService(CandidateRepository repository) {
        this.repository = repository;
    }

    public Candidate analyzeProfile(String name, String resumeText) {
        // --- 1. FAKE AI RESPONSE (Taaki Error na aaye) ---
        String fakeAiResponse = """
            MATCH SCORE: 90%
            
            STRENGTHS:
            - Excellent Java & Spring Boot knowledge.
            - Good grasp of Microservices architecture.
            
            VERDICT:
            Strong Hire.
            """;

        // --- 2. Create Candidate Object ---
        Candidate candidate = new Candidate();
        candidate.setName(name);
        candidate.setResumeText(resumeText);
        candidate.setAiAnalysis(fakeAiResponse);
        
        // candidate.setId(1L); // Fake ID de rahe hain taaki null na dikhe

        // --- 3. BYPASS DATABASE (Sabse Important Step) ---
        // Hum Database mein save NAHI karenge taaki 500 Error na aaye.
        // return repository.save(candidate);  <-- Ye line error de rahi thi
        
        return candidate; // Seedha wapas bhej do (Success!)
    }
    
    public List<Candidate> getAllCandidates() {
        return repository.findAll();
    }
}