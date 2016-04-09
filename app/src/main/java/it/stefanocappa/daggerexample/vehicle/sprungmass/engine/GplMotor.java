package it.stefanocappa.daggerexample.vehicle.sprungmass.engine;

import android.util.Log;

import javax.inject.Inject;

import it.stefanocappa.daggerexample.vehicle.sprungmass.Gpl;
import it.stefanocappa.daggerexample.vehicle.sprungmass.Named;
import it.stefanocappa.daggerexample.vehicle.sprungmass.tank.Tank;

/**
 * Created by Ks89 on 17/03/16.
 */
public class GplMotor extends Motor {
    private int energy = 0;

    @Inject
    public GplMotor(@Gpl Tank tank) {
        this.tank = tank;
        this.energy = this.tank.getLevel();
    }

    @Override
    public int getEnergy() {
        return energy;
    }

    @Override
    public void accelerate(int rpm) {
        if (tank.getLevel() > 0) {
            Log.d("DaggerExample", "Gpl engine accelerating with energy: " + energy);
            super.rpm = rpm;
            this.energy = 0;
        }
    }

    @Override
    public void brake() {
        Log.d("DaggerExample", "Gpl braking ");
    }
}
