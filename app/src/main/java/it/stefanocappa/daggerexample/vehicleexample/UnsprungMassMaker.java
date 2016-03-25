package it.stefanocappa.daggerexample.vehicleexample;

import android.util.Log;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import it.stefanocappa.daggerexample.vehicleexample.unsprungmass.wheel.Suspension;
import it.stefanocappa.daggerexample.vehicleexample.unsprungmass.wheel.Tire;

@Singleton
public class UnsprungMassMaker {

    @Inject
    Suspension suspension;
    @Inject
    List<Tire> tires;

    @Inject
    UnsprungMassMaker() {
    }

    public void setSuspensionType(String type) {
        suspension.setType(type);
    }

    public void setTiresPressure(int p) {
        for (Tire t : tires) {
            t.setPressure(p);
        }
    }

    public void setTiresSize(int size) {
        for (Tire t : tires) {
            t.setSize(size);
        }
    }

    public void setSpeed(int rpm) {
        for (Tire t : tires) {
            t.setSpeed(rpm);
        }
    }

    public void setType(String type) {
        for (Tire t : tires) {
            t.setType(type);
        }
    }

    public void startWheels() {
        suspension.setType("wheels");
        tires.get(0).setSize(17);
        Log.d("DaggerExample", "startWheels ");
    }
}
