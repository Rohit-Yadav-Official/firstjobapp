package com.example.firstjobapp.job.Imp;

import com.example.firstjobapp.job.Job;
import com.example.firstjobapp.job.JobService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class  JobServiceImpl implements  JobService {
   private List<Job> jobs = new ArrayList<>();
    @Override
    public List<Job> findALL(){

        return jobs;

    }



    @Override
    public String PostJob(Job job){

          jobs.add(job);
          return "job added sucessfully";
    }

    @Override
    public Job findJobById(Long id){

        for(Job job:jobs){
                if(job.getId().equals(id)){
                    return job;
                }
        }
        return null;
    }


    @Override
    public boolean DeleteJobById(Long id){
        for(Job job:jobs){
            if(job.getId().equals(id)){
                jobs.remove(job);
                return true;
            }
        }
        return false;
    }
    @Override
    public  boolean updateJobById( Long id,Job job){

        for(Job job1:jobs){
            if(job1.getId().equals(id)) {

                job1.setTitle(job.getTitle());
                job1.setDescription(job.getDescription());
                job1.setMinSalary(job.getMinSalary());
                job1.setMaxSalary(job.getMaxSalary());
                job1.setLocation(job.getLocation());
                return true;
            }
        }
        return false;
    }

}
