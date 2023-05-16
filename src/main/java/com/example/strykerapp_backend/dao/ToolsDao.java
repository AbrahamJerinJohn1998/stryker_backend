package com.example.strykerapp_backend.dao;

import com.example.strykerapp_backend.model.Tools;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ToolsDao  extends CrudRepository<Tools,Integer> {

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `tools` WHERE `id`= :id",nativeQuery = true)
    void DeleteTools(@Param("id") Integer id);
}
