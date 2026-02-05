package com.mt.patterns.creational.factory;

import com.mt.patterns.creational.factory.abstractFactory.Hardware;
import com.mt.patterns.creational.factory.abstractFactory.Surface;
import com.mt.patterns.creational.factory.abstractFactory.WoodParts;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Table {

    public String name = "Unknown Table";
    protected Surface surface;
    protected WoodParts woodParts;
    protected Hardware hardware;

    public final void makeTable() {
        getComponents();
        listComponents();
        cut();
        finish();
        test();
        box();
    }

    public void listComponents() {
        surface.description();
        woodParts.description();
        hardware.description();
    }

    abstract public void cut();

    abstract public void finish();

    abstract public void test();

    abstract public void box();

    protected abstract void getComponents();
}
