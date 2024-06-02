package com.example.firstjobapp.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class JobController {

   private JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
   }

    @GetMapping ("/jobs")
      public List<Job> findALL(){
          return jobService.findALL();
      }
    @PostMapping ("/jobs")
    public String PostJob(@RequestBody Job job){
        String s=jobService.PostJob( job);
        return s;
    }

    @GetMapping("/jobs/{id}")
    public Job findJobById(@PathVariable Long id){
       Job job= jobService.findJobById(id);
        return job;
    }

}
