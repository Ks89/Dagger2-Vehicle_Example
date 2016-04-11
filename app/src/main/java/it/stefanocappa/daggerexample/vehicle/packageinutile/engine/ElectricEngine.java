package it.stefanocappa.daggerexample.vehicle.packageinutile.engine;//package it.stefanocappa.daggerexample.vehicle.sprungmass.engine;

import android.util.Log;

import javax.inject.Inject;

import hugo.weaving.DebugLog;
import it.stefanocappa.daggerexample.vehicle.packageinutile.Electric;
import it.stefanocappa.daggerexample.vehicle.packageinutile.tank.Tank;


/**
 * Created by Ks89 on 17/03/16.
 */
public class ElectricEngine extends Motor {
    private int level;
    private int energy = 0;

    @Inject
    public ElectricEngine(@Electric Tank tank) {
        this.tank = tank;
        Log.d("ElectricEngine", "ElectricEngine log");
    }

    @Override
    public int getEnergy() {
        return energy;
    }

    @Override
    @DebugLog
    public void accelerate(int value) {
        if (tank.getLevel() > value) {
            Log.d("ElectricEngine", "Electric engine accelerating with energy: " + tank.getLevel());
            this.rpm = value;
            this.energy = 0;
        } else {
            Log.d("ElectricEngine", "Not enough fuel");
        }
    }

    @Override
    public void brake() {
        Log.d("DaggerExample", "Electric braking ");
    }
}
