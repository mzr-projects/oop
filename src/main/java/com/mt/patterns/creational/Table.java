package com.mt.patterns.creational;

public abstract class Table {

    public String name = "Unknown Table";

    public final void makeTable() {
        cut();
        finish();
        test();
        box();
    }

    abstract public void cut();

    abstract public void finish();

    abstract public void test();

    abstract public void box();
}
