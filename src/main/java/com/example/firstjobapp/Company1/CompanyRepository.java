package com.example.firstjobapp.Company1;

import com.example.firstjobapp.Company.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
