package com.example.firstjobapp.Company;
import java.util.List;
import java.util.Optional;

public interface CompanyService {
    List<Company> getAllCompanies();
    boolean updateCompany(Company company, Long id);
    void addCompany(Company company);
    Optional<Company> findCompanyById(Long id);
}
