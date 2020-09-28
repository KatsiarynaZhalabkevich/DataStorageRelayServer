package com.github.zhalabkevich.car_server.service.Impl;

import com.github.zhalabkevich.car_server.entity.Car;
import com.github.zhalabkevich.car_server.entity.State;
import com.github.zhalabkevich.car_server.repository.StateRepository;
import com.github.zhalabkevich.car_server.service.StateService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StateServiceImpl implements StateService {
    private final StateRepository stateRepository;

    public StateServiceImpl(StateRepository stateRepository) {
        this.stateRepository = stateRepository;
    }


    @Override
    public State addStateCarArrived(State state) {
        //проверка есть ли такая машина и всех данных
        return stateRepository.save(state);

    }

    @Override
    public State updateStateCarDeparted(State state) {
        return stateRepository.save(state);

    }
}
