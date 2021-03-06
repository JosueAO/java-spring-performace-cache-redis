package com.josueao.cache.resource;

import com.josueao.cache.entity.Product;
import com.josueao.cache.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor // Lombok
@Slf4j // Lombok - injetor de log
public class ProductResource {

    private final ProductService productService;

    @GetMapping("/")
    public List<Product> listAll() {
        log.info("m=ProductResource, m=listAll");
        return productService.listAll();
    }
}
