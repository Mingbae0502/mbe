package com.mb.mbe.controller;

import com.mb.mbe.repository.Hello;
import com.mb.mbe.service.testlelenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class testController {

    @Autowired
    private testlelenService testlelenService;

    @GetMapping("/")
    public String getTest() {
        return "test" + testlelenService.countgido();
    }





}
