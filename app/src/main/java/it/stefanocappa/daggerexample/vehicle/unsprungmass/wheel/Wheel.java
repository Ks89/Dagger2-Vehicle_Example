package it.stefanocappa.daggerexample.vehicle.unsprungmass.wheel;

/**
 * Created by Ks89 on 30/03/16.
 */
public class Wheel {

    private Suspension suspension;
    private Tire tire;

    public Wheel(Suspension suspension, Tire tire) {
        this.suspension = suspension;
        this.tire = tire;
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

    public void setTire(Tire tire) {
        this.tire = tire;
    }
}
