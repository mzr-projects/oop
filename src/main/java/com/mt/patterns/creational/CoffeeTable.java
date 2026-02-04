package com.mt.patterns.creational;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CoffeeTable extends Table {

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
}
