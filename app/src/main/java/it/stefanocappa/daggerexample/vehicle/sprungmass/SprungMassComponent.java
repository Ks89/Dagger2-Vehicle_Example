package it.stefanocappa.daggerexample.vehicle.sprungmass;


import javax.inject.Singleton;

import dagger.Component;
import it.stefanocappa.daggerexample.vehicle.sprungmass.engine.EngineModule;
import it.stefanocappa.daggerexample.vehicle.sprungmass.tank.TankModule;

/**
 * Created by Ks89 on 14/03/16.
 */
@Singleton
@Component(modules = {TankModule.class, EngineModule.class})
public interface SprungMassComponent {
    SprungMass sprungMass();
}