package com.example.strykerapp_backend.model;

import jakarta.persistence.*;

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

    public Tools() {
    }

    public Tools(int id, String name, String category, int quantity, String status, String description) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.status = status;
        this.description = description;
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
}
