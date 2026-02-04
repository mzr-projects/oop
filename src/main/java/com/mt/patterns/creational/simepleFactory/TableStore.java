package com.mt.patterns.creational.simepleFactory;

import com.mt.patterns.creational.Table;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TableStore {

    private final SimpleTableFactory simpleTableFactory;

    /*
    * This is the preparation section of factory pattern
    * */
    public Table orderTable(String tableType) {
        Table table = simpleTableFactory.createTable(tableType);
        table.cut();
        table.finish();
        table.test();
        table.box();
        return table;
    }
}
