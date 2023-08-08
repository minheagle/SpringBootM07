package com.example.news_management_system.service.staff;

import com.example.news_management_system.entity.StaffEntity;

import java.util.List;

public interface IStaffService {
    List<StaffEntity> getAll();
    StaffEntity getById(long id);
    void create (StaffEntity staffEntity);
    void update(long id, StaffEntity staffEntity);
    void delete(long id);
}
