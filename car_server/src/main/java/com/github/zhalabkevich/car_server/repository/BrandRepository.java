package com.github.zhalabkevich.car_server.repository;

import com.github.zhalabkevich.car_server.entity.Brand;
import com.github.zhalabkevich.car_server.entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BrandRepository extends JpaRepository<Brand, Long> {

}
