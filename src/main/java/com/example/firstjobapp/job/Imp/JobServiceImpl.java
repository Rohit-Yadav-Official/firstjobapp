package com.example.firstjobapp.job.Imp;

import com.example.firstjobapp.job.Job;
import com.example.firstjobapp.job.JobService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
}
