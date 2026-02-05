package com.mt.patterns.creational.regularFactory;

import com.mt.patterns.creational.Table;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ModernCoffeeTable extends Table {

    @Override
    public void cut() {
        log.info("Cutting modern coffee table");
    }

    @Override
    public void finish() {
        log.info("Finishing modern coffee table");
    }

    @Override
    public void test() {
        log.info("Testing modern coffee table");
    }

    @Override
    public void box() {
        log.info("Boxing modern coffee table");
    }

    @Override
    protected void getComponents() {

    }
}
