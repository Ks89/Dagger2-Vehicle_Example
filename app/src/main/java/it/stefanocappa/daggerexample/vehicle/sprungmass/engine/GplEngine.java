package it.stefanocappa.daggerexample.vehicle.sprungmass.engine;

import android.util.Log;

import javax.inject.Inject;

import hugo.weaving.DebugLog;
import it.stefanocappa.daggerexample.vehicle.sprungmass.Gpl;
import it.stefanocappa.daggerexample.vehicle.sprungmass.tank.Tank;

public class GplEngine extends Motor {
    private static final String TAG = GplEngine.class.getSimpleName();
    private int energy = 0;

    @Inject
    public GplEngine(@Gpl Tank tank) {
        this.tank = tank;
        Log.d(TAG, "GplEngine log");
    }

    @Override
    public int getRpm() {
        return this.rpm;
    }

    @Override
    public int getEnergy() {
        return energy;
    }

    @Override
    @DebugLog
    public void accelerate(int value) {
        if (tank.getCurrentLevel() > value) {
            Log.d(TAG, "Gpl engine accelerating with energy: " + tank.getCurrentLevel());
            this.rpm = value;
            this.energy = 0;
        } else {
            Log.d(TAG, "Not enough fuel. Current is: " + tank.getCurrentLevel() + ", requested is " + value);
        }
    }

    @Override
    public void brake() {
        Log.d(TAG, "GplEngine braking ");
    }
}
