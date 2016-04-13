package it.stefanocappa.daggerexample.vehicle.unsprungmass.wheel;

import dagger.Module;
import dagger.Provides;

@Module
public class SuspensionModule {
    @Provides
    Suspension provideSuspension() {
        return new SuspensionImpl();
    }


}