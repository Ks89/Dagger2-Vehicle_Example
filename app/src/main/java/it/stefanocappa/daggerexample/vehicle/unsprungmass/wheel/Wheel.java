package it.stefanocappa.daggerexample.vehicle.unsprungmass.wheel;

import javax.inject.Inject;

/**
 * Created by Ks89 on 30/03/16.
 */
public class Wheel {

    @Inject
    Suspension suspension;
    @Inject
    Tire tire;

    @Inject
    public Wheel() {
    }

    public Suspension getSuspension() {
        return suspension;
    }

    public void setSuspension(Suspension suspension) {
        this.suspension = suspension;
    }

    public Tire getTire() {
        return tire;
    }

    public int callExpMethod(int i) {
        return i + 1;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }
}
