package it.stefanocappa.daggerexample.vehicle.packageinutile.tank;

import android.util.Log;

import hugo.weaving.DebugLog;

public class ElectricTank implements Tank {

    int level;
    int capacity = 500;

    @Override
    @DebugLog
    public void setLevel(int level) {
        if (level < capacity) {
            Log.d("DaggerExample", " || || || filling electric tank || || ||");
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
