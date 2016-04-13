package it.stefanocappa.daggerexample.vehicle.unsprungmass;

import javax.inject.Inject;

import it.stefanocappa.daggerexample.vehicle.unsprungmass.wheel.Wheel;

public class UnsprungMass {

    @Inject
    Wheel wheel;

    @Inject
    UnsprungMass() {
    }

    public int testMethodCall(int i) {
        return wheel.callExpMethod(i);
    }

}
