package it.stefanocappa.daggerexample.vehicle.sprungmass;

import android.util.Log;

import javax.inject.Inject;

import dagger.Lazy;
import hugo.weaving.DebugLog;
import it.stefanocappa.daggerexample.vehicle.sprungmass.engine.Engine;
import it.stefanocappa.daggerexample.vehicle.sprungmass.tank.Tank;

public class SprungMass {
    @Inject @Gpl
    Lazy<Tank> gplTank;
    @Inject @Gpl
    Engine gplEngine;
    @Inject @Petrol
    Lazy<Tank> petrolTank;
    @Inject @Petrol
    Engine petrolEngine;
    @Inject @Electric
    Lazy<Tank> electricTank;
    @Inject @Electric
    Engine electricEngine;

    @Inject
    public SprungMass() {
    }

    @DebugLog
    public void startGplEngine(int level, int rpm) {
        gplTank.get().setLevel(level);
        gplEngine.accelerate(rpm);
        gplTank.get().setLevel(1);
        Log.d("tag", " level is only 1, i can't start the gplEngine ");
        gplEngine.accelerate(10);
        gplTank.get().setLevel(1);
        gplEngine.accelerate(0);
        Log.d("tag", " [_]P coffee! [_]P ");
        gplTank.get().setLevel(0);
    }

    @DebugLog
    public void startPetrolEngine(int level, int rpm) {
        petrolTank.get().setLevel(level);
        petrolEngine.accelerate(rpm);
        petrolTank.get().setLevel(1);
        Log.d("tag", " level is only 1, i can't start the petrolEngine ");
        petrolEngine.accelerate(10);
        petrolTank.get().setLevel(1);
        petrolEngine.accelerate(0);
        Log.d("tag", " [_]P coffee! [_]P ");
        petrolTank.get().setLevel(0);
    }

    @DebugLog
    public void startElectricEngine(int level, int rpm) {
        electricTank.get().setLevel(level);
        electricEngine.accelerate(rpm);
        electricTank.get().setLevel(1);
        Log.d("tag", " level is only 1, i can't start the electricEngine ");
        electricEngine.accelerate(10);
        electricTank.get().setLevel(1);
        electricEngine.accelerate(0);
        Log.d("tag", " [_]P coffee! [_]P ");
        electricTank.get().setLevel(0);
    }
}
