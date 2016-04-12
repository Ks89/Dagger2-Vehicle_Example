package it.stefanocappa.daggerexample.vehicle.sprungmass.tank;

/**
 * Created by Ks89 on 12/04/16.
 */
public abstract class TankImpl implements Tank {
    protected int currentLevel;

    public int getCurrentLevel() {
        return this.currentLevel;
    }

    @Override
    public void setCurrentLevel(int levelToSet) {
        currentLevel = levelToSet;
    }
}
