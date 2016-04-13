package it.stefanocappa.daggerexample.vehicle.unsprungmass.wheel;

import dagger.Module;
import dagger.Provides;

@Module
public class TireModule {
    @Provides
    Tire provideTire() {
        return new TireImpl();
    }


}