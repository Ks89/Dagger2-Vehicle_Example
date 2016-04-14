package it.stefanocappa.daggerexample.vehicle.unsprungmass.wheel;

import java.util.ArrayList;
import java.util.List;

import dagger.Module;
import dagger.Provides;

@Module(includes = {SuspensionModule.class, TireModule.class})
public class WheelModule {
    @Provides
    Wheel provideWheel() {
        return new Wheel();
    }

    @Provides
    List<Wheel> provideWheels() {
        int wheelNumber = 4;
        List<Wheel> wheels = new ArrayList<>(wheelNumber);
        for (int i = 0; i < wheelNumber; i++) {
            wheels.add(new Wheel());
        }
        return wheels;
    }
}