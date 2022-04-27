package com.example.aventurasdemarcoyluis.model.characters.enemies;

import com.example.aventurasdemarcoyluis.model.characters.Character;
import com.example.aventurasdemarcoyluis.model.characters.principal_characters.Luis;
import com.example.aventurasdemarcoyluis.model.characters.principal_characters.Marcos;
import com.example.aventurasdemarcoyluis.model.characters.principal_characters.PrincipalCharacter;

/**
 * Class that represent an enemy in game.
 */
public interface Enemy extends Character {

    /**
     * Do an attack against a playable character.
     *
     * @param character player that is going to be attacked
     */
    void attack(PrincipalCharacter character);

    /**
     * Character receives an attack by Marcos with his Hummer.
     * @param marcos who is making the attack
     */
    void hummerAttackedBy(Marcos marcos);

    /**
     * Character receives an attack by Luis with his Hummer.
     * @param luis who is making the attack
     */
    void hummerAttackedBy(Luis luis);

    /**
     * Character receives an attack by Marcos with a Jump.
     * @param marcos who is making the attack
     */
    void jumpAttackedBy(Marcos marcos);

    /**
     * Character receives an attack by Luis with a Jump.
     * @param luis who is making the attack
     */
    void jumpAttackedBy(Luis luis);
}
