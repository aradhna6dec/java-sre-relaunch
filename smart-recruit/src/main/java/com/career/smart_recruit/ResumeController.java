package com.career.smart_recruit;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/resume")
public class ResumeController {

    private final ResumeService service;

    public ResumeController(ResumeService service) {
        this.service = service;
    }

    // DTO (Data Transfer Object) - Data lene ke liye chhota packet
    public record ResumeRequest(String name, String resumeText) {}

    // POST Request: Naya resume bhejne ke liye
    @PostMapping("/analyze")
    public Candidate analyze(@RequestBody ResumeRequest request) {
        return service.analyzeProfile(request.name(), request.resumeText());
    }

    // GET Request: Sabhi purane resumes dekhne ke liye
    @GetMapping("/all")
    public List<Candidate> getAll() {
        return service.getAllCandidates();
    }
}