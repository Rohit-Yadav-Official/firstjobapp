package com.example.firstjobapp.Company;

import com.example.firstjobapp.Reviews.Reviews;
import com.example.firstjobapp.job.Job;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "company_table")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;
    String Name;
    String Description;


    @OneToMany(mappedBy = "company")

   List<Job> Jobs;

    @OneToMany(mappedBy = "company")
    @JsonIgnore
    private List<Reviews> reviews;
    public Company() {
    }
    public Company(Long Id, String Name, String Description) {
        this.Id = Id;
        this.Name = Name;
        this.Description = Description;
    }

    public List<Job> getJobs() {
        return Jobs;
    }

    public void setJobs(List<Job> jobs) {
        Jobs = jobs;
    }

    public List<Reviews> getReviews() {
        return reviews;
    }

    public void setReviews(List<Reviews> reviews) {
        this.reviews = reviews;
    }

    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        Id = id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getDescription() {
        return Description;
    }
    public void setDescription(String description) {
        Description = description;
    }
}
