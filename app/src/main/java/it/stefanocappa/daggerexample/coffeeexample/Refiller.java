package it.stefanocappa.daggerexample.coffeeexample;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;

class Refiller implements Filler {
  boolean full = false;

  @Inject
  Refiller() {
  }

  @Override public void fill() {
    Log.d("DaggerExample", " || || || filling water || || ||");
    this.full = true;
  }
  @Override public boolean isFull() {
    return full;
  }

}
