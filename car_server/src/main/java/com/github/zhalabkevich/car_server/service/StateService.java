package com.github.zhalabkevich.car_server.service;

import com.github.zhalabkevich.car_server.entity.Car;
import com.github.zhalabkevich.car_server.entity.State;

import java.util.List;

public interface StateService {

    State addStateCarArrived(State state);

    State updateStateCarDeparted(State state);

}
