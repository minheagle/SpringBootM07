package com.example.news_management_system.service.staff;

import com.example.news_management_system.entity.StaffEntity;
import com.example.news_management_system.repository.StaffRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StaffService implements IStaffService{

    private final StaffRepository staffRepository;

    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<StaffEntity> getAll() {
        return staffRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public StaffEntity getById(long id) {

        return staffRepository.findById(id)
                .orElseThrow(() ->new RuntimeException("Not found !"));
    }

    @Override
    @Transactional
    public void create(StaffEntity staffEntity) {

    }

    @Override
    @Transactional
    public void update(long id, StaffEntity staffEntity) {

    }

    @Override
    @Transactional
    public void delete(long id) {

    }
}
