package it.stefanocappa.daggerexample.vehicle.sprungmass;


import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Ks89 on 14/03/16.
 */
@Singleton
@Component(modules = {TankModule.class, EngineModule.class})
public interface SprungMassComponent {
    SprungMass sprungMass();
}