package com.mt.patterns.creational.factory.regularFactory;

import com.mt.patterns.creational.factory.Table;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ModernGameTable extends Table {

    @Override
    public void cut() {
        log.info("Cutting modern game table");
    }

    @Override
    public void finish() {
        log.info("Finishing modern game table");
    }

    @Override
    public void test() {
        log.info("Testing modern game table");
    }

    @Override
    public void box() {
        log.info("Boxing modern game table");
    }

    @Override
    protected void getComponents() {

    }
}
