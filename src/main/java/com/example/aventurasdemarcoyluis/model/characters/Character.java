package com.example.aventurasdemarcoyluis.model.characters;

import com.example.aventurasdemarcoyluis.model.characters.enemies.Boo;

/**
 * Interface that represent a character in the game.
 */
public interface Character {

    /**
     * Determines if the character is KO
     *
     * @return True if the character has 0 HP and False if not
     */
    boolean isKO();
}
