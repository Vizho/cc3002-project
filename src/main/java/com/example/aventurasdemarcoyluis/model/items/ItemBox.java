package com.example.aventurasdemarcoyluis.model.items;

import java.util.HashMap;

/**
 * Class that represents an Item Box where items are stored.
 */
public class ItemBox {
    private HashMap<Item, Integer> box = new HashMap<Item, Integer>();

    /**
     * Adds an item if it does not exist in the Box or
     * increase per one his value if it already exists.
     *
     * @param item that is added a unit
     */
    public void add(Item item){
        box.merge(item, 1, Integer::sum);
    }

    /**
     * Allows to use an item added previously in the Box and subtract it.
     *
     * @param item that is used and subtracted.
     */
    public void use(Item item){
        box.replace(item, box.get(item) - 1);
    }

    /**
     * Allows to get the content of the Box.
     *
     * @return the entire Box
     */
    public HashMap<Item, Integer> getBox(){
        return box;
    }
}