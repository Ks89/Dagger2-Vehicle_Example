package it.stefanocappa.daggerexample.vehicle.sprungmass.tank;

import dagger.Module;
import dagger.Provides;
import it.stefanocappa.daggerexample.vehicle.sprungmass.Electric;
import it.stefanocappa.daggerexample.vehicle.sprungmass.Gpl;
import it.stefanocappa.daggerexample.vehicle.sprungmass.Named;
import it.stefanocappa.daggerexample.vehicle.sprungmass.Petrol;
import it.stefanocappa.daggerexample.vehicle.sprungmass.engine.EngineModule;

@Module(includes = EngineModule.class)
public class TankModule {
    @Provides
    @Electric
    Tank provideBatteryPackTank() {
        return new BatteryPackTank();
    }

    @Provides
    @Petrol
    Tank providePetrolFuelTank() {
        return new PetrolTank();
    }

    @Provides
    @Gpl
    Tank provideGplFuelTank() {
        return new GplTank();
    }
}
