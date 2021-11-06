package com.josueao.cache.service;

import com.josueao.cache.entity.Product;
import com.josueao.cache.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j // Lombok - injetor de log
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> listAll() {
        log.info("m=ProductService, m=listAll");
        return productRepository.listAll();
    }
}
