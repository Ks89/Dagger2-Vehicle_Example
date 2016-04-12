package it.stefanocappa.daggerexample.vehicle.sprungmass.tank;

import android.util.Log;

import hugo.weaving.DebugLog;

public class GplTank extends TankImpl {
    private static final String TAG = GplTank.class.getSimpleName();

    @Override
    @DebugLog
    public void refill(int addedFuel) {
        Log.d(TAG, "Refill requested with: addedFuel: " + addedFuel + ", this.currentLevel + addedFuel: "
                + (this.currentLevel + addedFuel) + ", maximumCapacity: " + Config.GPL_TANK_MAX_CAPACITY);
        if (this.currentLevel + addedFuel < Config.GPL_TANK_MAX_CAPACITY) {
            Log.d(TAG, " || || || filling tank || || ||");
            this.currentLevel = this.currentLevel + addedFuel;
        } else {
            Log.e(TAG, "You cannot exceed the maximum capacity: " + Config.GPL_TANK_MAX_CAPACITY);
        }
    }

    @Override
    public boolean isFull() {
        return currentLevel == Config.GPL_TANK_MAX_CAPACITY;
    }
}
