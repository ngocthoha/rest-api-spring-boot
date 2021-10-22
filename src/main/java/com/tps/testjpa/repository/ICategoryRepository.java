package com.tps.testjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tps.testjpa.model.Category;

public interface ICategoryRepository extends JpaRepository<Category	, Long>{

}
