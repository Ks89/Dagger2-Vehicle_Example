/*
Copyright 2016 Stefano Cappa
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
    http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

package it.stefanocappa.daggerexample.vehicle.sprungmass.tank;

import android.util.Log;

import hugo.weaving.DebugLog;

public class PetrolTank extends TankImpl {
    private static final String TAG = PetrolTank.class.getSimpleName();

    @Override
    @DebugLog
    public void refill(int addedFuel) {
        Log.d(TAG, "Refill requested with: addedFuel: " + addedFuel + ", this.currentLevel + addedFuel: "
                + (this.currentLevel + addedFuel) + ", maximumCapacity: " + Config.PETROL_TANK_MAX_CAPACITY);
        if (this.currentLevel + addedFuel < Config.PETROL_TANK_MAX_CAPACITY) {
            Log.d(TAG, " || || || filling tank || || ||");
            this.currentLevel = this.currentLevel + addedFuel;
        } else {
            Log.e(TAG, "You cannot exceed the maximum capacity: " + Config.PETROL_TANK_MAX_CAPACITY);
        }
    }

    @Override
    public boolean isFull() {
        return currentLevel == Config.PETROL_TANK_MAX_CAPACITY;
    }
}
