package com.example.firstjobapp.Company.impl;

import com.example.firstjobapp.Company.Company;
import com.example.firstjobapp.Company.CompanyRepository;
import com.example.firstjobapp.Company.CompanyService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyServiceImpl implements CompanyService {
     CompanyRepository companyRepository;
    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }
    @Override
    public boolean updateCompany(Company update,Long id) {
        Optional<Company> optionalCompany = companyRepository.findById(id);
        if (optionalCompany.isPresent()) {
            Company company =optionalCompany.get();
            company.setName(update.getName());
            company.setDescription(update.getDescription());
            companyRepository.save(company);
            return true;
        }
        return false;
    }

}
