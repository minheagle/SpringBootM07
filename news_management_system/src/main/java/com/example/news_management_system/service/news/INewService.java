package com.example.news_management_system.service.news;

import com.example.news_management_system.entity.NewEntity;

import java.util.List;

public interface INewService {
    List<NewEntity> getAll();
    NewEntity getById(long id);
    void create(NewEntity newEntity);
    void update(long id, NewEntity newEntity);
    void delete(long id);
}
