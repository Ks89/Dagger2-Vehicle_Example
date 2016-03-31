package it.stefanocappa.daggerexample.vehicle.sprungmass;

import java.util.ArrayList;
import java.util.List;

import dagger.Module;
import dagger.Provides;
import it.stefanocappa.daggerexample.vehicle.sprungmass.engine.ElectricMotor;
import it.stefanocappa.daggerexample.vehicle.sprungmass.engine.Engine;
import it.stefanocappa.daggerexample.vehicle.sprungmass.engine.GplMotor;
import it.stefanocappa.daggerexample.vehicle.sprungmass.engine.HybridMotor;
import it.stefanocappa.daggerexample.vehicle.sprungmass.engine.PetrolMotor;
import it.stefanocappa.daggerexample.vehicle.sprungmass.tank.Tank;

@Module
public class EngineModule {

    @Provides
    @Named("petrol_engine")
    Engine providePetrolEngine(@Named("petrol_tank") Tank tank) {
        return new PetrolMotor(tank);
    }

    @Provides
    @Named("electric_engine")
    Engine provideElectricEngine(@Named("battery_pack") Tank tank) {
        return new ElectricMotor(tank);
    }

    @Provides
    @Named("gpl_engine")
    Engine provideGplEngine(@Named("gpl_tank") Tank tank) {
        return new GplMotor(tank);
    }

    @Provides
    @Named("hybrid_engine")
    HybridMotor provideHybridEngine(@Named("gpl_tank") Tank tank1, @Named("petrol_tank") Tank tank2) {
        List<Engine> e = new ArrayList<>();
        e.add(new GplMotor(tank1));
        e.add(new PetrolMotor(tank2));
        return new HybridMotor(e);
    }

    @Provides
    @Named("hybrid_electric_engine")
    HybridMotor provideHybridElectricEngine(@Named("battery_pack") Tank tank1, @Named("petrol_tank") Tank tank2) {
        List<Engine> e = new ArrayList<>();
        e.add(new ElectricMotor(tank1));
        e.add(new PetrolMotor(tank2));
        return new HybridMotor(e);
    }
}
