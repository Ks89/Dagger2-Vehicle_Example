package it.stefanocappa.daggerexample.vehicle.sprungmass.engine;

public interface Engine {
  int getRpm();

  void accelerate(int rpm);

  void brake();
}
