package com.example.Companies.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Companies.Model.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

    Iterable<Company> findByTitle(String title);

    Iterable<Company> findByTitleOrderBySalesDesc(String title);

    Iterable<Company> findBySalesGreaterThan(Long sales);

}
