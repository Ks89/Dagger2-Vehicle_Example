package it.stefanocappa.daggerexample.coffeeexample;

import android.util.Log;

import javax.inject.Inject;

class ElectricHeater implements Heater {
    boolean heating;
    private final Filler filler;

    @Inject
    ElectricHeater(Filler filler) {
        this.filler = filler;
    }

    @Override
    public void on() {
        Log.d("DaggerExample", "~ ~ ~ heating water ~ ~ ~");
        this.heating = true;
    }

    @Override
    public void off() {
        this.heating = false;
    }

    @Override
    public boolean isHot() {
        return heating;
    }
}
