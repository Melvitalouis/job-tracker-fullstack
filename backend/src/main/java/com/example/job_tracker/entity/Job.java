package com.example.job_tracker.entity;
 
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
 
@Entity
@Table(name = "jobs")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Job {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    @Column(nullable = false)
    private String companyName;
 
    @Column(nullable = false)
    private String roleTitle;
 
    private String jobUrl;
 
    @Enumerated(EnumType.STRING)
    private ReferralStatus referralStatus;
 
    @Enumerated(EnumType.STRING)
    private ApplicationStatus applicationStatus;
 
    @Column(length = 1000)
    private String notes;
}