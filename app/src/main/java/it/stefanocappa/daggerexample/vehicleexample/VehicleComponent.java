package it.stefanocappa.daggerexample.vehicleexample;


import javax.inject.Singleton;

import dagger.Component;
import it.stefanocappa.daggerexample.vehicleexample.sprungmass.EngineModule;
import it.stefanocappa.daggerexample.vehicleexample.sprungmass.tank.TankModule;

/**
 * Created by Ks89 on 14/03/16.
 */
@Singleton
@Component(modules = {TankModule.class, EngineModule.class})
public interface VehicleComponent {
    VehicleMaker maker();
}