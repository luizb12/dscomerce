package com.dscommerce.devsuperior.services;

import com.dscommerce.devsuperior.dto.ProductDTO;
import com.dscommerce.devsuperior.entities.Product;
import com.dscommerce.devsuperior.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id){
        Product product = repository.findById(id).get();
        return new ProductDTO(product);

    }


}
