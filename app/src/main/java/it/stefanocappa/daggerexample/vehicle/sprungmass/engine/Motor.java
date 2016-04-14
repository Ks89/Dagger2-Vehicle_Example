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

package it.stefanocappa.daggerexample.vehicle.sprungmass.engine;

import it.stefanocappa.daggerexample.vehicle.sprungmass.tank.Tank;

/**
 * Created by Ks89 on 21/03/16.
 */
public abstract class Motor implements Engine {
    protected Tank tank;

    protected int rpm = 0;

    @Override
    public int getRpm() {
        return this.rpm;
    }

    public abstract void accelerate(int rpm);

    public abstract void brake();
}
