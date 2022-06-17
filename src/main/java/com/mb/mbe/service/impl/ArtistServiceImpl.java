package com.mb.mbe.service.impl;

import com.mb.mbe.entity.Artist;
import com.mb.mbe.repository.ArtistRepository;
import com.mb.mbe.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ArtistServiceImpl implements ArtistService {

    @Autowired
    private ArtistRepository artistRepository;

    @Override
    public int countArtist() {

        artistRepository.testnhe();

        return artistRepository.countArtist();
    }

    @Override
    public Artist saveArtist() {

        Artist mingbae = new Artist();
        mingbae.setArtistId(1L);
        mingbae.setFullName("tt");
        mingbae.setNickName("tt");
        mingbae.setSpecialization("tt");
        mingbae.setStageName("tt");

        return artistRepository.save(mingbae);
    }
}
