package com.opdevinit.springboot.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.opdevinit.springboot.models.ProductModel;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel,UUID> {


}
