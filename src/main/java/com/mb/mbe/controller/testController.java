package com.mb.mbe.controller;

import com.mb.mbe.entity.Artist;
import com.mb.mbe.service.ArtistService;
import com.mb.mbe.service.DepartmentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class testController {

    @Autowired
    private DepartmentsService departmentsService;

    @Autowired
    private ArtistService artistService;

    @GetMapping("/")
    public String getTest() {
        return departmentsService.countDepartments() + "";
    }

    @GetMapping("/countArtist")
    public int countArtist() {
        return artistService.countArtist();
    }

    @GetMapping("/saveArtist")
    public Artist saveArtist() {
        return artistService.saveArtist();
    }
}
