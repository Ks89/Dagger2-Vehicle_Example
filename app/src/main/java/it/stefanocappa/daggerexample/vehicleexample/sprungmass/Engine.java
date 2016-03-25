package it.stefanocappa.daggerexample.vehicleexample.sprungmass;

public interface Engine {
    int getRpm();

    int getEnergy();

    void accelerate(int rpm);

    void brake();
}
