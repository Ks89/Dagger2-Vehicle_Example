package it.stefanocappa.daggerexample.vehicleexample.sprungmass.tank;

import dagger.Module;
import dagger.Provides;
import it.stefanocappa.daggerexample.vehicleexample.sprungmass.EngineModule;
import it.stefanocappa.daggerexample.vehicleexample.sprungmass.Named;

@Module(includes = EngineModule.class)
public class TankModule {
    @Provides
    @Named("battery_pack")
    Tank provideBatteryPackTank() {
        return new BatteryPackTank();
    }

    @Provides
    @Named("petrol_tank")
    Tank providePetrolFuelTank() {
        return new PetrolTank();
    }

    @Provides
    @Named("gpl_tank")
    Tank provideGplFuelTank() {
        return new GplTank();
    }
}
