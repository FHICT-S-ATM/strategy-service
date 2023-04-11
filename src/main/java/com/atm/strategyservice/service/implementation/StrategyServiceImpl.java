package com.atm.strategyservice.service.implementation;

import com.atm.strategyservice.entity.Strategy;
import com.atm.strategyservice.repository.StrategyRepository;
import com.atm.strategyservice.service.StrategyService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StrategyServiceImpl implements StrategyService {

    private final StrategyRepository strategyRepository;

    public StrategyServiceImpl(StrategyRepository strategyRepository) {
        this.strategyRepository = strategyRepository;
    }

    @Override
    public List<Strategy> findAllStrategies() {
        return strategyRepository.findAll();
    }

    @Override
    public Optional<Strategy> findById(Long id) {
        return strategyRepository.findById(id);
    }

    @Override
    public Strategy saveStrategy(Strategy strategy) {
        return strategyRepository.save(strategy);
    }

    @Override
    public Strategy updateStrategy(Strategy strategy) {
        return strategyRepository.save(strategy);
    }

    @Override
    public void deleteStrategy(Long id) {
        strategyRepository.deleteById(id);
    }
}
