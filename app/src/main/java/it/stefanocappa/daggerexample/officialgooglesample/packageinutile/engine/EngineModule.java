package it.stefanocappa.daggerexample.officialgooglesample.packageinutile.engine;

import dagger.Module;
import dagger.Provides;
import it.stefanocappa.daggerexample.officialgooglesample.packageinutile.Electric;
import it.stefanocappa.daggerexample.officialgooglesample.packageinutile.Gpl;
import it.stefanocappa.daggerexample.officialgooglesample.packageinutile.Petrol;

@Module
public class EngineModule {
  @Provides @Gpl
  Engine provideGplEngine(GplEngine engine) {
    return engine;
  }

  @Provides @Petrol
  Engine providePetrolEngine(PetrolEngine engine) {
    return engine;
  }

  @Provides @Electric
  Engine provideElectricEngine(ElectricEngine engine) {
    return engine;
  }
}
