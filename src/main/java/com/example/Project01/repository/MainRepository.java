package com.example.Project01.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Project01.model.MainModel;

public interface MainRepository extends JpaRepository<MainModel, Long> {
    
}