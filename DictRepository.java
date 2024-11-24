package com.nkl.datadictapplication.repository;

import com.nkl.datadictapplication.dto.Dict;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;


/* repository relies on entity for the table */

public interface DictRepository extends JpaRepository<Dict, String> {
    @Transactional
    @Modifying
    @Query("update Dict u set u.data_source=?2 where u.id=?1" )
    int updateAddress(String id );

}

