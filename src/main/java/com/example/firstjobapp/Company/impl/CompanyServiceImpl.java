package com.example.firstjobapp.Company.impl;

import com.example.firstjobapp.Company.Company;
import com.example.firstjobapp.Company.CompanyRepository;
import com.example.firstjobapp.Company.CompanyService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyServiceImpl implements CompanyService {
    private CompanyRepository companyRepository;
    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }
    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }
    @Override
    public boolean updateCompany(Company company,Long id){
        Optional<Company> optionalCompany = companyRepository.findById(id);
        if(optionalCompany.isPresent()){
            Company c=optionalCompany.get();
            c.setName(company.getName());
            c.setDescription(company.getDescription());
            companyRepository.save(c);
            return true;
        }
        return false;
    }
    @Override
    public void addCompany(Company company){
        companyRepository.save(company);
       // return true;
    }

}
