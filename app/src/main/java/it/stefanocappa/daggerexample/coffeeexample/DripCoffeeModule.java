package it.stefanocappa.daggerexample.coffeeexample;

import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module(includes = PumpModule.class)
class DripCoffeeModule {
  //all provides methods must belong to a module.
  @Provides @Singleton Heater provideHeater(Refiller filler) {
    return new ElectricHeater(filler);
  }
}
