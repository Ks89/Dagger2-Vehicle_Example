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

import javax.inject.Inject;

import it.stefanocappa.daggerexample.vehicle.unsprungmass.wheel.Wheel;
import it.stefanocappa.daggerexample.vehicle.unsprungmass.wheel.suspension.Suspension;
import it.stefanocappa.daggerexample.vehicle.unsprungmass.wheel.tire.Tire;

/**
 * Created by Ks89 on 30/03/16.
 */
public class WheelInfrastructure {

    //true by default
    private boolean abs = true;
    private boolean esc = true;

    @Inject
    Tire tire;
    @Inject
    Suspension suspension;

    @Inject
    Wheel wheel;

    @Inject
    public WheelInfrastructure() {
    }

    public void setRpm(int rpm) {
        tire.setRpm(rpm);
    }

    public void setPressure(int pressure) {
        tire.setPressure(pressure);
    }

    public void setSize(int size) {
        tire.setSize(size);
    }

    public void setTireType(String type) {
        tire.setType(type);
    }

    public void setSuspensionType(String type) {
        suspension.setType(type);
    }

    public int getRpm() {
        return tire.getRpm();
    }

    public int getPressure() {
        return tire.getPressure();
    }

    public int getSize() {
        return tire.getSize();
    }

    public String getTireType() {
        return tire.getType();
    }

    public String getSuspensionType() {
        return suspension.getType();
    }

    public boolean isAbs() {
        return abs;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    public boolean isEsc() {
        return esc;
    }

    public void setEsc(boolean esc) {
        this.esc = esc;
    }
}
