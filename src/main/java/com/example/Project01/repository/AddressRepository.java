package com.example.Project01.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Project01.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
    
}