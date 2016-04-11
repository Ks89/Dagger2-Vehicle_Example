package it.stefanocappa.daggerexample.vehicle.sprungmass.engine;


import it.stefanocappa.daggerexample.vehicle.sprungmass.tank.Tank;

/**
 * Created by Ks89 on 21/03/16.
 */
public abstract class Motor implements Engine {
    protected Tank tank;

    protected int rpm = 0;

    @Override
    public int getRpm() {
        return this.rpm;
    }

    public abstract int getEnergy();

    public abstract void accelerate(int rpm);

    public abstract void brake();
}