package it.stefanocappa.daggerexample.officialgooglesample.packageinutile.tank;

import dagger.Module;
import dagger.Provides;
import it.stefanocappa.daggerexample.officialgooglesample.packageinutile.Gpl;
import it.stefanocappa.daggerexample.officialgooglesample.packageinutile.Petrol;
import it.stefanocappa.daggerexample.officialgooglesample.packageinutile.engine.EngineModule;

import javax.inject.Singleton;

@Module(includes = EngineModule.class)
public class TankModule {
  @Provides @Singleton
  Tank provideGplTank() {
    return new GplTank();
  }
//
//  @Provides @Singleton @Petrol
//  Tank providePetrolTank() {
//    return new PetrolTank();
//  }
}