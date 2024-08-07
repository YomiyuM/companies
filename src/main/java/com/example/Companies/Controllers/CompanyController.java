package com.example.Companies.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Companies.Model.Company;
import com.example.Companies.services.CompanyService;

@RestController
public class CompanyController {

    CompanyService companyService;

    @GetMapping("/companies")
    public Iterable<Company>  getAllCompanies()  {
        return companyService.findAll();
    }

    @GetMapping("/companies/{title}")
    public Iterable<Company> findAllByTitle(@PathVariable String title) {
        return companyService.findByTitleOrderBySalesDesc(title);
    }

    //Example Usage: http://localhost:8080/companies/sales?sales=1000000 
    @GetMapping("/companies/sales")
    public Iterable<Company> findBySalesGreaterThan(@RequestParam Long sales) {
        return companyService.findBySalesGreaterThan(sales);
    }

    public CompanyService getCompanyService() {
        return companyService;
    }

    @Autowired
    public void setCompanyService(CompanyService companyService) {
        this.companyService = companyService;
    }
}
