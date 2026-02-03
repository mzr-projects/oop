package com.mt.patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Forest {

    private final List<Tree> trees = new ArrayList<>();

    public void addTree(int age, int x, int y, String kind, String color) {
        Tree tree = new Tree(age, x, y, kind, color);
        trees.add(tree);
    }

    public void drawAll() {
        for (Tree tree : trees) {
            tree.draw();
        }
    }
}
