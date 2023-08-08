package com.example.news_management_system.service.staff;

import com.example.news_management_system.entity.StaffEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService implements IStaffService{
    @Override
    public List<StaffEntity> getAll() {
        return null;
    }

    @Override
    public StaffEntity getById(long id) {
        return null;
    }

    @Override
    public void create(StaffEntity staffEntity) {

    }

    @Override
    public void update(long id, StaffEntity staffEntity) {

    }

    @Override
    public void delete(long id) {

    }
}
