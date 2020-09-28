package com.github.zhalabkevich.car_server.controller;

import com.github.zhalabkevich.car_server.entity.Car;
import com.github.zhalabkevich.car_server.entity.State;
import com.github.zhalabkevich.car_server.service.CarService;
import com.github.zhalabkevich.car_server.service.StateService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stat")
public class StateController {
    private final StateService stateService;
    private final CarService carService;

    public StateController(StateService stateService, CarService carService) {
        this.stateService = stateService;
        this.carService = carService;
    }

    @GetMapping("/here")
    public ResponseEntity<List<Car>> getCarsOnTerritory() {
        List<Car> cars = null;
                //carService.getCarsOnTerritory();
        return cars != null ? new ResponseEntity<>(cars, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PostMapping("/add")
    public ResponseEntity<State> addCarArrive(@RequestBody State state){
        State newState = stateService.addStateCarArrived(state);
        return newState!=null? new ResponseEntity<>( newState, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @PutMapping("/add")
    public ResponseEntity<State> addCarDeparture(@RequestBody State state){
        State newState = stateService.updateStateCarDeparted(state);
        return newState!=null? new ResponseEntity<>( newState, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }


}
