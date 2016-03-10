package it.stefanocappa.daggerexample.coffeeexample;


public class CoffeeApp {

  public static void main(String[] args) {
    CoffeeComponent coffeeComponent = DaggerCoffeeComponent.builder().build();
    coffeeComponent.maker().brew();
  }
}
