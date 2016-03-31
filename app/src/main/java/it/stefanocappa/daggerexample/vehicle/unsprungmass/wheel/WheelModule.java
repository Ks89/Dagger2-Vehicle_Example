package it.stefanocappa.daggerexample.vehicle.unsprungmass.wheel;


import java.util.ArrayList;
import java.util.List;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelModule {

    @Provides
    List<Wheel> provideWheels() {
        List<Wheel> t = new ArrayList<>();
        t.add(new Wheel(new SuspensionImpl(), new TireImpl()));
        t.add(new Wheel(new SuspensionImpl(), new TireImpl()));
        t.add(new Wheel(new SuspensionImpl(), new TireImpl()));
        t.add(new Wheel(new SuspensionImpl(), new TireImpl()));
        return t;
    }

//    @Provides
//    List<Tire> provideTires() {
//        List<Tire> t = new ArrayList<>();
//        t.add(new TireImpl());
//        t.add(new TireImpl());
//        t.add(new TireImpl());
//        t.add(new TireImpl());
//        return t;
//    }
//
//    @Provides
//    Suspension provideSuspension() {
//        return new SuspensionImpl();
//    }

}
