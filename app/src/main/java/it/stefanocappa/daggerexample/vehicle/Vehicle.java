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

import android.util.Log;

import it.stefanocappa.daggerexample.vehicle.sprungmass.DaggerSprungMassComponent;
import it.stefanocappa.daggerexample.vehicle.sprungmass.SprungMass;
import it.stefanocappa.daggerexample.vehicle.sprungmass.SprungMassComponent;
import it.stefanocappa.daggerexample.vehicle.unsprungmass.UnsprungMass;

public class Vehicle {
    private static final String TAG = Vehicle.class.getSimpleName();

    private SprungMass sprungMass;
    private UnsprungMass unsprungMass;

    public Vehicle(int wheelsNum) {
        //-------------------Sprung mass--------------------
        SprungMassComponent sprungMassComponent = DaggerSprungMassComponent.builder().build();
        this.sprungMass = sprungMassComponent.sprungMass();

        //-------------------Unsprung mass-------------------
        this.unsprungMass = new UnsprungMass(wheelsNum);
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
        int result = this.sprungMass.acceleratePetrol(rpmRequested);
        if (result != -1) {
            this.unsprungMass.setRpm(rpmRequested);
            Log.d(TAG, "Wheel speed: " + rpmRequested);
        } else {
            Log.e(TAG, "Wheel speed 0");
        }
    }

    public void accelerateGpl(int rpmRequested) {
        int result = this.sprungMass.accelerateGpl(rpmRequested);
        if (result != -1) {
            this.unsprungMass.setRpm(rpmRequested);
            Log.d(TAG, "Wheel speed: " + rpmRequested);
        } else {
            Log.e(TAG, "Wheel speed 0");
        }
    }

    public void accelerateElectric(int rpmRequested) {
        int result = this.sprungMass.accelerateElectric(rpmRequested);
        if (result != -1) {
            this.unsprungMass.setRpm(rpmRequested);
            Log.d(TAG, "Wheel speed: " + rpmRequested);
        } else {
            Log.e(TAG, "Wheel speed 0");
        }
    }

    public void brakePetrol() {
        this.sprungMass.brakePetrol();
        this.unsprungMass.setRpm(0);
        Log.d(TAG, "Vehicle stopped");
    }

    public void brakeGpl() {
        this.sprungMass.brakeGpl();
        this.unsprungMass.setRpm(0);
        Log.d(TAG, "Vehicle stopped");
    }

    public void brakeElectric() {
        this.sprungMass.brakeElectric();
        this.unsprungMass.setRpm(0);
        Log.d(TAG, "Vehicle stopped");
    }

    public void setRpm(int rpm) {
        this.unsprungMass.setRpm(rpm);
    }

    public void setPressure(int pressure) {
        this.unsprungMass.setPressure(pressure);
    }

    public void setSize(int size) {
        this.unsprungMass.setSize(size);
    }

    public void setTireType(String type) {
        this.unsprungMass.setTireType(type);
    }

    public void setSuspensionType(String type) {
        this.unsprungMass.setSuspensionType(type);
    }

    public int getRpm() {
        return this.unsprungMass.getAveragePressure();
    }

    public int getRpmSingleTire(int tireNumber) {
        return this.unsprungMass.getRpmSingleTire(tireNumber);
    }

    public int getAveragePressure() {
        return this.unsprungMass.getAveragePressure();
    }

    public int getPressureSingleTire(int tireNumber) {
        return this.unsprungMass.getPressureSingleTire(tireNumber);
    }

    public int getSize() {
        return this.unsprungMass.getSize();
    }

    public String getTireType() {
        return this.unsprungMass.getTireType();
    }

    public String getSuspensionType() {
        return this.unsprungMass.getSuspensionType();
    }

}
