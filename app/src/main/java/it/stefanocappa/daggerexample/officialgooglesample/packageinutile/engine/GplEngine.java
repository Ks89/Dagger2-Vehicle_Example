package it.stefanocappa.daggerexample.officialgooglesample.packageinutile.engine;

import android.util.Log;

import javax.inject.Inject;

import hugo.weaving.DebugLog;
import it.stefanocappa.daggerexample.officialgooglesample.packageinutile.Gpl;
import it.stefanocappa.daggerexample.officialgooglesample.packageinutile.tank.Tank;

public class GplEngine extends Motor {
    private int level;
    private int energy = 0;

    @Inject
    public GplEngine(@Gpl Tank tank) {
        this.tank = tank;
        Log.d("GplEngine", "GplEngine log");
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
        if (tank.getLevel() > value) {
            Log.d("GplMotor", "Gpl engine accelerating with energy: " + tank.getLevel());
            this.rpm = value;
            this.energy = 0;
        } else {
            Log.d("GplMotor", "Not enough fuel");
        }
    }

    @Override
    public void brake() {
        Log.d("DaggerExample", "Gpl braking ");
    }
}
