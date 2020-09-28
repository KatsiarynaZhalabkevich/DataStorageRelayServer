package com.github.zhalabkevich.car_server.repository;

import com.github.zhalabkevich.car_server.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface StateRepository extends JpaRepository<State, Long>, CrudRepository<State, Long> {

}
