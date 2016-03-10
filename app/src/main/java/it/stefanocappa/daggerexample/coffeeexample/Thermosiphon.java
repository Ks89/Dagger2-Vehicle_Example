package it.stefanocappa.daggerexample.coffeeexample;

import android.util.Log;

import javax.inject.Inject;

class Thermosiphon implements Pump {
  private final Heater heater;

  //if a class gas inject-annotated filds but no inject-annotated constructor, Dagger will inject those fileds
  //if requested, but will not create new instances. Add a no-argument constructor with the inject annotation
  //to indicate that Dagger may create instances as well.
  //Sagger also supporta method injection, though constructor or field injection are typically preferred

  @Inject
  Thermosiphon(Heater heater) {
    this.heater = heater;
  }

  @Override public void pump() {
    if (heater.isHot()) {
      Log.d("DaggerExample", "=> => pumping hot water => =>");
    }
  }
}
