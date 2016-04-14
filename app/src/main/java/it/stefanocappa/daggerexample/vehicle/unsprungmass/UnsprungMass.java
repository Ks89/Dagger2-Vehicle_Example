/*
Copyright 2016 Stefano Cappa
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
    http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

package it.stefanocappa.daggerexample.vehicle.unsprungmass;

import java.util.List;

import javax.inject.Inject;

import it.stefanocappa.daggerexample.vehicle.unsprungmass.wheel.Wheel;

public class UnsprungMass {

    //TODO implements abs and esc!!!!
    private boolean abs = true;
    private boolean esc = true;

    @Inject
    List<Wheel> wheels;

    @Inject
    UnsprungMass() {
    }

    public void setRpm(int rpm) {
        for (int i = 0; i < wheels.size(); i++) {
            wheels.get(i).setRpm(rpm);
        }
    }

    public void setPressure(int pressure) {
        for (int i = 0; i < wheels.size(); i++) {
            wheels.get(i).setPressure(pressure);
        }
    }

    public void setSize(int size) {
        for (int i = 0; i < wheels.size(); i++) {
            wheels.get(i).setSize(size);
        }
    }

    public void setTireType(String type) {
        for (int i = 0; i < wheels.size(); i++) {
            wheels.get(i).setTireType(type);
        }
    }

    public void setSuspensionType(String type) {
        for (int i = 0; i < wheels.size(); i++) {
            wheels.get(i).setSuspensionType(type);
        }
    }

    public int getRpm() { //averagePressure
        // Rpm should equals to all tires, but I decided to implement this because it's more general
        int avgRpm = 0;
        for (int i = 0; i < wheels.size(); i++) {
            avgRpm = avgRpm + wheels.get(i).getRpm();
        }
        return avgRpm / wheels.size();
    }

    public int getRpmSingleTire(int tireNumber) {
        if (wheels.size() > tireNumber) {
            return wheels.get(tireNumber).getRpm();
        } else {
            return -1;
        }
    }

    public int getAveragePressure() {
        int avgPressure = 0;
        for (int i = 0; i < wheels.size(); i++) {
            avgPressure = avgPressure + wheels.get(i).getPressure();
        }
        return avgPressure / wheels.size();
    }

    public int getPressureSingleTire(int tireNumber) {
        if (wheels.size() > tireNumber) {
            return wheels.get(tireNumber).getPressure();
        } else {
            return -1;
        }
    }

    //all tires must have the same size
    public int getSize() {
        if (wheels.size() > 0) {
            return wheels.get(0).getSize();
        } else {
            return -1;
        }
    }

    //all tires must have the same size
    public String getTireType() {
        if (wheels.size() > 0) {
            return wheels.get(0).getTireType();
        } else {
            return null;
        }
    }

    //all suspensions must have the same type
    public String getSuspensionType() {
        if (wheels.size() > 0) {
            return wheels.get(0).getSuspensionType();
        } else {
            return null;
        }
    }
}
