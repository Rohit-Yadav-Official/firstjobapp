package com.example.firstjobapp.Reviews;

import com.example.firstjobapp.Company.Company;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class Reviews {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

   private Long id;
    private String title;
   private String description;
   private double rating;
   public Reviews(Long id, String title, String description, double rating) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.rating = rating;
    }
    @JsonIgnore
    @ManyToOne
    private Company company;
    public Reviews() {}

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }

}
