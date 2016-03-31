package it.stefanocappa.daggerexample.vehicle.unsprungmass;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import it.stefanocappa.daggerexample.vehicle.unsprungmass.wheel.Wheel;

@Singleton
public class UnsprungMass {

    @Inject
    List<Wheel> wheels;

    @Inject
    UnsprungMass() {
    }

}
