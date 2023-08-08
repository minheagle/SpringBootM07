package com.example.news_management_system.service.category;

import com.example.news_management_system.entity.CategoryEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService{
    @Override
    public List<CategoryEntity> getAll() {
        return null;
    }

    @Override
    public CategoryEntity getById(long id) {
        return null;
    }

    @Override
    public void create(CategoryEntity newCategory) {

    }

    @Override
    public void update(long id, CategoryEntity updateCategory) {

    }

    @Override
    public void delete(long id) {

    }
}
