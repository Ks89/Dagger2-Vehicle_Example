package it.stefanocappa.daggerexample.vehicle.sprungmass.tank;

import android.util.Log;

import hugo.weaving.DebugLog;

public class ElectricTank extends TankImpl {
    private static final String TAG = ElectricTank.class.getSimpleName();

    @Override
    @DebugLog
    public void refill(int addedFuel) {
        Log.d(TAG, "Refill requested with: addedFuel: " + addedFuel + ", this.currentLevel + addedFuel: "
                + (this.currentLevel + addedFuel) + ", maximumCapacity: " + Config.ELECTRIC_TANK_MAX_CAPACITY);
        if (this.currentLevel + addedFuel < Config.ELECTRIC_TANK_MAX_CAPACITY) {
            Log.d(TAG, " || || || filling tank || || ||");
            this.currentLevel = this.currentLevel + addedFuel;
        } else {
            Log.e(TAG, "You cannot exceed the maximum capacity: " + Config.ELECTRIC_TANK_MAX_CAPACITY);
        }
    }

    @Override
    public boolean isFull() {
        return currentLevel == Config.ELECTRIC_TANK_MAX_CAPACITY;
    }

}