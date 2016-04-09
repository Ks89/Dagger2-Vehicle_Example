package it.stefanocappa.daggerexample.vehicle.sprungmass.engine;

import java.util.ArrayList;
import java.util.List;

import dagger.Module;
import dagger.Provides;
import it.stefanocappa.daggerexample.vehicle.sprungmass.Electric;
import it.stefanocappa.daggerexample.vehicle.sprungmass.Gpl;
import it.stefanocappa.daggerexample.vehicle.sprungmass.Named;
import it.stefanocappa.daggerexample.vehicle.sprungmass.Petrol;
import it.stefanocappa.daggerexample.vehicle.sprungmass.tank.Tank;

@Module
public class EngineModule {

    @Provides
    @Petrol
    Engine providePetrolEngine(@Petrol Tank tank) {
        return new PetrolMotor(tank);
    }

    @Provides
    @Electric
    Engine provideElectricEngine(@Electric Tank tank) {
        return new ElectricMotor(tank);
    }

    @Provides
    @Gpl
    Engine provideGplEngine(@Gpl Tank tank) {
        return new GplMotor(tank);
    }

    @Provides
    @Named("hybrid_engine")
    HybridMotor provideHybridEngine(@Gpl Tank tank1, @Petrol Tank tank2) {
        List<Engine> e = new ArrayList<>();
        e.add(new GplMotor(tank1));
        e.add(new PetrolMotor(tank2));
        return new HybridMotor(e);
    }

    @Provides
    @Named("hybrid_electric_engine")
    HybridMotor provideHybridElectricEngine(@Electric Tank tank1, @Petrol Tank tank2) {
        List<Engine> e = new ArrayList<>();
        e.add(new ElectricMotor(tank1));
        e.add(new PetrolMotor(tank2));
        return new HybridMotor(e);
    }
}
