package com.example.aventurasdemarcoyluis.model.characters;

import com.example.aventurasdemarcoyluis.model.points.HP;

/**
 * Class that represent a character in the game.
 */
public abstract class AbstractCharacter implements Character {
    public final HP hp;
    private int lvl;
    private int atk;
    private int def;

    /**
     * Creates a new character.
     *
     * @param atk attack points
     * @param def defense points
     * @param hp  health points
     * @param lvl level of the character
     */
    public AbstractCharacter(int lvl, int atk, int def, int hp) {
        this.lvl = lvl;
        this.atk = atk;
        this.def = def;
        this.hp = new HP(hp);
    }

    /**
     * It works to get the level of the character.
     *
     * @return value of Level
     */
    public int getLvl() {
        return lvl;
    }

    /**
     * Sets the Level of the character
     *
     * @param lvl The new level of the character
     */
    protected void setLvl(int lvl) {
        this.lvl = lvl;
    }

    /**
     * It works to get Attack Points of the character.
     *
     * @return value of Attack
     */
    public int getAtk() {
        return atk;
    }

    /**
     * Sets the Attack Points of the character
     *
     * @param atk The new value of attack of the character
     */
    protected void setAtk(int atk) {
        this.atk = atk;
    }

    /**
     * It works to get Defense Points of the character.
     *
     * @return value of Defense
     */
    protected int getDef() {
        return def;
    }

    /**
     * Sets the Defense Points of the character
     *
     * @param def The current defense of the character
     */
    protected void setDef(int def) {
        this.def = def;
    }

    /**
     * It works to get Heal Points of the character.
     *
     * @return value of HP
     */
    public final HP getHp() {
        return hp;
    }

    @Override
    public final boolean isKO() {
        return hp.getCurrentPoints() == 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractCharacter)) return false;
        AbstractCharacter c = (AbstractCharacter) o;
        return this.getAtk() == c.getAtk() && this.getDef() == c.getDef() &&
                this.getHp() == c.getHp() && this.getLvl() == c.getLvl();
    }
}
