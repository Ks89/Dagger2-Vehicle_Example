package it.stefanocappa.daggerexample.vehicle;

import it.stefanocappa.daggerexample.vehicle.sprungmass.DaggerSprungMassComponent;
import it.stefanocappa.daggerexample.vehicle.sprungmass.SprungMass;
import it.stefanocappa.daggerexample.vehicle.sprungmass.SprungMassComponent;
import it.stefanocappa.daggerexample.vehicle.unsprungmass.UnsprungMass;

public class Vehicle {
    private SprungMass sprungMass;
    private UnsprungMass unsprungMass;

    public Vehicle() {
        SprungMassComponent sprungMassComponent = DaggerSprungMassComponent.builder().build();
        this.sprungMass = sprungMassComponent.sprungMass();
    }

    public void refillGpl(int fuelToAdd) {
        this.sprungMass.refillGpl(fuelToAdd);
    }

    public void refillPetrol(int fuelToAdd) {
        this.sprungMass.refillPetrol(fuelToAdd);
    }

    public void refillElectric(int fuelToAdd) {
        this.sprungMass.refillElectric(fuelToAdd);
    }

    public void acceleratePetrol(int rpmRequested) {
        this.sprungMass.acceleratePetrol(rpmRequested);
    }

    public void accelerateGpl(int rpmRequested) {
        this.sprungMass.accelerateGpl(rpmRequested);
    }

    public void accelerateElectric(int rpmRequested) {
        this.sprungMass.accelerateElectric(rpmRequested);
    }

    public void brakePetrol() {
        this.sprungMass.brakePetrol();
    }

    public void brakeGpl() {
        this.sprungMass.brakeGpl();
    }

    public void brakeElectric() {
        this.sprungMass.brakeElectric();
    }
}
