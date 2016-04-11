package it.stefanocappa.daggerexample.officialgooglesample.packageinutile.tank;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import it.stefanocappa.daggerexample.officialgooglesample.packageinutile.Electric;
import it.stefanocappa.daggerexample.officialgooglesample.packageinutile.Gpl;
import it.stefanocappa.daggerexample.officialgooglesample.packageinutile.Petrol;
import it.stefanocappa.daggerexample.officialgooglesample.packageinutile.engine.EngineModule;

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