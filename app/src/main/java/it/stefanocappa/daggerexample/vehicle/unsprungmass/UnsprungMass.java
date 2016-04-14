package it.stefanocappa.daggerexample.vehicle.unsprungmass;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import it.stefanocappa.daggerexample.vehicle.unsprungmass.wheel.Wheel;

public class UnsprungMass {

    private boolean abs = true;
    private boolean esc = true;

    @Inject
    Wheel wheel;

    @Inject
    List<Wheel> wheels;

    @Inject
    UnsprungMass() {
    }

    public int testMethodCall(int i) {
        return wheel.callExpMethod(i);
    }

    public List<Integer> testMethodCall(List<Integer> intElem) {
        List<Integer> returned = new ArrayList<>(wheels.size());

        for (int i = 0; i < wheels.size(); i++) {
            returned.add(wheels.get(i).callExpMethod(intElem.get(i)));
        }

        return returned;
    }


}
