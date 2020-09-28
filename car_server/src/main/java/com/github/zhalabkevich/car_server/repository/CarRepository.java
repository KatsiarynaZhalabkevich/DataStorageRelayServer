package com.github.zhalabkevich.car_server.repository;

import com.github.zhalabkevich.car_server.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car,Long> {
    List<Car> findCarsByTenant_Id(Long id);
//    @Modifying
//    @Query("select Car from Car join State on Car.state.id=State.id where State.isAbsent=false ")
//    List<Car> findCarsByStateIsAbsent();
}
