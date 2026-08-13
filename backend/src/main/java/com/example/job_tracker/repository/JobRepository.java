package com.example.job_tracker.repository;
import com.example.job_tracker.entity.Job;import org.springframework.data.jpa.repository.JpaRepository;
public interface JobRepository extends JpaRepository<Job, Long> {
}