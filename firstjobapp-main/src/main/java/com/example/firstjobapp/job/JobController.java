package com.example.firstjobapp.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@RequestMapping("/job")
@RestController
public class JobController {

   private JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
   }

    @GetMapping
      public List<Job> findALL(){
          return jobService.findALL();
      }
    @PostMapping
    public String PostJob(@RequestBody Job job){
        String s=jobService.PostJob( job);
        return s;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Job> findJobById(@PathVariable Long id){
       Job job= jobService.findJobById(id);
        if(job!=null){
            return new ResponseEntity<>(job, HttpStatus.OK);
        };
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteJobById(@PathVariable Long id){
        boolean delete= jobService.DeleteJobById(id);
        if(delete) {

           return new ResponseEntity<>("Job deleted", HttpStatus.OK);
        }
        return new ResponseEntity<>("Job deletion failed", HttpStatus.NOT_FOUND);

    }
    @PutMapping("/{id}")
    public ResponseEntity<String> updateJobById(@PathVariable Long id, @RequestBody Job job){
       boolean update= jobService.updateJobById(id,job);
       if(update) {
           return new ResponseEntity<>("Job updated", HttpStatus.OK);
       }
        return new ResponseEntity<>("Job updated", HttpStatus.NOT_FOUND);
    }

}
