package com.github.zhalabkevich.car_server.service.Impl;

import com.github.zhalabkevich.car_server.entity.Brand;
import com.github.zhalabkevich.car_server.entity.Model;
import com.github.zhalabkevich.car_server.repository.BrandRepository;
import com.github.zhalabkevich.car_server.repository.ModelRepository;
import com.github.zhalabkevich.car_server.service.BrandService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BrandServiceImpl implements BrandService {
    private final BrandRepository brandRepository;
    private final ModelRepository modelRepository;

    public BrandServiceImpl(BrandRepository brandRepository, ModelRepository modelRepository) {
        this.brandRepository = brandRepository;
        this.modelRepository = modelRepository;
    }

    @Override
    public List<Brand> getBrands() {
        return brandRepository.findAll();
    }

    @Override
    public List<Model> getModelsByBrandId(Long id) {
        return modelRepository.findModelsByBrand_Id(id);
    }
}
