package com.github.zhalabkevich.car_server.controller;

import com.github.zhalabkevich.car_server.entity.Brand;
import com.github.zhalabkevich.car_server.entity.Car;
import com.github.zhalabkevich.car_server.entity.Model;
import com.github.zhalabkevich.car_server.service.BrandService;
import com.github.zhalabkevich.car_server.service.CarService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    private final CarService carService;
    private final BrandService brandService;

    public CarController(CarService carService, BrandService brandService) {
        this.carService = carService;
        this.brandService = brandService;
    }

    @GetMapping
    public ResponseEntity<List<Car>> getCars() {

        List<Car> cars = carService.getCars();
        return cars != null ? new ResponseEntity<>(cars, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PostMapping("/add")
    public ResponseEntity<Car> addNewCar(@RequestBody Car car) {

        Car newCar = carService.addCar(car);
        return newCar != null ? new ResponseEntity<>(newCar, HttpStatus.CREATED)
                : new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Car> getCarById(@PathVariable Long id) {

        Car car = carService.getCarById(id);
        return car != null ? new ResponseEntity<>(car, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    //   GET api/cars/tenant/{id_car}/ - view the tenant's cars?????

    @GetMapping("/tenant/{id}")
    public ResponseEntity<List<Car>> getCarsByTenantId(@PathVariable Long id) {

        List<Car> cars = carService.getCarsByTenantId(id);
        return cars != null ? new ResponseEntity<>(cars, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }

    @GetMapping("/brands")
    public ResponseEntity<List<Brand>> getBrands() {

        List<Brand> brands = brandService.getBrands();
        return brands != null ? new ResponseEntity<>(brands, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/brands/{id}")
    public ResponseEntity<List<Model>> getBrandModels(@PathVariable Long id) {

        List<Model> models = brandService.getModelsByBrandId(id);
        return models != null ? new ResponseEntity<>(models, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
