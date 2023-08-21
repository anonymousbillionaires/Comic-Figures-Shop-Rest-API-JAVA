package com.comicfiguresshop.restapi.repository;

import com.comicfiguresshop.restapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
