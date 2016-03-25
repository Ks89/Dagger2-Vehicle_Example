package it.stefanocappa.daggerexample.vehicleexample;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Lazy;
import it.stefanocappa.daggerexample.vehicleexample.sprungmass.Engine;
import it.stefanocappa.daggerexample.vehicleexample.sprungmass.HybridMotor;
import it.stefanocappa.daggerexample.vehicleexample.sprungmass.Named;
import it.stefanocappa.daggerexample.vehicleexample.sprungmass.tank.Tank;

@Singleton
public class VehicleMaker {

    private final Tank batteryPack;
    private final Tank petrolTank;
    private final Tank gplTank;

    @Inject
    @Named("petrol_engine")
    Lazy<Engine> petrolEngine;
    @Inject
    @Named("electric_engine")
    Lazy<Engine> electricEngine;
    @Inject
    @Named("gpl_engine")
    Lazy<Engine> gplEngine;

    @Inject
    @Named("hybrid_engine")
    Lazy<HybridMotor> hybridEngine;

    @Inject
    @Named("hybrid_electric_engine")
    Lazy<HybridMotor> hybridElectricEngine;

    @Inject
    VehicleMaker(@Named("battery_pack") Tank batteryPack, @Named("petrol_tank") Tank petrolTank, @Named("gpl_tank") Tank gplTank) {
        this.batteryPack = batteryPack;
        this.petrolTank = petrolTank;
        this.gplTank = gplTank;
    }

    public void startElectricMotor(int batteryLevel, int rpm) {
        Log.d("DaggerExample", "Electric Filling ");
        batteryPack.setLevel(batteryLevel);
        Log.d("DaggerExample", "Electric Accelerating ");
        electricEngine.get().accelerate(rpm);
        Log.d("DaggerExample", "Electric Braking ");
        electricEngine.get().brake();
    }

    public void startPetrolMotor(int petrolLevel, int rpm) {
        Log.d("DaggerExample", "Petrol Filling ");
        petrolTank.setLevel(petrolLevel);
        Log.d("DaggerExample", "Petrol Accelerating ");
        petrolEngine.get().accelerate(rpm);
        Log.d("DaggerExample", "Petrol Braking ");
        petrolEngine.get().brake();
    }

    public void startGplMotor(int gplLevel, int rpm) {
        Log.d("DaggerExample", "Gpl Filling ");
        gplTank.setLevel(gplLevel);
        Log.d("DaggerExample", "Gpl Accelerating ");
        gplEngine.get().accelerate(rpm);
        Log.d("DaggerExample", "Gpl Braking ");
        gplEngine.get().brake();
    }

    public void startHybridMotor(int gplLevel, int petrolLevel, int rpm) {
        Log.d("DaggerExample", "----HYBRID gpl + petrol ---");
        Log.d("DaggerExample", "Hybrid (gpl and petrol) Filling ");
        gplTank.setLevel(gplLevel);
        petrolTank.setLevel(petrolLevel);
        Log.d("DaggerExample", "Hybrid (gpl and petrol) Accelerating ");
        hybridEngine.get().accelerate(rpm);
        Log.d("DaggerExample", "Hybrid (gpl and petrol) Braking ");
        hybridEngine.get().brake();
    }

    public void startHybridElectricMotor(int batteryLevel, int petrolLevel, int rpm) {
        Log.d("DaggerExample", "----HYBRID electric + petrol---");
        Log.d("DaggerExample", "Hybrid (electric and petrol) Filling ");
        batteryPack.setLevel(batteryLevel);
        petrolTank.setLevel(petrolLevel);
        Log.d("DaggerExample", "Hybrid (electric and petrol) Accelerating ");
        hybridEngine.get().accelerate(rpm);
        Log.d("DaggerExample", "Hybrid (electric and petrol) Braking ");
        hybridEngine.get().brake();

    }


    public int getRpm() {
        return hybridEngine.get().getRpm();
    }


}
