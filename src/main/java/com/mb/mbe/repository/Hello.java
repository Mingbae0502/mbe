package com.mb.mbe.repository;

import com.mb.mbe.entity.Departments;
import org.springframework.data.mirage.repository.MirageRepository;

public interface Hello extends MirageRepository<Long, Long> {
    int testthoi();
}
