package com.example.job_tracker.controller;
 
import com.example.job_tracker.entity.Job;
import com.example.job_tracker.repository.JobRepository;
import org.springframework.web.bind.annotation.*;
 
import java.util.List;
 
@RestController
@RequestMapping("/api/jobs")
@CrossOrigin(origins = "http://localhost:4200")
public class JobController {
 
    private final JobRepository repository;
 
    public JobController(JobRepository repository) {
        this.repository = repository;
    }
 
    @GetMapping
    public List<Job> getAllJobs() {
        return repository.findAll();
    }
 
    @PostMapping
    public Job createJob(@RequestBody Job job) {
        return repository.save(job);
    }
 
    @DeleteMapping("/{id}")
    public void deleteJob(@PathVariable Long id) {
        repository.deleteById(id);
    }
}