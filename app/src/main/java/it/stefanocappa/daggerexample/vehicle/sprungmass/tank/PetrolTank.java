package it.stefanocappa.daggerexample.vehicle.sprungmass.tank;

import android.util.Log;

import hugo.weaving.DebugLog;

public class PetrolTank implements Tank {
    private static final String TAG = PetrolTank.class.getSimpleName();
    int currentLevel;
    int maximumCapacity = 50;

    @Override
    @DebugLog
    public void refill(int addedFuel) {
        Log.d(TAG, "Refill requested with: addedFuel: " + addedFuel + ", this.currentLevel + addedFuel: "
                + (this.currentLevel + addedFuel) + ", maximumCapacity: " + maximumCapacity);
        if (this.currentLevel + addedFuel < maximumCapacity) {
            Log.d(TAG, " || || || filling petrol tank || || ||");
            this.currentLevel = this.currentLevel + addedFuel;
        } else {
            Log.e(TAG, "Petrol tank already full!!!");
        }
    }

    public int getCurrentLevel() {
        return this.currentLevel;
    }

    @Override
    public boolean isFull() {
        return currentLevel == maximumCapacity;
    }
}
