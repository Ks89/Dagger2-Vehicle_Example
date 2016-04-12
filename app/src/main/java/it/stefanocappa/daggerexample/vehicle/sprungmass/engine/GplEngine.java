package it.stefanocappa.daggerexample.vehicle.sprungmass.engine;

import android.util.Log;

import javax.inject.Inject;

import hugo.weaving.DebugLog;
import it.stefanocappa.daggerexample.vehicle.sprungmass.Gpl;
import it.stefanocappa.daggerexample.vehicle.sprungmass.tank.Tank;

public class GplEngine extends Motor {
    private static final String TAG = GplEngine.class.getSimpleName();

    @Inject
    public GplEngine(@Gpl Tank tank) {
        this.tank = tank;
    }

    @Override
    public void accelerate(int value) {
        if (tank.getCurrentLevel() >= value) {
            Log.d(TAG, "Engine accelerating to " + value + " with fuel: " + tank.getCurrentLevel());
            this.rpm = value;
            tank.setCurrentLevel(tank.getCurrentLevel() - value);
            Log.d(TAG, "Engine consumed " + value + " of fuel to be able to accelerate");
        } else {
            Log.e(TAG, "Not enough fuel. Current is: " + tank.getCurrentLevel() + ", requested is " + value);
        }
    }

    @Override
    public void brake() {
        Log.d(TAG, "Braking...");
        this.rpm = 0;
    }
}
