package it.stefanocappa.daggerexample.vehicle.packageinutile;

import javax.inject.Singleton;

import dagger.Component;
import it.stefanocappa.daggerexample.vehicle.packageinutile.tank.TankModule;

/**
 * Created by Ks89 on 11/04/16.
 */
@Singleton
@Component(modules = { TankModule.class })
public interface SprungMassComponent {
    SprungMass sprungMass();
}