package com.mt.patterns.creational.factory.abstractFactory;

public class ClassicTableComponentFactory extends TableComponentFactory {

    public ClassicTableComponentFactory() {
        kitName = "ClassicTable";
    }

    public Surface createSurface() {
        return new FeltSurface();
    }

    public WoodParts createWoodParts() {
        return new OakWoodParts();
    }

    @Override
    public Hardware createHardware() {
        return new BrassHardware();
    }
}
