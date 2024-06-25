package com.example.firstjobapp.Reviews;

import java.util.List;

public interface ReviewService {


    List<Reviews> getAllReviews(long companyId);
    void addReview(long companyId, Reviews reviews);
}
