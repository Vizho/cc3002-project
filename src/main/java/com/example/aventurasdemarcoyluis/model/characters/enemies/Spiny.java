package com.example.aventurasdemarcoyluis.model.characters.enemies;

import com.example.aventurasdemarcoyluis.model.characters.principal_characters.Luis;
import com.example.aventurasdemarcoyluis.model.characters.principal_characters.Marcos;
import com.example.aventurasdemarcoyluis.model.characters.principal_characters.PrincipalCharacter;

/**
 * Class that represents a Spiny.
 */
public class Spiny extends AbstractEnemy {

    /**
     * Creates a new Spiny.
     *
     * @param atk  attack points
     * @param def  defense points
     * @param hp   heal points
     * @param lvl  level of the Unit
     */
    public Spiny(int lvl, int atk, int def, int hp) {
        super(lvl, atk, def, hp);
    }

    @Override
    public void attack(PrincipalCharacter character) {
        if(isKO()){}
        else {
            character.attackedBy(this);
        }
    }

    @Override
    public void jumpAttackedBy(Marcos marcos) {
        marcos.hp.decreasePoints((int)(hp.getMaxPoints() * 0.05));
    }

    @Override
    public void jumpAttackedBy(Luis luis) {
        luis.hp.decreasePoints((int)(hp.getMaxPoints() * 0.05));
    }
}
