package com.mt.patterns.creational.abstractFactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OakWoodParts implements WoodParts {

    @Override
    public void description() {
        log.info("OakWoodParts description");
    }
}
