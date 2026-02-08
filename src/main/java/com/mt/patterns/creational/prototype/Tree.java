package com.mt.patterns.creational.prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
public class Tree implements Cloneable {

    private int size;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Tree tree = null;
        try {
            tree = (Tree) super.clone();
        } catch (CloneNotSupportedException e) {
            log.error(e.getMessage(), e);
        }

        return tree;
    }

    public String toString() {
        return "Three with size: " + size;
    }
}
