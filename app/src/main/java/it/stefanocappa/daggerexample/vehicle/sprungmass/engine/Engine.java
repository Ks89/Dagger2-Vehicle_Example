package it.stefanocappa.daggerexample.vehicle.sprungmass.engine;

public interface Engine {
    int getRpm();

    int getEnergy();

    void accelerate(int rpm);

    void brake();
}
