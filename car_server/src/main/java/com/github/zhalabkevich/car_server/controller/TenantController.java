package com.github.zhalabkevich.car_server.controller;

import com.github.zhalabkevich.car_server.entity.Tenant;
import com.github.zhalabkevich.car_server.service.TenantService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseCookie;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tenant")
public class TenantController {
    private final TenantService tenantService;

    public TenantController(TenantService tenantService) {
        this.tenantService = tenantService;
    }

    @GetMapping
    public ResponseEntity<List<Tenant>> getTenants(){
        List<Tenant> tenants = tenantService.getTenants();
        return tenants!=null? new ResponseEntity<>(tenants, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }

    @GetMapping("/{id}")
    public ResponseEntity<Tenant> getTenantById(@PathVariable Long id){
        Tenant tenant = tenantService.getTenantById(id);
        return tenant!=null? new ResponseEntity<>(tenant, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }


}
