package com.example.Companies.services;

import com.example.Companies.Model.Company;

public interface CompanyService {
    public Iterable<Company> findAll();
    public Iterable<Company> findByTitle(String title);
    public Iterable<Company> findByTitleOrderBySalesDesc(String title);
    public Iterable<Company> findBySalesGreaterThan(Long sales);
}