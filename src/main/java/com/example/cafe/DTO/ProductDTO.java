package com.example.cafe.DTO;

import java.util.Date;

public class ProductDTO {

    Integer id;
    String name;
    String description;
    Integer price;
    String status;
    Date createdDate;
    Integer categoryId;
    String categoryName;

    String quantity_product;

    public ProductDTO() {

    }

    public ProductDTO(Integer id, String name, String description, Integer price, String status, Integer categoryId, String categoryName, Date createdDate,String quantity_product) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.status = status;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.createdDate = createdDate;
        this.quantity_product = quantity_product;
    }

    public ProductDTO(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public ProductDTO(Integer id, String name, String description, Integer price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getQuantity_product() {
        return quantity_product;
    }

    public void setQuantity_product(String quantity_product) {
        this.quantity_product = quantity_product;
    }
}
