package it.stefanocappa.daggerexample.vehicleexample.sprungmass;

import android.util.Log;

import javax.inject.Inject;

import it.stefanocappa.daggerexample.vehicleexample.sprungmass.tank.Tank;

/**
 * Created by Ks89 on 17/03/16.
 */
public class PetrolMotor extends Motor {
    private int energy = 20;

    @Inject
    PetrolMotor(@Named("petrol_tank") Tank tank) {
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
            Log.d("DaggerExample", "Petrol engine accelerating with energy: " + energy);
            super.rpm = rpm;
            this.energy = 0;
        }
    }

    @Override
    public void brake() {
        Log.d("DaggerExample", "Petrol braking ");
    }
}
