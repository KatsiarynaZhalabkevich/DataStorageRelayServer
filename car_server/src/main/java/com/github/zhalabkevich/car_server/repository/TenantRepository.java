package com.github.zhalabkevich.car_server.repository;

import com.github.zhalabkevich.car_server.entity.Tenant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TenantRepository extends JpaRepository<Tenant, Long> {
}
