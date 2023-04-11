package com.atm.strategyservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "strategy")
@NoArgsConstructor
@AllArgsConstructor
public class Strategy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "strategy_id")
    public Long id;

    @Column(name = "strategy_name")
    public String name;

    @Column(name = "strategy")
    public String importedStrategy;

    @Column(name = "date_strategy_imported")
    public Date dateImported;

    public Strategy(String name, String importedStrategy, Date dateImported) {
        this.name = name;
        this.importedStrategy = importedStrategy;
        this.dateImported = dateImported;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImportedStrategy() {
        return importedStrategy;
    }

    public void setImportedStrategy(String importedStrategy) {
        this.importedStrategy = importedStrategy;
    }

    public Date getDateImported() {
        return dateImported;
    }

    public void setDateImported(Date dateImported) {
        this.dateImported = dateImported;
    }
}
