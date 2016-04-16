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

package it.stefanocappa.daggerexample.vehicle.sprungmass;

import javax.inject.Inject;

import dagger.Lazy;
import it.stefanocappa.daggerexample.vehicle.sprungmass.engine.Engine;
import it.stefanocappa.daggerexample.vehicle.sprungmass.tank.Tank;

public class SprungMass {

    @Inject
    @Gpl
    Lazy<Tank> gplTank;
    @Inject
    @Gpl
    Lazy<Engine> gplEngine;
    @Inject
    @Petrol
    Lazy<Tank> petrolTank;
    @Inject
    @Petrol
    Lazy<Engine> petrolEngine;
    @Inject
    @Electric
    Lazy<Tank> electricTank;
    @Inject
    @Electric
    Lazy<Engine> electricEngine;

    @Inject
    public SprungMass() {
    }

    public void refillGpl(int fuelToAdd) {
        gplTank.get().refill(fuelToAdd);
    }

    public void refillPetrol(int fuelToAdd) {
        petrolTank.get().refill(fuelToAdd);
    }

    public void refillElectric(int fuelToAdd) {
        electricTank.get().refill(fuelToAdd);
    }

    public int acceleratePetrol(int rpmRequested) {
        int result = petrolEngine.get().accelerate(rpmRequested);
        return result;
    }

    public int accelerateGpl(int rpmRequested) {
        int result = gplEngine.get().accelerate(rpmRequested);
        return result;
    }

    public int accelerateElectric(int rpmRequested) {
        int result = electricEngine.get().accelerate(rpmRequested);
        return result;
    }

    public void brakePetrol() {
        petrolEngine.get().brake();
    }

    public void brakeGpl() {
        gplEngine.get().brake();
    }

    public void brakeElectric() {
        electricEngine.get().brake();
    }
}
