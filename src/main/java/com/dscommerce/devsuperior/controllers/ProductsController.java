package com.dscommerce.devsuperior.controllers;

import com.dscommerce.devsuperior.dto.ProductDTO;
import com.dscommerce.devsuperior.entities.Product;
import com.dscommerce.devsuperior.repositories.ProductRepository;
import com.dscommerce.devsuperior.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/products")
public class ProductsController {

    @Autowired
    private ProductService service;

    @GetMapping(value = "/{id}")
    public ProductDTO findBy(@PathVariable Long id){
        return service.findById(id);

    }
    @GetMapping
    public Page<ProductDTO> findAll(Pageable pageable){
        return service.findAll(pageable);

    }
}
