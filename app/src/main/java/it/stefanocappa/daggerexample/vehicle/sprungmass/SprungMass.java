package it.stefanocappa.daggerexample.vehicle.sprungmass;

import javax.inject.Inject;

import dagger.Lazy;
import it.stefanocappa.daggerexample.vehicle.sprungmass.engine.Engine;
import it.stefanocappa.daggerexample.vehicle.sprungmass.tank.Tank;

public class SprungMass {

    @Inject
    @Gpl
    Lazy<Tank> gplTank;
    @Inject
    @Gpl
    Engine gplEngine;
    @Inject
    @Petrol
    Lazy<Tank> petrolTank;
    @Inject
    @Petrol
    Engine petrolEngine;
    @Inject
    @Electric
    Lazy<Tank> electricTank;
    @Inject
    @Electric
    Engine electricEngine;

    @Inject
    public SprungMass() {
    }

    public void refillGpl(int fuelToAdd) {
        gplTank.get().refill(fuelToAdd);
    }

    public void refillPetrol(int fuelToAdd) {
        petrolTank.get().refill(fuelToAdd);
    }

    public void refillElectric(int fuelToAdd) {
        electricTank.get().refill(fuelToAdd);
    }

    public void acceleratePetrol(int rpmRequested) {
        petrolEngine.accelerate(rpmRequested);
    }

    public void accelerateGpl(int rpmRequested) {
        gplEngine.accelerate(rpmRequested);
    }

    public void accelerateElectric(int rpmRequested) {
        electricEngine.accelerate(rpmRequested);
    }

    public void brakePetrol() {
        petrolEngine.brake();
    }

    public void brakeGpl() {
        gplEngine.brake();
    }

    public void brakeElectric() {
        electricEngine.brake();
    }
}
