package com.mt.patterns.creational.abstractFactory;

import com.mt.patterns.creational.Table;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CoffeeTableV2 extends Table {

    protected TableComponentFactory tableComponentFactory;

    public CoffeeTableV2(TableComponentFactory tableComponentFactory) {
        this.tableComponentFactory = tableComponentFactory;
        this.name = tableComponentFactory.kitName + " CoffeeTableV2";
    }

    @Override
    public void cut() {
        log.info("CoffeeTable cut");
    }

    @Override
    public void finish() {
        log.info("CoffeeTable finish");
    }

    @Override
    public void test() {
        log.info("CoffeeTable test");
    }

    @Override
    public void box() {
        log.info("CoffeeTable box");
    }

    @Override
    protected void getComponents() {
        surface = tableComponentFactory.createSurface();
        woodParts = tableComponentFactory.createWoodParts();
        hardware = tableComponentFactory.createHardware();
    }
}
