package com.dscommerce.devsuperior.dto;

import com.dscommerce.devsuperior.entities.Product;
import jakarta.persistence.Column;

public class ProductDTO {

    private Long id;

    private String name;

    private String description;

    private Double price;

    private String imgUrl;

    public ProductDTO(){

    }

    public ProductDTO(Long id, String imgUrl, Double price, String description, String name) {
        this.id = id;
        this.imgUrl = imgUrl;
        this.price = price;
        this.description = description;
        this.name = name;
    }
    public ProductDTO(Product entity) {
        id = entity.getId();
        imgUrl = entity.getImgUrl();
        price = entity.getPrice();
        description = entity.getDescription();
        name = entity.getName();
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
