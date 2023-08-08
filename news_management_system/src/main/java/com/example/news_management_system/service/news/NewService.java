package com.example.news_management_system.service.news;

import com.example.news_management_system.entity.NewEntity;
import com.example.news_management_system.repository.NewRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewService implements INewService{

    private final NewRepository newRepository;

    public NewService(NewRepository newRepository) {
        this.newRepository = newRepository;
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
    public void create(NewEntity newEntity) {
        newRepository.save(newEntity);
    }

    @Override
    public void update(long id, NewEntity newEntity) {

    }

    @Override
    public void delete(long id) {

    }
}
