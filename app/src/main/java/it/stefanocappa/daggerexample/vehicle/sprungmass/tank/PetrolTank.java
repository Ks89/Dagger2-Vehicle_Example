package it.stefanocappa.daggerexample.vehicle.sprungmass.tank;

import android.util.Log;

import javax.inject.Inject;

public class PetrolTank implements Tank {
    int level;
    int capacity = 25;

    @Inject
    public PetrolTank() {
    }

    @Override
    public void setLevel(int level) {
        if (this.level < capacity) {
            Log.d("DaggerExample", " || || || filling petrol tank || || ||");
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
