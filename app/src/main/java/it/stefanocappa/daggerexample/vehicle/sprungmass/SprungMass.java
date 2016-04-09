package it.stefanocappa.daggerexample.vehicle.sprungmass;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Lazy;
import it.stefanocappa.daggerexample.vehicle.sprungmass.engine.Engine;
import it.stefanocappa.daggerexample.vehicle.sprungmass.tank.Tank;

/**
 * Created by Ks89 on 31/03/16.
 */
@Singleton
public class SprungMass {

    //private String transmissionType;

    private final Tank batteryPack;
    private final Tank petrolTank;
    private final Tank gplTank;

    @Inject
    @Petrol
    Lazy<Engine> petrolEngine;
    @Inject
    @Electric
    Lazy<Engine> electricEngine;
    @Inject
    @Gpl
    Lazy<Engine> gplEngine;

    @Inject
    SprungMass(@Electric Tank batteryPack, @Petrol Tank petrolTank, @Gpl Tank gplTank) {
        this.batteryPack = batteryPack;
        this.petrolTank = petrolTank;
        this.gplTank = gplTank;
    }

    public void startPetrolMotor(int petrolLevel, int rpm) {
        Log.d("DaggerExample", "Petrol Filling ");
        petrolTank.setLevel(petrolLevel);
        Log.d("DaggerExample", "Petrol Accelerating ");
        petrolEngine.get().accelerate(rpm);
        Log.d("DaggerExample", "Petrol Braking ");
        petrolEngine.get().brake();
    }

    public void startElectricMotor(int level, int rpm) {
        Log.d("DaggerExample", "Electric charging ");
        batteryPack.setLevel(level);
        Log.d("DaggerExample", "Electric Accelerating ");
        electricEngine.get().accelerate(rpm);
        Log.d("DaggerExample", "Electric Braking ");
        electricEngine.get().brake();
    }

    public void startGplMotor(int level, int rpm) {
        Log.d("DaggerExample", "Gpl Filling ");
        gplTank.setLevel(level);
        Log.d("DaggerExample", "Gpl Accelerating ");
        gplEngine.get().accelerate(rpm);
        Log.d("DaggerExample", "Gpl Braking ");
        gplEngine.get().brake();
    }


    public void setLevel(int level) {
        gplTank.setLevel(level);
    }

    public int getRpm() {
        return electricEngine.get().getRpm();
    }

    public void acceleratePetrolEngine(int rpm) {
        petrolEngine.get().accelerate(rpm);
    }

}
