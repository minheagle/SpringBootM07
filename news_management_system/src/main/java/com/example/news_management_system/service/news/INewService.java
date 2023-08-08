package com.example.news_management_system.service.news;

import com.example.news_management_system.domain.NewDomain;
import com.example.news_management_system.entity.NewEntity;

import java.util.List;

public interface INewService {
    List<NewEntity> getAll();
    NewEntity getById(long id);
    void create(NewDomain newDomain, long cateId, long staffId);
    void update(long id, NewEntity newEntity);
    void delete(long id);
}
