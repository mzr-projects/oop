package com.mt.patterns.creational.regularFactory;

import com.mt.patterns.creational.Table;
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
