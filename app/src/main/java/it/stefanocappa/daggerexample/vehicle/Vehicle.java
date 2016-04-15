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

package it.stefanocappa.daggerexample.vehicle;

import it.stefanocappa.daggerexample.vehicle.sprungmass.DaggerSprungMassComponent;
import it.stefanocappa.daggerexample.vehicle.sprungmass.SprungMass;
import it.stefanocappa.daggerexample.vehicle.sprungmass.SprungMassComponent;
import it.stefanocappa.daggerexample.vehicle.unsprungmass.DaggerUnsprungMassComponent;
import it.stefanocappa.daggerexample.vehicle.unsprungmass.UnsprungMass;
import it.stefanocappa.daggerexample.vehicle.unsprungmass.UnsprungMassComponent;

public class Vehicle {
    private static final String TAG = Vehicle.class.getSimpleName();

    private SprungMass sprungMass;
    private UnsprungMass unsprungMass;

    public Vehicle(int wheelsNum) {

        //-------------------Sprung mass--------------------
        SprungMassComponent sprungMassComponent = DaggerSprungMassComponent.builder().build();
        this.sprungMass = sprungMassComponent.sprungMass();

        //-------------------Unsprung mass-------------------
        UnsprungMassComponent unsprungMassComponent = DaggerUnsprungMassComponent.builder()
                .build();
        this.unsprungMass = unsprungMassComponent.unsprungMass();
//        WheelComponent wheelComponent = DaggerWheelComponent.builder()
//                .build();
//        this.wheel = wheelComponent.wheel();

    }

    public UnsprungMass getUnsprungMass() {
        return this.unsprungMass;
    }

    public void refillGpl(int fuelToAdd) {
        this.sprungMass.refillGpl(fuelToAdd);
    }

    public void refillPetrol(int fuelToAdd) {
        this.sprungMass.refillPetrol(fuelToAdd);
    }

    public void refillElectric(int fuelToAdd) {
        this.sprungMass.refillElectric(fuelToAdd);
    }

    public void acceleratePetrol(int rpmRequested) {
        this.sprungMass.acceleratePetrol(rpmRequested);
    }

    public void accelerateGpl(int rpmRequested) {
        this.sprungMass.accelerateGpl(rpmRequested);
    }

    public void accelerateElectric(int rpmRequested) {
        this.sprungMass.accelerateElectric(rpmRequested);
    }

    public void brakePetrol() {
        this.sprungMass.brakePetrol();
    }

    public void brakeGpl() {
        this.sprungMass.brakeGpl();
    }

    public void brakeElectric() {
        this.sprungMass.brakeElectric();
    }
}
