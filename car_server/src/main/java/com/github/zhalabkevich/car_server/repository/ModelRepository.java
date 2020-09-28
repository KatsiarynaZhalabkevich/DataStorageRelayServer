package com.github.zhalabkevich.car_server.repository;

import com.github.zhalabkevich.car_server.entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import java.util.List;

public interface ModelRepository extends JpaRepository<Model, Long> {

    List<Model> findModelsByBrand_Id(Long id);
}
