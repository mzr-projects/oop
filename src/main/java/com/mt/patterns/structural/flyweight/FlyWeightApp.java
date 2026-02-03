package com.mt.patterns.structural.flyweight;

/*
 * Flyweight is suggested when a single instance of a class cloud represent many virtual "instances"
 * */
public class FlyWeightApp {

    static void main() {
        Forest forest = new Forest();
        forest.addTree(8, 35, 234, "Pine", "Red");
        forest.addTree(14, 24, 235, "Oak", "Green");
        forest.addTree(20, 54, 236, "Oak", "Green");
        forest.addTree(12, 35, 237, "Pine", "Red");
        forest.addTree(10, 76, 238, "Pine", "Red");

        forest.drawAll();
    }
}
