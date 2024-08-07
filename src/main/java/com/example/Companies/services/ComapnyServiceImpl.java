package com.example.Companies.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Companies.Model.Company;
import com.example.Companies.dataaccess.CompanyRepository;

@Service
public class ComapnyServiceImpl implements CompanyService {
    
    CompanyRepository companyRepository;

    @Override
    public Iterable<Company> findAll() {
        return companyRepository.findAll();
    }

    @Override
    public Iterable<Company> findByTitle(String title) {
        return companyRepository.findByTitle(title);
    }

    @Override
    public Iterable<Company> findByTitleOrderBySalesDesc(String title) {
        return companyRepository.findByTitleOrderBySalesDesc(title);
    }

    @Override
    public Iterable<Company> findBySalesGreaterThan(Long sales) {
       return companyRepository.findBySalesGreaterThan(sales);
    }

    @Autowired
    public void setCompanyRepository(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

}
