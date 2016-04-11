package it.stefanocappa.daggerexample.officialgooglesample.packageinutile.engine;

import dagger.Module;
import dagger.Provides;
import it.stefanocappa.daggerexample.officialgooglesample.packageinutile.Gpl;
import it.stefanocappa.daggerexample.officialgooglesample.packageinutile.Petrol;

@Module
public class EngineModule {
  @Provides @Gpl
  Engine provideGplEngine(GplEngine engine) {
    return engine;
  }

//  @Provides
//  Engine providePetrolEngine(@Petrol PetrolEngine engine) {
//    return engine;
//  }
}
