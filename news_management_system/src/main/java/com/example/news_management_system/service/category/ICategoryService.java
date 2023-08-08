package com.example.news_management_system.service.category;

import com.example.news_management_system.entity.CategoryEntity;

import java.util.List;

public interface ICategoryService {
    List<CategoryEntity> getAll();
    CategoryEntity getById(long id);
    void create(CategoryEntity newCategory);
    void update(long id, CategoryEntity updateCategory);
    void delete(long id);
}
