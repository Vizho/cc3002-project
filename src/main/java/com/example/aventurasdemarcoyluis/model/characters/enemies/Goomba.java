package com.example.aventurasdemarcoyluis.model.characters.enemies;

import com.example.aventurasdemarcoyluis.model.characters.principal_characters.PrincipalCharacter;

/**
 * Class that represents a Goomba.
 */
public class Goomba extends AbstractEnemy {

    /**
     * Creates a new Goomba.
     *
     * @param atk  attack points
     * @param def  defense points
     * @param hp   heal points
     * @param lvl  level of the Unit
     */
    public Goomba(int lvl, int atk, int def, int hp) {
        super(lvl, atk, def, hp);
    }

    @Override
    public void attack(PrincipalCharacter character) {
        if(isKO()){}
        else {
            character.attackedBy(this);
        }
    }
}
