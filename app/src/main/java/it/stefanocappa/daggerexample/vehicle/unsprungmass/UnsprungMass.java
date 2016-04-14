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

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import it.stefanocappa.daggerexample.vehicle.unsprungmass.wheel.Wheel;

public class UnsprungMass {

    private boolean abs = true;
    private boolean esc = true;

    @Inject
    Wheel wheel;

    @Inject
    List<Wheel> wheels;

    @Inject
    UnsprungMass() {
    }

    public int testMethodCall(int i) {
        return wheel.callExpMethod(i);
    }

    public List<Integer> testMethodCall(List<Integer> intElem) {
        List<Integer> returned = new ArrayList<>(wheels.size());

        for (int i = 0; i < wheels.size(); i++) {
            returned.add(wheels.get(i).callExpMethod(intElem.get(i)));
        }

        return returned;
    }


}
