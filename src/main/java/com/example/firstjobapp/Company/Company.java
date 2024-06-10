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

    @JsonIgnore
    @OneToMany(mappedBy = "company")
    private List<Job> Jobs;


    @JsonIgnore
    @OneToMany(mappedBy = "company")
    private List<Reviews> reviews;

    public Company() {
    }
    public Company(Long Id, String Name, String Description, List<Job> Jobs, List<Reviews> reviews) {
        this.Id = Id;
        this.Name = Name;
        this.Description = Description;
        this.Jobs = Jobs;
        this.reviews = reviews;

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
