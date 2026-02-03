package com.mt.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {

    private static final Map<String, TreeType> treeTypeMap = new HashMap<>();

    /*
     * Here if we have a flyweight (color+kind), it's not duplicate we store in Map here with
     * color + kind key
     * */
    public static TreeType getTreeType(String color, String kind) {
        String key = color + kind;
        if (!treeTypeMap.containsKey(key)) {
            treeTypeMap.put(key, new TreeType(color, kind));
        }
        return treeTypeMap.get(key);
    }
}
