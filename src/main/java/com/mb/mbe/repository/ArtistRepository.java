package com.mb.mbe.repository;

import com.mb.mbe.entity.Artist;
import com.mb.mbe.entity.Departments;
import jp.xet.springframework.data.mirage.repository.MirageRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ArtistRepository extends PagingAndSortingRepository<Artist, Long> , MirageRepository<Artist, Long> {
//        extends MirageRepository<Artist, Long> {
//        extends ScannableRepository<Artist, Long>
//        , BatchReadableRepository<Artist, Long>
//        , BatchWritableRepository<Artist, Long> {
    int countArtist();

    int testnhe();
}
