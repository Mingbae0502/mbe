package com.mb.mbe.repository;

import com.mb.mbe.entity.Departments;
import jp.xet.springframework.data.mirage.repository.MirageRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface DeparmentsRepository
        extends PagingAndSortingRepository<Departments, Long>, MirageRepository<Departments, Long> {
//        extends MirageRepository<Departments, Long> {
//        extends ScannableRepository<Departments, Long>
//        , BatchReadableRepository<Departments, Long>
//        , BatchWritableRepository<Departments, Long> {
}
