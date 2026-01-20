package com.mt.delegation;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GroceryApp {

    static void main() {
        Grocery grocery = new Grocery();
        Item item1 = new Item("item-1", 10);
        Item item2 = new Item("item-2", 11);
        Item item3 = new Item("item-3", 12);
        grocery.addItem(item1);
        grocery.addItem(item2);
        grocery.addItem(item3);
        log.info(grocery.toString());
    }
}
