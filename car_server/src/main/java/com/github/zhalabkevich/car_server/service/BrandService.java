package com.github.zhalabkevich.car_server.service;

import com.github.zhalabkevich.car_server.entity.Brand;
import com.github.zhalabkevich.car_server.entity.Model;

import java.util.List;

public interface BrandService {

  List<Brand> getBrands();
  List<Model> getModelsByBrandId(Long id);

}
