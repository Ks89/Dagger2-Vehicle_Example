package it.stefanocappa.daggerexample.vehicle.sprungmass.tank;

import android.util.Log;

import javax.inject.Inject;

public class BatteryPackTank implements Tank {
    int level;
    int capacity = 10;

    @Inject
    public BatteryPackTank() {
    }

    @Override
    public void setLevel(int level) {
        if (this.level < capacity) {
            Log.d("DaggerExample", " || || || charging battery pack (tank) || || ||");
            this.level = level;
        }
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public boolean isFull() {
        return level == capacity;
    }
}
