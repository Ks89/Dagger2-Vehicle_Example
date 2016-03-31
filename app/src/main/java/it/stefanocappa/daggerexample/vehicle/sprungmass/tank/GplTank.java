package it.stefanocappa.daggerexample.vehicle.sprungmass.tank;

import android.util.Log;

import javax.inject.Inject;

public class GplTank implements Tank {
    int level;
    int capacity = 25;

    @Inject
    public GplTank() {
    }

    @Override
    public void setLevel(int level) {
        if (this.level < capacity) {
            Log.d("DaggerExample", " || || || filling gpl tank || || ||");
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
