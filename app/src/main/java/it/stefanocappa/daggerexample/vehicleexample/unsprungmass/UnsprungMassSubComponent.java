package it.stefanocappa.daggerexample.vehicleexample.unsprungmass;


import javax.inject.Singleton;

import dagger.Subcomponent;
import it.stefanocappa.daggerexample.vehicleexample.UnsprungMassMaker;

/**
 * Created by Ks89 on 14/03/16.
 */
@Singleton
@Subcomponent(modules = {UnsprungMassModule.class})
public interface UnsprungMassSubComponent {
    UnsprungMassMaker getUnsprungMassMaker();
}