package com.example.firstjobapp.Company1;
import com.example.firstjobapp.Company.Company;

import java.util.List;
public interface CompanyService {
    List<com.example.firstjobapp.Company.Company> getAllCompanies();
    boolean updateCompany(Company company, Long id);

}
