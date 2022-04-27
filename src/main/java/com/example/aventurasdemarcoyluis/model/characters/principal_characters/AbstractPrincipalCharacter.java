package com.example.aventurasdemarcoyluis.model.characters.principal_characters;

import com.example.aventurasdemarcoyluis.model.characters.AbstractCharacter;
import com.example.aventurasdemarcoyluis.model.characters.enemies.Boo;
import com.example.aventurasdemarcoyluis.model.characters.enemies.Goomba;
import com.example.aventurasdemarcoyluis.model.characters.enemies.Spiny;
import com.example.aventurasdemarcoyluis.model.items.*;
import com.example.aventurasdemarcoyluis.model.points.FP;
import org.jetbrains.annotations.NotNull;

/**
 * Class that represent a playable character in the game.
 */
public abstract class AbstractPrincipalCharacter
        extends AbstractCharacter
        implements PrincipalCharacter {
    protected final FP fp;

    /**
     * creates a new principal character.
     *
     * @param lvl level of the character
     * @param atk attack points
     * @param def defense points
     * @param hp health points
     * @param fp fight points
     */
    public AbstractPrincipalCharacter(int lvl, int atk, int def, int hp, int fp) {
        super(lvl, atk, def, hp);
        this.fp = new FP(fp);
    }

    /**
     * Receives the Fight Points of the Principal Character
     *
     * @return the current amount of FP
     */
    public FP getFp() {
        return fp;
    }

    @Override
    public void useItem(@NotNull Item item, @NotNull ItemBox box) {
        if(box.getBox().containsKey(item)){
            item.use(getHp(), getFp());
            box.use(item);
        }
    }

    @Override
    public void levelUp(@NotNull ItemBox box) {
        RedMushroom rm = new RedMushroom();
        HoneySyrup hs = new HoneySyrup();
        setLvl(getLvl() + 1);
        setAtk((int)(getAtk() * 1.15));
        setDef((int)(getDef() * 1.15));
        hp.setMaxPoints((int)(hp.getMaxPoints() * 1.15));
        fp.setMaxPoints((int)(fp.getMaxPoints() * 1.15));
        box.add(rm);
        box.add(hs);
    }

    @Override
    public void attackedBy(@NotNull Boo boo) {
        hp.decreasePoints((int)(0.75 * boo.getAtk() * boo.getLvl() / this.getDef()));
    }

    @Override
    public void attackedBy(@NotNull Spiny spiny) {
        hp.decreasePoints((int)(0.75 * spiny.getAtk() * spiny.getLvl() / this.getDef()));
    }

    @Override
    public void attackedBy(@NotNull Goomba goomba) {
        hp.decreasePoints((int)(0.75 * goomba.getAtk() * goomba.getLvl() / this.getDef()));
    }
}
