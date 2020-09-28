package com.github.zhalabkevich.car_server.service;

import com.github.zhalabkevich.car_server.entity.Car;
import com.github.zhalabkevich.car_server.entity.State;

import java.util.List;

public interface CarService {

    List<Car> getCars();

    Car getCarById(Long id);

    List<Car> getCarsByTenantId(long id);

    Car addCar(Car car);

//    List<Car> getCarsOnTerritory();
}
