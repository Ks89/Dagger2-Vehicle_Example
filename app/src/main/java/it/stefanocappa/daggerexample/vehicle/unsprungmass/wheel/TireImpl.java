package it.stefanocappa.daggerexample.vehicle.unsprungmass.wheel;

import javax.inject.Inject;

/**
 * Created by Ks89 on 24/03/16.
 */
public class TireImpl implements Tire {

    private int size;
    private int pressure;
    private int rpm;
    private String type;

    @Inject
    public TireImpl() {
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int getPressure() {
        return pressure;
    }

    @Override
    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    @Override
    public void setSpeed(int rpm) {
        this.rpm = rpm;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }
}
