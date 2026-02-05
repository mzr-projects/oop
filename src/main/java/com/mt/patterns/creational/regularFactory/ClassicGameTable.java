package com.mt.patterns.creational.regularFactory;

import com.mt.patterns.creational.Table;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ClassicGameTable extends Table {

    @Override
    public void cut() {
        log.info("Cutting classic game table");
    }

    @Override
    public void finish() {
        log.info("Finishing classic game table");
    }

    @Override
    public void test() {
        log.info("Testing classic game table");
    }

    @Override
    public void box() {
        log.info("Boxing classic game table");
    }

    @Override
    protected void getComponents() {

    }
}
