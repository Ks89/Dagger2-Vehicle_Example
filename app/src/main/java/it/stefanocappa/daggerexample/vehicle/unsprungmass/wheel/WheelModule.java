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
    Wheel provideWheel() {
        return new Wheel();
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