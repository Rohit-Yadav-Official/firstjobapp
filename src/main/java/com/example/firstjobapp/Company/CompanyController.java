package com.example.firstjobapp.Company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")

public class CompanyController {



    private CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }


   @GetMapping
    public List<Company> getAllCompany() {
      return companyService.getAllCompanies();
   }
   @PutMapping("/{id}")
   public ResponseEntity<String> updateCompany( @RequestBody Company company,@PathVariable Long id){
       boolean update= companyService.updateCompany(company,id);
       if(update) {
           return new ResponseEntity<>("Job updated", HttpStatus.OK);
       }
       return new ResponseEntity<>("Job updated", HttpStatus.NOT_FOUND);
   }
   @PostMapping()
    public ResponseEntity<String> addCompany(@RequestBody Company company){
        companyService.addCompany(company);
        return new ResponseEntity<>("Job added", HttpStatus.CREATED);

   }

}

