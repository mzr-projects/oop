package com.mt.patterns.creational.factory.abstractFactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class TableComponentFactory {

    public String kitName;

    public Surface createSurface() {
        log.info("Creating surface");
        return null;
    }

    public WoodParts createWoodParts() {
        log.info("Creating wood parts");
        return null;
    }

    public Hardware createHardware() {
        log.info("Creating hardware");
        return null;
    }
}
