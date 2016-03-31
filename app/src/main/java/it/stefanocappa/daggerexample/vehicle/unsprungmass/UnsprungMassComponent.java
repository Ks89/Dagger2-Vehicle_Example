package it.stefanocappa.daggerexample.vehicle.unsprungmass;


import javax.inject.Singleton;

import dagger.Component;
import it.stefanocappa.daggerexample.vehicle.unsprungmass.wheel.WheelModule;

/**
 * Created by Ks89 on 14/03/16.
 */
@Singleton
@Component(modules = {WheelModule.class})
public interface UnsprungMassComponent {
    UnsprungMass unsprungMass();
}