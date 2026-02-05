package com.mt.patterns.creational.regularFactory;

import com.mt.patterns.creational.Table;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ClassicCoffeeTable extends Table {

    public ClassicCoffeeTable(String name) {
        this.name = name;
    }

    @Override
    public void cut() {
        log.info("Cutting classic coffee table");
    }

    @Override
    public void finish() {
        log.info("Finishing classic coffee table");
    }

    @Override
    public void test() {
        log.info("Testing classic coffee table");
    }

    @Override
    public void box() {
        log.info("Boxing classic coffee table");
    }

    @Override
    protected void getComponents() {

    }
}
