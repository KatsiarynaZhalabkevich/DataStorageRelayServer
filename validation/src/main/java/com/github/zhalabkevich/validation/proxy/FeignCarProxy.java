package com.github.zhalabkevich.validation.proxy;

import com.github.zhalabkevich.validation.model.*;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "car-server", url = "localhost:8000")
@RequestMapping("/api")
public interface FeignCarProxy {
    @GetMapping("/cars")
    ResponseEntity<List<Car>> getCars();

    @GetMapping("/cars/{id}")
    ResponseEntity<Car> getCarById(@PathVariable Long id);

    @GetMapping("/cars/tenant/{id}")
    ResponseEntity<List<Car>> getCarsByTenantId(@PathVariable Long id);

    @GetMapping("/cars/brands")
    ResponseEntity<List<Brand>> getBrands();

    @GetMapping("/cars/brands/{id}")
    ResponseEntity<List<Model>> getBrandModels(@PathVariable Long id);

    @GetMapping("/tenant")
    ResponseEntity<List<Tenant>> getTenants();

    @GetMapping("/tenant/{id}")
    ResponseEntity<Tenant> getTenantById(@PathVariable Long id);


    @GetMapping("/stat/here")
    ResponseEntity<List<Car>> getCarsOnTerritory();

    @PostMapping("/stat/add")
    ResponseEntity<State> addCarArrive(@RequestBody State state);

    @PutMapping("/stat/add")
    ResponseEntity<State> addCarDeparture(@RequestBody State state);
}