package it.stefanocappa.daggerexample.vehicleexample.unsprungmass;

import java.util.List;

import dagger.Module;
import dagger.Provides;
import it.stefanocappa.daggerexample.vehicleexample.unsprungmass.wheel.Suspension;
import it.stefanocappa.daggerexample.vehicleexample.unsprungmass.wheel.Tire;

/**
 * Created by Ks89 on 26/03/16.
 */
@Module
public class UnsprungMassModule {

    @Provides
    UnsprungMass provideWheelInfrastructure(List<Tire> tires, Suspension suspension) {
        return new UnsprungMassMassImpl(tires, suspension);
    }


}
