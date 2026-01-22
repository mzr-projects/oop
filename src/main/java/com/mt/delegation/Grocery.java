package com.mt.delegation;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class Grocery {

    /*
     * This is composition Grocery Has-A list of items, here we also hide the type of List from user
     * We are using ArrayList without making the user to decide which implementation he should use.
     * */
    private List<Item> itemList;

    public Grocery() {
        itemList = new ArrayList<>();
    }

    public void addItem(Item item) {
        itemList.add(item);
    }
}
