package com.mt.patterns.creational.simepleFactory;

import com.mt.patterns.creational.Table;

public class SimpleFactoryApp {

    static void main() {
        TableStore tableStore = new TableStore(new SimpleTableFactory());
        Table table = tableStore.orderTable("CoffeeTable");
    }
}
