package com.mt.patterns.creational.abstractFactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BrassHardware implements Hardware{

    @Override
    public void description() {
      log.info("BrassHardware description");
    }
}
