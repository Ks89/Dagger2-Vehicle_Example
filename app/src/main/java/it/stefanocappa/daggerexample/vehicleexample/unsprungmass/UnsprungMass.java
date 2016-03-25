package it.stefanocappa.daggerexample.vehicleexample.unsprungmass;

public interface UnsprungMass {

    int getSpeed();

    void accelerate(int rpm);

    void brake();

    void setTirePressure(int pressure);

    int getTirePressure();

}
