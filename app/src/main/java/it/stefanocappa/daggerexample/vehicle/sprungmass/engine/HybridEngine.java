//package it.stefanocappa.daggerexample.vehicle.sprungmass.engine;
//
//
//import java.util.List;
//
//import javax.inject.Inject;
//
///**
// * Created by Ks89 on 21/03/16.
// */
//public class HybridEngine {
//    private List<Engine> engines;
//
//    @Inject
//    public HybridEngine(List<Engine> engines) {
//        this.engines = engines;
//    }
//
//    public void add(Motor motor) {
//        engines.add(motor);
//    }
//
//    public void remove(Motor motor) {
//        engines.remove(motor);
//    }
//
//    @Override
//    public int getRpm() {
//        int rpmAvg = 0;
//        for (Engine engine : engines) {
//            rpmAvg += engine.getRpm();
//        }
//        return rpmAvg / engines.size();
//    }
//
//    @Override
//    public int getEnergy() {
//        int energy = 0;
//        for (Engine engine : engines) {
//            energy += engine.getEnergy();
//        }
//        return energy;
//    }
//
//    @Override
//    public void accelerate(int rpm) {
//        for (Engine engine : engines) {
//            engine.accelerate(rpm);
//        }
//    }
//
//    @Override
//    public void brake() {
//        for (Engine engine : engines) {
//            engine.brake();
//        }
//    }
//}
