package com.github.zhalabkevich.car_server.service;

import com.github.zhalabkevich.car_server.entity.Tenant;

import java.util.List;

public interface TenantService {

    List<Tenant> getTenants();

    Tenant getTenantById(Long id);

}
