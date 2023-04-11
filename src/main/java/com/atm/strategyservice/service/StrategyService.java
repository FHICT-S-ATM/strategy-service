package com.atm.strategyservice.service;

import com.atm.strategyservice.entity.Strategy;

import java.util.List;
import java.util.Optional;

public interface StrategyService {
    List<Strategy> findAllStrategies();
    Optional<Strategy> findById(Long id);

    Strategy saveStrategy(Strategy strategy);

    Strategy updateStrategy(Strategy strategy);

    void deleteStrategy(Long id);


}
