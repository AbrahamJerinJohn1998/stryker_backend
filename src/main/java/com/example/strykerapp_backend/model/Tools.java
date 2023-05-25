package com.example.strykerapp_backend.model;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name = "tools")
public class Tools {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String category;
    private int  quantity;
    private String status;
    private String description;
    @Column(name = "created_on")
    private String created_on;

    private String updated_on;

    private int flag;
    @Transient
    private  int requestCount;

    public Tools() {
    }


    public Tools(int id, String name, String category, int quantity, String status, String description, String created_on, String updated_on, int flag, int requestCount) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.status = status;
        this.description = description;
        this.created_on = created_on;
        this.updated_on = updated_on;
        this.flag = flag;
        this.requestCount = requestCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreated_on() {
        return created_on;
    }

    public void setCreated_on(String created_on) {
        this.created_on = created_on;
    }

    public String getUpdated_on() {
        return updated_on;
    }

    public void setUpdated_on(String updated_on) {
        this.updated_on = updated_on;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public int getRequestCount() {
        return requestCount;
    }

    public void setRequestCount(int requestCount) {
        this.requestCount = requestCount;
    }
}
