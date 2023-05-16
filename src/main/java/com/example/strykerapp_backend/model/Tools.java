package com.example.strykerapp_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tools")
public class Tools {
    @Id
    @GeneratedValue
    private int serialNo;
    private String name;
    private String category;
    private int  quantity;
    private String status;
    private String description;

    public Tools() {
    }

    public Tools(int serialNo, String name, String category, int quantity, String status, String description) {
        this.serialNo = serialNo;
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.status = status;
        this.description = description;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
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
