package com.example.firstjobapp.job;


import java.util.List;

public interface  JobService {
    List<Job> findALL();
    String PostJob(Job job);
    Job findJobById(Long id);
}
