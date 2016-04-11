package it.stefanocappa.daggerexample.vehicle.sprungmass.tank;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import it.stefanocappa.daggerexample.vehicle.sprungmass.Electric;
import it.stefanocappa.daggerexample.vehicle.sprungmass.Gpl;
import it.stefanocappa.daggerexample.vehicle.sprungmass.Petrol;
import it.stefanocappa.daggerexample.vehicle.sprungmass.engine.EngineModule;

@Module(includes = EngineModule.class)
public class TankModule {
    @Provides
    @Singleton
    @Gpl
    Tank provideGplTank() {
        return new GplTank();
    }

    @Provides
    @Singleton
    @Petrol
    Tank providePetrolTank() {
        return new PetrolTank();
    }

    @Provides
    @Singleton
    @Electric
    Tank provideElectricTank() {
        return new ElectricTank();
    }
}