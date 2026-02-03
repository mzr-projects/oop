package com.mt.patterns.structural.flyweight;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/*
* Flyweight contains intrinsic state shared by multiple tree objects
* */
@Slf4j
@AllArgsConstructor
public class TreeType {

    private String kind;
    private String color;

    public void draw(int age, int x, int y) {
        log.info("{} tree color {}, age: {},x: {},y: {}", kind, color, age, x, y);
    }
}
