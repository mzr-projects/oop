package com.mt.patterns.creational.prototype;

import lombok.extern.slf4j.Slf4j;

/*
 * Creates an instance of an object that maybe expensive or complicated to create otherwise
 * */
@Slf4j
public class PrototypeApp {
    
    static void main() throws CloneNotSupportedException {
        Tree tree1 = new Tree();
        tree1.setSize(10);
        log.info("Size of tree: {}", tree1);

        Tree tree2 = (Tree) tree1.clone();
        tree2.setSize(20);
        log.info("Size of tree: {}", tree2);
    }
}
