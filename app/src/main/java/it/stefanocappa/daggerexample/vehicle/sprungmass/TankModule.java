package it.stefanocappa.daggerexample.vehicle.sprungmass;

import dagger.Module;
import dagger.Provides;
import it.stefanocappa.daggerexample.vehicle.sprungmass.tank.BatteryPackTank;
import it.stefanocappa.daggerexample.vehicle.sprungmass.tank.GplTank;
import it.stefanocappa.daggerexample.vehicle.sprungmass.tank.PetrolTank;
import it.stefanocappa.daggerexample.vehicle.sprungmass.tank.Tank;

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
