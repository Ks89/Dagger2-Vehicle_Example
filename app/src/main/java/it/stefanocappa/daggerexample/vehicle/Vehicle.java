package it.stefanocappa.daggerexample.vehicle;

import hugo.weaving.DebugLog;
import it.stefanocappa.daggerexample.vehicle.sprungmass.SprungMass;
import it.stefanocappa.daggerexample.vehicle.sprungmass.DaggerSprungMassComponent;
import it.stefanocappa.daggerexample.vehicle.sprungmass.SprungMassComponent;
import it.stefanocappa.daggerexample.vehicle.unsprungmass.UnsprungMass;

public class Vehicle {
    private SprungMass sprungMass;
    private UnsprungMass unsprungMass;

    public Vehicle() {
        SprungMassComponent sprungMassComponent = DaggerSprungMassComponent.builder().build();
        this.sprungMass = sprungMassComponent.sprungMass();
    }

    @DebugLog
    public void startEngines(int fuelToAdd, int rpmRequested) {

        //all Tanks are a limited capacity!!!
        sprungMass.startGplEngine(fuelToAdd, rpmRequested);
        sprungMass.startPetrolEngine(fuelToAdd, rpmRequested);
        sprungMass.startElectricEngine(fuelToAdd, rpmRequested);
    }
}
