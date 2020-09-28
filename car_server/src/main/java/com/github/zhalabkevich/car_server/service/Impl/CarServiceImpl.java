package com.github.zhalabkevich.car_server.service.Impl;

import com.github.zhalabkevich.car_server.entity.Car;
import com.github.zhalabkevich.car_server.entity.State;
import com.github.zhalabkevich.car_server.repository.CarRepository;
import com.github.zhalabkevich.car_server.service.CarService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public List<Car> getCars() {
        return carRepository.findAll();
    }

    @Override
    public Car getCarById(Long id) {
        return carRepository.findById(id).orElse(null);
    }

    @Override
    public List<Car> getCarsByTenantId(long id) {
        return carRepository.findCarsByTenant_Id(id);
    }

    @Override
    public Car addCar(Car car) {
        carRepository.save(car);

        return car;
    }

//    @Override
//    public List<Car> getCarsOnTerritory() {
//        return carRepository.findCarsByStateIsAbsent();
//    }
}
