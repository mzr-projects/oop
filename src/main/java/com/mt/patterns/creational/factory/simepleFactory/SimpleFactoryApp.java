package com.mt.patterns.creational.factory.simepleFactory;

import com.mt.patterns.creational.factory.Table;

public class SimpleFactoryApp {

    static void main() {
        TableStore tableStore = new TableStore(new SimpleTableFactory());
        Table table = tableStore.orderTable("CoffeeTable");
    }
}
