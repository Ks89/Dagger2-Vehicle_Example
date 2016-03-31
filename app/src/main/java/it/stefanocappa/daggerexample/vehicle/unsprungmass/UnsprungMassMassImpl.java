//package it.stefanocappa.daggerexample.vehicle.unsprungmass;
//
//
//import java.util.List;
//
//import javax.inject.Inject;
//
//import it.stefanocappa.daggerexample.vehicle.unsprungmass.wheel.Suspension;
//import it.stefanocappa.daggerexample.vehicle.unsprungmass.wheel.Tire;
//
///**
// * Created by Ks89 on 17/03/16.
// */
//public class UnsprungMassMassImpl implements UnsprungMass {
//
//    private boolean abs = true;
//    private boolean esc = true;
//
//    private List<Tire> tires;
//    private Suspension suspension;
//
//    @Inject
//    UnsprungMassMassImpl(List<Tire> tires, Suspension suspension) {
//        this.tires = tires;
//        this.suspension = suspension;
//    }
//
//
//    @Override
//    public int getSpeed() {
//        return 0;
//    }
//
//    @Override
//    public void accelerate(int rpm) {
//    }
//
//    @Override
//    public void brake() {
//
//    }
//
//    @Override
//    public void setTirePressure(int pressure) {
//        for (Tire t : tires) {
//            t.setPressure(pressure);
//        }
//    }
//
//    @Override
//    public int getTirePressure() {
//        return tires.get(0).getPressure();
//    }
//}
