package com.josueao.cache.repository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j // Lombok - injetor de log
public class ProductRepository {

    public String listAll() {

        log.info("m=ProductRepository, m=listAll");
        return "Produto";
    }
}
