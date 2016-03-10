package it.stefanocappa.daggerexample.coffeeexample;

import android.util.Log;

import dagger.Lazy;
import javax.inject.Inject;

public class CoffeeMaker {
  private final Lazy<Heater> heater; // Create a possibly costly heater only when we use it.
  private final Pump pump;
  private final Filler filler;

  @Inject CoffeeMaker(Lazy<Heater> heater, Pump pump, Filler filler) {
    this.heater = heater;
    this.pump = pump;
    this.filler = filler;
  }

  public void brew() {
    filler.fill();
    heater.get().on();
    pump.pump();
    Log.d("DaggerExample", " [_]P coffee! [_]P ");
    heater.get().off();
  }
}
