package it.stefanocappa.daggerexample.vehicle.unsprungmass.wheel;

import dagger.Module;
import dagger.Provides;

@Module(includes = {SuspensionModule.class, TireModule.class})
public class WheelModule {
    @Provides
    Wheel provideWheel() {
        return new Wheel();
    }


}