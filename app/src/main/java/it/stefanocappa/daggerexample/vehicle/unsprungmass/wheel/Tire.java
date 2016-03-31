package it.stefanocappa.daggerexample.vehicle.unsprungmass.wheel;

public interface Tire {

    int getSize();

    void setSize(int size);

    int getPressure();

    void setPressure(int pressure);

    void setSpeed(int rpm);

    void setType(String type);


}
