package com.example.strykerapp_backend.controller;

import com.example.strykerapp_backend.model.Tools;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToolsController {

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addTools", consumes = "application/json",produces = "application/json")
    public Map<String,String> addStudents(@RequestBody Tools s)
    {

        System.out.println(s.getName().toString());
        System.out.println(s.getCategory().toString());
        System.out.println(s.getStatus().toString());
        System.out.println(s.getQuantity());
        System.out.println(s.getDescription().toString());
        dao.save(s);
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Tools> viewTools()
    {
        return (List<Tools>) dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/delete",consumes = "application/json",produces = "application/json")
    public Map<String,String> DeleteTools(@RequestBody Tools s)
    {
        String id=String.valueOf(s.getSerialNo());
        System.out.println(id);
        dao.DeleteStudent(s.getSerialNo());
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;

    }
}
