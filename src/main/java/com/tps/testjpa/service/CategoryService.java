package com.tps.testjpa.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tps.testjpa.model.Category;
import com.tps.testjpa.repository.ICategoryRepository;

@Service
public class CategoryService implements ICategoryService {
	@Autowired
	private ICategoryRepository categoryRepository;

	@Override
	public Iterable<Category> findAll() {
		return categoryRepository.findAll();
	}
	
	@Override
	public Optional<Category> findById(Long id) {
		return categoryRepository.findById(id);
	}
	@Override
	public Category save(Category category) {
		return categoryRepository.save(category);
	}

	public void remove(Long id) {
		categoryRepository.deleteById(id);
	}
}
