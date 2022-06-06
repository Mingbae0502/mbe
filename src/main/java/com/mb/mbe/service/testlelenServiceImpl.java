package com.mb.mbe.service;

import com.mb.mbe.repository.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class testlelenServiceImpl implements testlelenService {

    @Autowired
    private Hello hello;

    @Override
    public int countgido() {
        return hello.testthoi();
    }
}
