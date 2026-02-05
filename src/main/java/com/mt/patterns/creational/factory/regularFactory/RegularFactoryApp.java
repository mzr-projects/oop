package com.mt.patterns.creational.factory.regularFactory;

import com.mt.patterns.creational.factory.Table;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RegularFactoryApp {
    static void main() {
        Table table;

        Store classicStore = new ClassicStore();
        table = classicStore.orderTable("CoffeeTable");
        log.info("Table: {}", table.name);
    }
}
