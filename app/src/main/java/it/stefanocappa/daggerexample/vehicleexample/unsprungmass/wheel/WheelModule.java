package it.stefanocappa.daggerexample.vehicleexample.unsprungmass.wheel;


import java.util.ArrayList;
import java.util.List;

import dagger.Module;
import dagger.Provides;
import it.stefanocappa.daggerexample.vehicleexample.unsprungmass.UnsprungMassModule;

@Module(includes = UnsprungMassModule.class)
public class WheelModule {

    @Provides
    List<Tire> provideTire() {
        List<Tire> t = new ArrayList<>();
        t.add(new TireImpl());
        t.add(new TireImpl());
        t.add(new TireImpl());
        t.add(new TireImpl());
        return t;
    }

    @Provides
    Suspension provideSuspension() {
        return new SuspensionImpl();
    }

}
