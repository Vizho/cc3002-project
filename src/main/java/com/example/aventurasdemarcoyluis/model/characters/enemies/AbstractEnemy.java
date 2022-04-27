package com.example.aventurasdemarcoyluis.model.characters.enemies;

import com.example.aventurasdemarcoyluis.model.characters.AbstractCharacter;
import com.example.aventurasdemarcoyluis.model.characters.principal_characters.Luis;
import com.example.aventurasdemarcoyluis.model.characters.principal_characters.Marcos;
import java.util.Random;

/**
 * Class that represent an enemy in game.
 */
public abstract class AbstractEnemy
        extends AbstractCharacter
        implements Enemy {

    /**
     * creates a new enemy.
     *
     * @param lvl level of the character
     * @param atk attack points
     * @param def defense points
     * @param hp health points
     */
    public AbstractEnemy(int lvl, int atk, int def, int hp) {
        super(lvl, atk, def, hp);
    }

    @Override
    public void hummerAttackedBy(Marcos marcos) {
        Random random = new Random();
        if(75 >= (1 + random.nextInt(100))){
            hp.decreasePoints((int) (1.5 * marcos.getAtk() * marcos.getLvl() / getDef()));
        }
    }

    @Override
    public void hummerAttackedBy(Luis luis) {
        Random random = new Random();
        if(75 >= (1 + random.nextInt(100))){
            hp.decreasePoints((int) (1.5 * luis.getAtk() * luis.getLvl() / getDef()));
        }
    }

    @Override
    public void jumpAttackedBy(Marcos marcos) {
        hp.decreasePoints(marcos.getAtk() * marcos.getLvl() / getDef());
    }

    @Override
    public void jumpAttackedBy(Luis luis) {
        hp.decreasePoints(luis.getAtk() * luis.getLvl() / getDef());
    }
}