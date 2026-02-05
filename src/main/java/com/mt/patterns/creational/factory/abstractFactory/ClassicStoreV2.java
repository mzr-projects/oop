package com.mt.patterns.creational.factory.abstractFactory;

import com.mt.patterns.creational.factory.Table;
import com.mt.patterns.creational.factory.regularFactory.Store;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ClassicStoreV2 extends Store {

    @Override
    public Table createTable(String tableType) {
        TableComponentFactory tableComponentFactory = new ClassicTableComponentFactory();
        return switch (tableType) {
            //case "GameTable" -> new ClassicGameTable();
            case "CoffeeTable" -> new CoffeeTableV2(tableComponentFactory);
            default -> null;
        };
    }
}
