package com.example.news_management_system.service.category;

import com.example.news_management_system.entity.CategoryEntity;
import com.example.news_management_system.repository.CategoryRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoryService implements ICategoryService{
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<CategoryEntity> getAll() {
        return categoryRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public CategoryEntity getById(long id) {
        return categoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Not found !"));
    }

    @Override
    @Transactional
    public void create(CategoryEntity newCategory) {

    }

    @Override
    @Transactional
    public void update(long id, CategoryEntity updateCategory) {

    }

    @Override
    @Transactional
    public void delete(long id) {

    }
}
