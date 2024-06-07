package com.example.firstjobapp.Company;
import java.util.List;
public interface CompanyService {
    List<Company> getAllCompanies();
    boolean updateCompany(Company company, Long id);
    void addCompany(Company company);
}
