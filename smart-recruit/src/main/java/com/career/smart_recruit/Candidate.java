package com.career.smart_recruit;

import jakarta.persistence.*;
import lombok.Data;

@Entity // Ye batata hai ki ye Database ki table hai
@Data   // Ye apne aap Getters/Setters bana dega (Lombok magic)
public class Candidate {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String email;
    
    @Column(columnDefinition = "TEXT") // Resume bada ho sakta hai
    private String resumeText;
    
    @Column(columnDefinition = "TEXT")
    private String aiAnalysis; // AI ka output yahan save hoga
}