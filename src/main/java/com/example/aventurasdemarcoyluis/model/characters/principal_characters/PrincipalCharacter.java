package com.example.aventurasdemarcoyluis.model.characters.principal_characters;

import com.example.aventurasdemarcoyluis.model.characters.Character;
import com.example.aventurasdemarcoyluis.model.characters.enemies.*;
import com.example.aventurasdemarcoyluis.model.items.Item;
import com.example.aventurasdemarcoyluis.model.items.ItemBox;
import org.jetbrains.annotations.NotNull;

/**
 * Interface that represent a playable character in the game.
 */
public interface PrincipalCharacter extends Character {

    /**
     * Allows a player to use an item.
     * This cannot be used without an item.
     *
     * @param item which is used by the player
     */
    void useItem(@NotNull Item item, ItemBox box);

    /**
     * Do an attack with Hummer against an enemy.
     *
     * @param character enemy that is going to be attacked
     */
    void attackWithHummer(Enemy character);

    /**
     * Do an attack with Jump against an enemy.
     *
     * @param character enemy that is going to be attacked
     */
    void attackWithJump(Enemy character);

    /**
     * All that is changed by a level up.
     * @param box which store the items given
     */
    void levelUp(ItemBox box);

    /**
     * Character receives an attack by Boo.
     * @param boo who is making the attack
     */
    void attackedBy(Boo boo);

    /**
     * Character receives an attack by Spiny.
     * @param spiny who is making the attack
     */
    void attackedBy(Spiny spiny);

    /**
     * Character receives an attack by Goomba.
     * @param goomba who is making the attack
     */
    void attackedBy(Goomba goomba);
}
