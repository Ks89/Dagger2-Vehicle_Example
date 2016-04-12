package it.stefanocappa.daggerexample.vehicle.sprungmass.tank;

public interface Tank {
  void refill(int level);
  int getCurrentLevel();
  boolean isFull();
}
