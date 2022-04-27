package com.example.aventurasdemarcoyluis.model.items;

import com.example.aventurasdemarcoyluis.model.points.*;

/**
 * Class that represents Red Mushroom
 */
public class RedMushroom extends AbstractItem {
    @Override
    public void use(HP hp, FP fp) {
        hp.increasePoints(
                (int) Math.round(hp.getMaxPoints() * 0.1)
        );
    }
}
