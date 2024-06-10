package com.example.firstjobapp.Reviews.impl;


import com.example.firstjobapp.Company.Company;
import com.example.firstjobapp.Company.CompanyService;
import com.example.firstjobapp.Reviews.ReviewRepository;
import com.example.firstjobapp.Reviews.ReviewService;
import com.example.firstjobapp.Reviews.Reviews;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;
    private final CompanyService companyService;
    public ReviewServiceImpl(ReviewRepository reviewRepository, CompanyService companyService) {
        this.reviewRepository = reviewRepository;
        this.companyService = companyService;
    }

    @Override
    public List<Reviews> getAllReviews(long companyId) {
        List<Reviews> reviews=reviewRepository.findByCompanyId(companyId);
        return reviews;
    }
    @Override
    public void addReview( long companyId, Reviews review) {
        Optional<Company> company=companyService.findCompanyById(companyId);
        review.setCompany(company.orElse(null));
        reviewRepository.save(review);


    }


}
