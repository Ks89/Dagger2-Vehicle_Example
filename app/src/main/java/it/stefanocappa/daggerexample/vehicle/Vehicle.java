package it.stefanocappa.daggerexample.vehicle;

import hugo.weaving.DebugLog;
import it.stefanocappa.daggerexample.vehicle.packageinutile.DaggerSprungMassComponent;
import it.stefanocappa.daggerexample.vehicle.packageinutile.SprungMass;
import it.stefanocappa.daggerexample.vehicle.packageinutile.SprungMassComponent;
import it.stefanocappa.daggerexample.vehicle.unsprungmass.UnsprungMass;

public class Vehicle {
    private SprungMass sprungMass;
    private UnsprungMass unsprungMass;

    public Vehicle() {
        SprungMassComponent sprungMassComponent = DaggerSprungMassComponent.builder().build();
        this.sprungMass = sprungMassComponent.sprungMass();
    }

    @DebugLog
    public void brew(int level, int exlevel) {
        sprungMass.startGplEngine(level, exlevel);
        sprungMass.startPetrolEngine(level, exlevel);
        sprungMass.startElectricEngine(level, exlevel);
    }
}
