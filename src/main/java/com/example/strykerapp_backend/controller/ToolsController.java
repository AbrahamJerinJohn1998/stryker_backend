package com.example.strykerapp_backend.controller;
import com.example.strykerapp_backend.dao.ToolsDao;
import com.example.strykerapp_backend.model.Tools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
public class ToolsController {
    @Autowired
    private ToolsDao dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addPowerTools", consumes = "application/json",produces = "application/json")
    public Map<String,String> addTools(@RequestBody Tools s)
    {
        System.out.println(s.getName().toString());
        System.out.println(s.getCategory().toString());
        System.out.println(s.getStatus().toString());
        System.out.println(s.getQuantity());
        System.out.println(s.getDescription().toString());
        s.setCreated_on(String.valueOf(java.time.LocalDateTime.now()));
        s.setUpdated_on(String.valueOf(java.time.LocalDateTime.now()));
        dao.save(s);
        HashMap<String,String> map=new HashMap<>();
        map.put("status","Tool added successfully ");
        return map;
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewPowerTools")
    public List<Tools> viewTools() {
        return (List<Tools>) dao.ViewTools();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/deletePowerTools",consumes = "application/json",produces = "application/json")
    public Map<String,String> DeleteTools(@RequestBody Tools s)
    {
        String id=String.valueOf(s.getId());
        System.out.println(id);
        dao.DeleteTools(s.getId());
        HashMap<String,String> map=new HashMap<>();
        map.put("status","Tool deleted successfully");
        return map;

    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/updatePowerTools",produces = "application/json",consumes = "application/json")
    public HashMap<String,String> UpdateTools(@RequestBody Tools e)
    {
        String id=String.valueOf(e.getId());
        String name=String.valueOf(e.getName().toString());
        String category=String.valueOf(e.getCategory().toString());
        int quantity=e.getQuantity();
        String status=String.valueOf(e.getStatus().toString());
        String description=String.valueOf(e.getDescription().toString());
        dao.UpdateTools(e.getId(),e.getName(),e.getCategory(),e.getQuantity(),e.getStatus(),e.getDescription(),String.valueOf(java.time.LocalDateTime.now()));
        HashMap<String,String> map=new HashMap<>();

        map.put("status","Tool details updated successfully");

        return map;
    }
}
