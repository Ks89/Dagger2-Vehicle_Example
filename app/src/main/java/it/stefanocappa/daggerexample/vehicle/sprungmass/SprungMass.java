package it.stefanocappa.daggerexample.vehicle.sprungmass;

import android.util.Log;

import javax.inject.Inject;

import dagger.Lazy;
import hugo.weaving.DebugLog;
import it.stefanocappa.daggerexample.vehicle.sprungmass.engine.Engine;
import it.stefanocappa.daggerexample.vehicle.sprungmass.tank.Tank;

public class SprungMass {
    private static final String TAG = SprungMass.class.getSimpleName();

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

    @DebugLog
    public void startGplEngine(int fuelToAdd, int rpmRequested) {
        gplTank.get().refill(fuelToAdd); //by default a tank starts empty (fuel==0)
        gplEngine.accelerate(rpmRequested);
        Log.d(TAG, "GplEngine: Not enough fuel to accelerate");

        gplTank.get().refill(0);
        gplEngine.accelerate(5);
        Log.d(TAG, "GplEngine: accelerated successfully at 5");

        gplTank.get().refill(10);
        gplEngine.accelerate(20);
        Log.d(TAG, "GplEngine: accelerated successfully at 20");
    }

    @DebugLog
    public void startPetrolEngine(int fuelToAdd, int rpmRequested) {
        petrolTank.get().refill(fuelToAdd); //by default a tank starts empty (fuel==0)
        petrolEngine.accelerate(rpmRequested);
        Log.d(TAG, "PetrolEngine: Not enough fuel to accelerate");

        petrolTank.get().refill(0);
        petrolEngine.accelerate(5);
        Log.d(TAG, "PetrolEngine: accelerated successfully at 5");

        petrolTank.get().refill(10);
        petrolEngine.accelerate(20);
        Log.d(TAG, "PetrolEngine: accelerated successfully at 20");
    }

    @DebugLog
    public void startElectricEngine(int fuelToAdd, int rpmRequested) {
        electricTank.get().refill(fuelToAdd); //by default a tank starts empty (fuel==0)
        electricEngine.accelerate(rpmRequested);
        Log.d(TAG, "ElectricEngine: Not enough fuel to accelerate");

        electricTank.get().refill(0);
        electricEngine.accelerate(5);
        Log.d(TAG, "ElectricEngine: accelerated successfully at 5");

        electricTank.get().refill(10);
        electricEngine.accelerate(20);
        Log.d(TAG, "ElectricEngine: accelerated successfully at 20");
    }
}
