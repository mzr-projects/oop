package com.mt.patterns.creational.factory.simepleFactory;

import com.mt.patterns.creational.factory.CoffeeTable;
import com.mt.patterns.creational.factory.GameTable;
import com.mt.patterns.creational.factory.Table;

public class SimpleTableFactory {

    /*
     * This is the creation section of factory pattern
     * */
    public Table createTable(String tableType) {
        if (tableType.equalsIgnoreCase("GameTable")) {
            return new GameTable();
        } else if (tableType.equalsIgnoreCase("CoffeeTable")) {
            return new CoffeeTable();
        } else {
            return null;
        }
    }
}
