package it.stefanocappa.daggerexample.vehicle;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

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
    //private Wheel wheel;

    public Vehicle() {
        SprungMassComponent sprungMassComponent = DaggerSprungMassComponent.builder().build();
        this.sprungMass = sprungMassComponent.sprungMass();

        //----------------EXPERIMEMTAL - CRAZY THINGS!!!!-------
        UnsprungMassComponent unsprungMassComponent = DaggerUnsprungMassComponent.builder().build();
        this.unsprungMass = unsprungMassComponent.unsprungMass();
        int res = this.unsprungMass.testMethodCall(5);

        List<Integer> values = new ArrayList<>(4);
        values.add(2);
        values.add(4);
        values.add(7);
        values.add(6);

        List<Integer> list = this.unsprungMass.testMethodCall(values);
        for (Integer i : list) {
            Log.d(TAG, "returned: " + i);
        }
        //------------------------------------------------------

//        WheelComponent wheelComponent = DaggerWheelComponent.builder().build();
//        this.wheel = wheelComponent.wheel();
    }

    public void testCallMethod(int i) {
        this.unsprungMass.testMethodCall(i);
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
