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

package it.stefanocappa.daggerexample.vehicle.sprungmass.engine;

import android.util.Log;

import javax.inject.Inject;

import hugo.weaving.DebugLog;
import it.stefanocappa.daggerexample.vehicle.sprungmass.Electric;
import it.stefanocappa.daggerexample.vehicle.sprungmass.tank.Tank;

/**
 * Created by Ks89 on 17/03/16.
 */
public class ElectricEngine extends Motor {
    private static final String TAG = ElectricEngine.class.getSimpleName();

    @Inject
    public ElectricEngine(@Electric Tank tank) {
        this.tank = tank;
    }

    @Override
    public void accelerate(int value) {
        if (tank.getCurrentLevel() >= value) {
            Log.d(TAG, "Engine accelerating to " + value + " with fuel: " + tank.getCurrentLevel());
            this.rpm = value;
            tank.setCurrentLevel(tank.getCurrentLevel() - value);
            Log.d(TAG, "Engine consumed " + value + " of fuel to be able to accelerate");
        } else {
            Log.e(TAG, "Not enough fuel. Current is: " + tank.getCurrentLevel() + ", requested is " + value);
        }
    }

    @Override
    public void brake() {
        Log.d(TAG, "Braking...");
        this.rpm = 0;
    }
}
