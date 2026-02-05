package com.mt.patterns.creational.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GameTable extends Table {

    @Override
    public void cut() {
        log.info("GameTable Cut");
    }

    @Override
    public void finish() {
        log.info("GameTable Finish");
    }

    @Override
    public void test() {
        log.info("GameTable test");
    }

    @Override
    public void box() {
        log.info("GameTable box");
    }

    @Override
    protected void getComponents() {

    }
}
