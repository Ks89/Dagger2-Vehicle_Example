package it.stefanocappa.daggerexample.officialgooglesample;

import hugo.weaving.DebugLog;
import it.stefanocappa.daggerexample.officialgooglesample.packageinutile.DaggerSprungMassComponent;
import it.stefanocappa.daggerexample.officialgooglesample.packageinutile.SprungMass;
import it.stefanocappa.daggerexample.officialgooglesample.packageinutile.SprungMassComponent;

/**
 * Created by Ks89 on 11/04/16.
 */
public class Vehicle {
    private SprungMass sprungMass;

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
