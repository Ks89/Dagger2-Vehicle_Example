package it.stefanocappa.daggerexample.coffeeexample;

import dagger.Module;
import dagger.Provides;


@Module(includes = DripCoffeeModule.class)
class FillerModule {
  @Provides Filler provideFiller() {
    return new Refiller();
  }


}
