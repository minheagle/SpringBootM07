package com.example.news_management_system.service.news;

import com.example.news_management_system.domain.NewDomain;
import com.example.news_management_system.entity.NewEntity;
import com.example.news_management_system.repository.NewRepository;
import com.example.news_management_system.service.category.ICategoryService;
import com.example.news_management_system.service.staff.IStaffService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewService implements INewService{

    private final NewRepository newRepository;
    private final ICategoryService categoryService;
    private final IStaffService staffService;
    private final ModelMapper modelMapper;

    public NewService(NewRepository newRepository, ICategoryService categoryService, IStaffService staffService, ModelMapper modelMapper) {
        this.newRepository = newRepository;
        this.categoryService = categoryService;
        this.staffService = staffService;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<NewEntity> getAll() {
        return newRepository.findAll();
    }

    @Override
    public NewEntity getById(long id) {
        if (!newRepository.existsById(id)) throw new RuntimeException("Not found !");
        return newRepository.findById(id).get();
    }

    @Override
    public void create(NewDomain newDomain, long cateId, long staffId) {
        NewEntity newEntity = modelMapper.map(newDomain, NewEntity.class);

        newEntity.setCategoryEntity(categoryService.getById(cateId));
        newEntity.setStaffEntity(staffService.getById(staffId));
        newRepository.save(newEntity);
    }

    @Override
    public void update(long id, NewEntity newEntity) {

    }

    @Override
    public void delete(long id) {

    }
}
