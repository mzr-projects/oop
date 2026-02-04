package com.mt.patterns.creational.regularFactory;

import com.mt.patterns.creational.Table;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Store {

    public abstract Table createTable(String tableType);

    public Table orderTable(String tableType) {
        Table table = createTable(tableType);
        if (table != null) {
            log.info("Creating table for table type: {}", tableType);
        } else {
            log.info("Creating table for table type: {} not supported", tableType);
        }
        return table;
    }
}
