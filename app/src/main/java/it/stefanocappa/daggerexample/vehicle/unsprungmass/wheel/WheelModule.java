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

package it.stefanocappa.daggerexample.vehicle.unsprungmass.wheel;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import dagger.Module;
import dagger.Provides;

@Module(includes = {SuspensionModule.class, TireModule.class})
public class WheelModule {

    private int wheelNumber = 0;

    public WheelModule(int wheelNumber) {
        this.wheelNumber = wheelNumber;
    }

    @Provides
    List<Wheel> provideWheels() {
        Log.d("WheelModule", "wheelNumber: " + wheelNumber);
        List<Wheel> wheels = new ArrayList<>(wheelNumber);
        for (int i = 0; i < wheelNumber; i++) {
            wheels.add(new Wheel());
        }
        return wheels;
    }
}