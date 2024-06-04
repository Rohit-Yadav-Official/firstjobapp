package com.example.firstjobapp.Company1;

import com.example.firstjobapp.job.Job;
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


    @OneToMany
    List<Job> Jobs;
    public Company() {
    }
    public Company(Long Id, String Name, String Description) {
        this.Id = Id;
        this.Name = Name;
        this.Description = Description;
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
