package com.mt.patterns.creational.regularFactory;

import com.mt.patterns.creational.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ClassicStore extends Store {

    @Override
    public Table createTable(String tableType) {
        return switch (tableType) {
            case "GameTable" -> new ClassicGameTable();
            case "CoffeeTable" -> new ClassicCoffeeTable("ClassicCoffeeTable");
            default -> null;
        };
    }
}
