package it.stefanocappa.daggerexample.vehicle.sprungmass.tank;

public interface Tank {
  void refill(int level);
  int getCurrentLevel();
  void setCurrentLevel(int levelToSet);
  boolean isFull();
}
