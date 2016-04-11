package it.stefanocappa.daggerexample.officialgooglesample.packageinutile;

import javax.inject.Singleton;

import dagger.Component;
import it.stefanocappa.daggerexample.officialgooglesample.packageinutile.tank.TankModule;

/**
 * Created by Ks89 on 11/04/16.
 */
@Singleton
@Component(modules = { TankModule.class })
public interface SprungMassComponent {
    SprungMass sprungMass();
}