package com.mt.patterns.behavioral.template;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ToString
public class Programmer extends Worker {

    @Override
    public void work() {
        log.info("Programmer sleep");
    }

    @Override
    public void relax() {
        log.info("Programmer relax");
    }
}
