package com.example.firstjobapp.job.Imp;

import com.example.firstjobapp.job.Job;
import com.example.firstjobapp.job.JobRepository;
import com.example.firstjobapp.job.JobService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class  JobServiceImpl implements  JobService {
   JobRepository jobRepository;
   public JobServiceImpl(JobRepository jobRepository) {
       this.jobRepository = jobRepository;
   }
    @Override
    public List<Job> findALL(){

        return jobRepository.findAll();

    }



    @Override
    public String PostJob(Job job){

          jobRepository.save(job);
          return "job added sucessfully";
    }

    @Override
    public Job findJobById(Long id){

         return jobRepository.findById(id).orElse(null);
       // return job;
    }


    @Override
    public boolean DeleteJobById(Long id){
        jobRepository.deleteById(id);
        return jobRepository.existsById(id);
    }
    @Override
    public  boolean updateJobById( Long id,Job job){

        Optional<Job> jobOptional=jobRepository.findById(id);
            if(jobOptional.isPresent()) {
               Job job1=jobOptional.get();
                job1.setTitle(job.getTitle());
                job1.setDescription(job.getDescription());
                job1.setMinSalary(job.getMinSalary());
                job1.setMaxSalary(job.getMaxSalary());
                job1.setLocation(job.getLocation());
                return true;
            }
        return false;
        }


    }


