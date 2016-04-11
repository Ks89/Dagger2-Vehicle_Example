package it.stefanocappa.daggerexample.vehicle.packageinutile.engine;

public interface Engine {
  int getRpm();

  int getEnergy();

  void accelerate(int rpm);

  void brake();
}
