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

package it.stefanocappa.daggerexample.vehicle.sprungmass.tank;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import it.stefanocappa.daggerexample.vehicle.sprungmass.Electric;
import it.stefanocappa.daggerexample.vehicle.sprungmass.Gpl;
import it.stefanocappa.daggerexample.vehicle.sprungmass.Petrol;
import it.stefanocappa.daggerexample.vehicle.sprungmass.engine.EngineModule;

@Module(includes = EngineModule.class)
public class TankModule {
    @Provides
    @Singleton
    @Gpl
    Tank provideGplTank() {
        return new GplTank();
    }

    @Provides
    @Singleton
    @Petrol
    Tank providePetrolTank() {
        return new PetrolTank();
    }

    @Provides
    @Singleton
    @Electric
    Tank provideElectricTank() {
        return new ElectricTank();
    }
}