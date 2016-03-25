package it.stefanocappa.daggerexample.vehicleexample.unsprungmass;


import javax.inject.Singleton;

import dagger.Component;
import it.stefanocappa.daggerexample.vehicleexample.unsprungmass.wheel.WheelModule;

/**
 * Created by Ks89 on 14/03/16.
 */
@Singleton
@Component(modules = {WheelModule.class, UnsprungMassModule.class})
public interface UnsprungMassComponent {
    UnsprungMassSubComponent subComponent(UnsprungMassModule unsprungMassModule);
}