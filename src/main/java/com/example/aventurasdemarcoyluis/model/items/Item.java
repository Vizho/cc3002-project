package com.example.aventurasdemarcoyluis.model.items;

import com.example.aventurasdemarcoyluis.model.points.*;

/**
 * Interface that represents the items that can be used by a character.
 */
public interface Item {

    /**
     * Shows how this item affects in hp and fp.
     *
     * @param hp Health points affected by the item
     * @param fp Fight points affected by the item
     */
    void use(HP hp, FP fp);
}
