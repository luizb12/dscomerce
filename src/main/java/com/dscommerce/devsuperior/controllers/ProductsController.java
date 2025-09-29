package com.dscommerce.devsuperior.controllers;

import com.dscommerce.devsuperior.dto.ProductDTO;
import com.dscommerce.devsuperior.entities.Product;
import com.dscommerce.devsuperior.repositories.ProductRepository;
import com.dscommerce.devsuperior.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/products")
public class ProductsController {

    @Autowired
    private ProductService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<ProductDTO> findBy(@PathVariable Long id){
       ProductDTO dto = service.findById(id);
        return ResponseEntity.ok(dto);

    }
    @GetMapping
    public ResponseEntity<Page<ProductDTO>> findAll(Pageable pageable){
       Page<ProductDTO> dto = service.findAll(pageable);
        return ResponseEntity.ok(dto);

    }

    @PostMapping
    public ResponseEntity<ProductDTO> insert (@RequestBody ProductDTO dto){
        ProductDTO criar = service.insert(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(criar);

    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<ProductDTO> update(@PathVariable Long id, @RequestBody ProductDTO dto){
         dto = service.update(id, dto);
        return ResponseEntity.ok(dto);

    }

}
