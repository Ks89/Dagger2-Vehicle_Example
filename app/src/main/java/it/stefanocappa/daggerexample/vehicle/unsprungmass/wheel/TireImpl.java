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

package it.stefanocappa.daggerexample.vehicle.unsprungmass.wheel;

/**
 * Created by Ks89 on 24/03/16.
 */
public class TireImpl implements Tire {

    private int size;
    private int pressure;
    private int rpm;
    private String type;

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int getPressure() {
        return pressure;
    }

    @Override
    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int getRpm() {
        return rpm;
    }

    @Override
    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    @Override
    public String getType() {
        return type;
    }
}
