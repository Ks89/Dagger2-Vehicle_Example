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

    //TODO implements abs and esc!!!!
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

    public void setSize(int size) {
        wheel.setSize(size);
    }

    public int getPressure() {
        return tire.getPressure();
    }

    public int getSize() {
        return wheel.getSize();
    }

    public void setPressure(int pressure) {
        tire.setPressure(pressure);
    }


    public void setSuspensionType(String suspensionType) {
        suspension.setType(suspensionType);
    }

    public String getSuspensionType() {
        return suspension.getType();
    }


}
