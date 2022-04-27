package com.example.aventurasdemarcoyluis.model.items;

import com.example.aventurasdemarcoyluis.model.points.*;

/**
 * Class that represents Honey Syrup
 */
public class HoneySyrup extends AbstractItem {
    @Override
    public void use(HP hp, FP fp) {
        fp.increasePoints(3);

    }
}
