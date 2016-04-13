package it.stefanocappa.daggerexample.vehicle.unsprungmass.wheel;


import dagger.Component;


/**
 * Created by Ks89 on 11/04/16.
 */
@Component(modules = {WheelModule.class})
public interface WheelComponent {
    Wheel wheel();
}
