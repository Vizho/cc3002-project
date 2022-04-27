package com.example.aventurasdemarcoyluis.model.points;

import com.example.aventurasdemarcoyluis.model.characters.AbstractCharacter;

/**
 * Class that represent the points of a character.
 */
public abstract class AbstractPoints implements Points {
    private int maxPoints;
    private int currentPoints;

    /**
     * Sets the max amount of points and shows the current amount of points.
     *
     * @param maxPoints Maximum amount of points
     */
    public AbstractPoints(int maxPoints) {
        this.maxPoints = maxPoints;
        this.currentPoints = maxPoints;
    }

    /**
     * Gives the max amount of points.
     *
     * @return the maximum points
     */
    public int getMaxPoints() {
        return maxPoints;
    }

    /**
     * Sets the new value of max amount of points.
     *
     * @return the new maximum points
     */
    public int setMaxPoints(int value){
        return maxPoints = value;
    }

    /**
     * Gives the current amount of points.
     *
     * @return the current points
     */
    public int getCurrentPoints() {
        return currentPoints;
    }

    /**
     * Sets the current amount of points.
     *
     * @param value by which the current points is changed
     */
    private void setCurrentPoints(int value) {
        currentPoints = value;
    }

    /**
     * Increases points by the value but without passing the maximum value of points.
     *
     * @param value that increases the current one
     */
    public void increasePoints(int value) {
        setCurrentPoints(
                Math.min(getMaxPoints(), getCurrentPoints() + value)
        );
    }

    /**
     * Decreases points by the value but without passing the amount of zero.
     *
     * @param value that decreases the current one
     */
    public void decreasePoints(int value) {
        setCurrentPoints(
                Math.max(0, getCurrentPoints() - value)
        );
    }
    @Override

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractPoints)) return false;
        AbstractPoints p = (AbstractPoints) o;
        return this.getCurrentPoints() == ((AbstractPoints) o).getCurrentPoints();
    }
}
