package it.stefanocappa.daggerexample.officialgooglesample.packageinutile.engine;

import android.util.Log;

import javax.inject.Inject;

import hugo.weaving.DebugLog;
import it.stefanocappa.daggerexample.officialgooglesample.packageinutile.Petrol;
import it.stefanocappa.daggerexample.officialgooglesample.packageinutile.tank.Tank;

public class PetrolEngine implements Engine {
    private final Tank tank;
    private int level;
    private int energy = 0;
    private int rpm = 0;

    @Inject
    public PetrolEngine(@Petrol Tank tank) {
        this.tank = tank;
        Log.d("tag", "useless log");
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
            Log.d("PetrolMotor", "Petrol engine accelerating with energy: " + tank.getLevel());
            this.rpm = value;
            this.energy = 0;
        } else {
            Log.d("PetrolMotor", "Not enough fuel");
        }
    }

    @Override
    public void brake() {
        Log.d("DaggerExample", "Petrol braking ");
    }
}
