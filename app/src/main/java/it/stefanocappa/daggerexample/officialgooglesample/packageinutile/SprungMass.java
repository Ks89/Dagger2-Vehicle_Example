package it.stefanocappa.daggerexample.officialgooglesample.packageinutile;

import android.util.Log;

import javax.inject.Inject;

import dagger.Lazy;
import hugo.weaving.DebugLog;
import it.stefanocappa.daggerexample.officialgooglesample.packageinutile.engine.Engine;
import it.stefanocappa.daggerexample.officialgooglesample.packageinutile.tank.Tank;

public class SprungMass {
    @Inject @Gpl
    Lazy<Tank> gplTank; // Create a possibly costly gplTank only when we use it.
    @Inject @Gpl
    Engine gplEngine;
    @Inject @Petrol
    Lazy<Tank> petrolTank; // Create a possibly costly gplTank only when we use it.
    @Inject @Petrol
    Engine petrolEngine;
    @Inject @Electric
    Lazy<Tank> electricTank; // Create a possibly costly gplTank only when we use it.
    @Inject @Electric
    Engine electricEngine;

    @Inject
    public SprungMass() {
    }

    @DebugLog
    public void startGplEngine(int level, int exlevel) {
        gplTank.get().setLevel(level);
        gplEngine.accelerate(exlevel);
        gplTank.get().setLevel(1);
        Log.d("tag", " level is only 1, i can't start the gplEngine ");
        gplEngine.accelerate(10);
        gplTank.get().setLevel(1);
        gplEngine.accelerate(0);
        Log.d("tag", " [_]P coffee! [_]P ");
        gplTank.get().setLevel(0);
    }

    @DebugLog
    public void startPetrolEngine(int level, int exlevel) {
        petrolTank.get().setLevel(level);
        petrolEngine.accelerate(exlevel);
        petrolTank.get().setLevel(1);
        Log.d("tag", " level is only 1, i can't start the petrolEngine ");
        petrolEngine.accelerate(10);
        petrolTank.get().setLevel(1);
        petrolEngine.accelerate(0);
        Log.d("tag", " [_]P coffee! [_]P ");
        petrolTank.get().setLevel(0);
    }

    @DebugLog
    public void startElectricEngine(int level, int exlevel) {
        electricTank.get().setLevel(level);
        electricEngine.accelerate(exlevel);
        electricTank.get().setLevel(1);
        Log.d("tag", " level is only 1, i can't start the electricEngine ");
        electricEngine.accelerate(10);
        electricTank.get().setLevel(1);
        electricEngine.accelerate(0);
        Log.d("tag", " [_]P coffee! [_]P ");
        electricTank.get().setLevel(0);
    }
}
