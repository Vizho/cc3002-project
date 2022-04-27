package com.example.aventurasdemarcoyluis.model.characters.enemies;

import com.example.aventurasdemarcoyluis.model.characters.principal_characters.Luis;
import com.example.aventurasdemarcoyluis.model.characters.principal_characters.Marcos;
import com.example.aventurasdemarcoyluis.model.characters.principal_characters.PrincipalCharacter;

/**
 * Class that represent a Boo.
 */
public class Boo extends AbstractEnemy {

    /**
     * Creates a new Boo.
     *
     * @param atk  attack points
     * @param def  defense points
     * @param hp   heal points
     * @param lvl  level of the Unit
     */
    public Boo(int lvl, int atk, int def, int hp) {
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
    public void hummerAttackedBy(Marcos marcos) {
        //Boo dodges hummers.
    }

    @Override
    public void hummerAttackedBy(Luis luis) {
        //Boo dodges hummers.
    }

    @Override
    public void jumpAttackedBy(Luis luis) {
        //Luis cannot attack Boo.
    }
}
