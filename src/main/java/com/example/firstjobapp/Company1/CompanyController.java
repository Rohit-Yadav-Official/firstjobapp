package com.example.firstjobapp.Company1;

import com.example.firstjobapp.Company.Company;
import com.example.firstjobapp.Company.CompanyService;
import com.example.firstjobapp.job.Job;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {

   public com.example.firstjobapp.Company.CompanyService companyService;
   public CompanyController(CompanyService companyService) {
       this.companyService = companyService;
   }
   @GetMapping
    public List<com.example.firstjobapp.Company.Company> getAllCompany() {
      return companyService.getAllCompanies();
   }
   @PutMapping("/{id}")
   public ResponseEntity<String> updateCompanyId(@PathVariable Long id, @RequestBody Company company){
       boolean update= companyService.updateCompany(company,id);
       if(update) {
           return new ResponseEntity<>("Job updated", HttpStatus.OK);
       }
       return new ResponseEntity<>("Job updated", HttpStatus.NOT_FOUND);
   }
}
