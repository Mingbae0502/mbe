package com.mb.mbe.service.impl;

import com.mb.mbe.repository.DeparmentsRepository;
import com.mb.mbe.service.DepartmentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DepartmentsServiceImpl implements DepartmentsService {

    @Autowired
    private DeparmentsRepository deparmentsRepository;

    @Override
    public Long countDepartments() {
        return deparmentsRepository.count();
    }
}
