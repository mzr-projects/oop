package com.mt.patterns.creational.singleton;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SingletonV3 {

    /*
     * Eager initialization
     * */
    private static final Table instance = new Table();

    private SingletonV3() {

    }

    /*
     * Solving the multi-threading issues
     * */
    public static synchronized Table getInstance() {
        return instance;
    }
}
