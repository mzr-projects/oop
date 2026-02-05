package com.mt.patterns.creational.abstractFactory;

import com.mt.patterns.creational.Table;
import com.mt.patterns.creational.regularFactory.ClassicCoffeeTable;
import com.mt.patterns.creational.regularFactory.ClassicGameTable;
import com.mt.patterns.creational.regularFactory.Store;
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
