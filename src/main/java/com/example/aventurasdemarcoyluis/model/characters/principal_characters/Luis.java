package com.example.aventurasdemarcoyluis.model.characters.principal_characters;

import com.example.aventurasdemarcoyluis.model.characters.enemies.Enemy;

/**
 * Class that represents Luis.
 */
public class Luis extends AbstractPrincipalCharacter {

    /**
     * Set the statistics of Luis.
     *
     * @param atk  attack points
     * @param def  defense points
     * @param hp   heal points
     * @param lvl  level of the Unit
     * @param fp  fight points
     */
    public Luis(int lvl, int atk, int def, int hp, int fp) {
        super(lvl, atk, def, hp, fp);
    }

    @Override
    public void attackWithHummer(Enemy character) {
        if(isKO() || fp.getCurrentPoints()== 0){}
        else {
            fp.decreasePoints(2);
            character.hummerAttackedBy(this);
        }
    }

    @Override
    public void attackWithJump(Enemy character) {
        if(isKO() || fp.getCurrentPoints()== 0){}
        else {
            fp.decreasePoints(1);
            character.jumpAttackedBy(this);
        }
    }
}
