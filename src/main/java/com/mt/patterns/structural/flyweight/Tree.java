package com.mt.patterns.structural.flyweight;

public class Tree {

    private final int age;
    private final int x;
    private final int y;
    private final TreeType treeType;

    public Tree(int age, int x, int y, String kind, String color) {
        this.age = age;
        this.x = x;
        this.y = y;
        this.treeType = TreeFactory.getTreeType(kind, color);
    }

    public void draw() {
        treeType.draw(age, x, y);
    }
}
