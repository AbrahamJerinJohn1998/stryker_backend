package com.example.strykerapp_backend.dao;

import com.example.strykerapp_backend.model.Tools;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ToolsDao  extends JpaRepository<Tools,Integer> {

//    @Modifying
//    @Transactional
//    @Query(value = "DELETE FROM `tools` WHERE `id`= :id", nativeQuery = true)
//    void DeleteTools(@Param("id") Integer id);
    @Modifying
    @Transactional
    @Query(value = "UPDATE `tools` SET `flag`=1 WHERE `id`= :id", nativeQuery = true)
    void DeleteTools(@Param("id") Integer id);


    @Query(value = "SELECT `id`, `name`, `category`, `quantity`, `status`, `description`,`flag`, `created_on`, `updated_on` FROM `tools` WHERE `flag`=0 ORDER BY updated_on DESC",nativeQuery = true)
   List<Tools> ViewTools();

    @Modifying
    @Transactional
    @Query(value = "UPDATE `tools` SET `name`=:name,`category`=:category,`quantity`=:quantity,`status`=:status,`description`=:description, `updated_on`=:updated_on WHERE `id`=:id", nativeQuery = true)
    void UpdateTools(@Param("id") int id, @Param("name") String name, @Param("category") String category, @Param("quantity") int quantity,
                     @Param("status") String status, @Param("description") String description,@Param("updated_on") String updated_on);
}

