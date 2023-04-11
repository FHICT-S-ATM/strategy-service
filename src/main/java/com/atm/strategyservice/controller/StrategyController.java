package com.atm.strategyservice.controller;

import com.atm.strategyservice.entity.Strategy;
import com.atm.strategyservice.service.StrategyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/strategy")
public class StrategyController {
    private final StrategyService strategyService;

    public StrategyController(StrategyService strategyService) {
        this.strategyService = strategyService;
    }

    @GetMapping
    public List<Strategy> findAllStratgies() {
        return strategyService.findAllStrategies();
    }
    @GetMapping("/{id}")
    public Optional<Strategy> findStrategyById(@PathVariable("id") Long id) {
        return strategyService.findById(id);
    }

    @PostMapping
    public Strategy saveStrategy(@RequestBody Strategy strategy) {
        return strategyService.saveStrategy(strategy);
    }

    @PostMapping
    public Strategy updateStrategy(@RequestBody Strategy strategy) {
        return strategyService.updateStrategy(strategy);
    }

    @DeleteMapping
    public void deleteStrategy(@PathVariable("id") Long id) {
        strategyService.deleteStrategy(id);
    }

}
