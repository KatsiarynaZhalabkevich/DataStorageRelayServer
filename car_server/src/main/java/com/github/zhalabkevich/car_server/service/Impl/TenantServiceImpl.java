package com.github.zhalabkevich.car_server.service.Impl;

import com.github.zhalabkevich.car_server.entity.Tenant;
import com.github.zhalabkevich.car_server.repository.TenantRepository;
import com.github.zhalabkevich.car_server.service.TenantService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TenantServiceImpl implements TenantService {
    private final TenantRepository tenantRepository;

    public TenantServiceImpl(TenantRepository tenantRepository) {
        this.tenantRepository = tenantRepository;
    }

    @Override
    public List<Tenant> getTenants() {
        return tenantRepository.findAll();
    }

    @Override
    public Tenant getTenantById(Long id) {
        return tenantRepository.findById(id).orElse(null);
    }
}
