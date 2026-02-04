package com.mt.patterns.creational.regularFactory;

import com.mt.patterns.creational.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ModernStore extends Store {

    @Override
    public Table createTable(String tableType) {
        return switch (tableType) {
            case "GameTable" -> new ModernGameTable();
            case "CoffeeTable" -> new ModernCoffeeTable();
            default -> null;
        };
    }
}
