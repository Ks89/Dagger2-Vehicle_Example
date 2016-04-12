package it.stefanocappa.daggerexample.vehicle.sprungmass.engine;//package it.stefanocappa.daggerexample.vehicle.sprungmass.engine;

import android.util.Log;

import javax.inject.Inject;

import hugo.weaving.DebugLog;
import it.stefanocappa.daggerexample.vehicle.sprungmass.Electric;
import it.stefanocappa.daggerexample.vehicle.sprungmass.tank.Tank;


/**
 * Created by Ks89 on 17/03/16.
 */
public class ElectricEngine extends Motor {
    private static final String TAG = ElectricEngine.class.getSimpleName();
    private int energy = 0;

    @Inject
    public ElectricEngine(@Electric Tank tank) {
        this.tank = tank;
        Log.d(TAG, "ElectricEngine log");
    }

    @Override
    public int getEnergy() {
        return energy;
    }

    @Override
    @DebugLog
    public void accelerate(int value) {
        if (tank.getCurrentLevel() > value) {
            Log.d(TAG, "Electric engine accelerating with energy: " + tank.getCurrentLevel());
            this.rpm = value;
            this.energy = 0;
        } else {
            Log.d(TAG, "Not enough fuel. Current is: " + tank.getCurrentLevel() + ", requested is " + value);
        }
    }

    @Override
    public void brake() {
        Log.d(TAG, "ElectricEngine braking ");
    }
}
