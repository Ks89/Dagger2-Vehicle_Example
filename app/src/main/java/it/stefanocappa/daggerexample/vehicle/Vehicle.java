package it.stefanocappa.daggerexample.vehicle;

import hugo.weaving.DebugLog;
import it.stefanocappa.daggerexample.vehicle.sprungmass.DaggerSprungMassComponent;
import it.stefanocappa.daggerexample.vehicle.sprungmass.SprungMass;
import it.stefanocappa.daggerexample.vehicle.sprungmass.SprungMassComponent;
import it.stefanocappa.daggerexample.vehicle.sprungmass.engine.EngineModule;
import it.stefanocappa.daggerexample.vehicle.unsprungmass.DaggerUnsprungMassComponent;
import it.stefanocappa.daggerexample.vehicle.unsprungmass.UnsprungMass;
import it.stefanocappa.daggerexample.vehicle.unsprungmass.UnsprungMassComponent;

public class Vehicle {

    SprungMass sprungMass;
    UnsprungMass unsprungMass;

    public Vehicle() {

        EngineModule engineModule = new EngineModule();

        SprungMassComponent sprungMassComponent = DaggerSprungMassComponent.builder()
                //.tankModule(new TankModule())
                .engineModule(engineModule)
                .build();

        this.sprungMass = sprungMassComponent.sprungMass();

        UnsprungMassComponent unsprungMassComponent = DaggerUnsprungMassComponent.builder()
                //.unsprungMassModule(new UnsprungMassModule())
                .build();

        this.unsprungMass = unsprungMassComponent.unsprungMass();
    }

    @DebugLog
    public void setLevel(int level) {
        sprungMass.setLevel(level);
    }

    public int getRpm() {
        return sprungMass.getRpm();
    }

    public void acceleratePetrolEngine(int rpm) {
        sprungMass.acceleratePetrolEngine(rpm);
    }

    public void startPetrolMotor(int level, int rpm) {
        sprungMass.startPetrolMotor(level, rpm);
    }

    public void startGplMotor(int level, int rpm) {
        sprungMass.startGplMotor(level, rpm);
    }

    public void startElectricMotor(int level, int rpm) {
        sprungMass.startElectricMotor(level, rpm);
    }
}
