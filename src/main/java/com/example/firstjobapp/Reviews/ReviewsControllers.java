package com.example.firstjobapp.Reviews;


import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company/{ompany_id}")
public class ReviewsControllers {

    private ReviewService reviewService;
    public ReviewsControllers(ReviewService reviewService) {
        this.reviewService = reviewService;
    }
    @GetMapping("/reviews")
    public ResponseEntity<List<Reviews>> getReviews(@PathVariable Long company_id) {
         return  new ResponseEntity<>(reviewService.getAllReviews(company_id), HttpStatus.OK);
    }
    @PostMapping("/reviews")
    public ResponseEntity<String> addReview(@PathVariable Long company_id, @RequestBody Reviews reviews) {
        reviewService.addReview(company_id,reviews);

        return new ResponseEntity<>("added succesfully", HttpStatus.CREATED);
    }
}
