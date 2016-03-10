package it.stefanocappa.daggerexample.coffeeexample;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Ks89 on 14/03/16.
 */
@Singleton
@Component(modules = { FillerModule.class, DripCoffeeModule.class })
public interface CoffeeComponent {
    CoffeeMaker maker();
}