package com.example.aventurasdemarcoyluis.model.characters.principal_characters;

import com.example.aventurasdemarcoyluis.model.characters.enemies.Boo;
import com.example.aventurasdemarcoyluis.model.characters.enemies.Enemy;

/**
 * Class that represents Marcos.
 */
public class Marcos extends AbstractPrincipalCharacter {

    /**
     * Set the statistics of Marcos.
     *
     * @param atk  attack points
     * @param def  defense points
     * @param hp   heal points
     * @param lvl  level of the Unit
     * @param fp  fight points
     */
    public Marcos(int lvl, int atk, int def, int hp, int fp) {
        super(lvl, atk, def, hp, fp);
    }

    @Override
    public void attackedBy(Boo boo) {
        //Boo cannot attack Mario.
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
        if (isKO() || fp.getCurrentPoints() == 0) {
        } else {
            fp.decreasePoints(1);
            character.jumpAttackedBy(this);
        }
    }
}
