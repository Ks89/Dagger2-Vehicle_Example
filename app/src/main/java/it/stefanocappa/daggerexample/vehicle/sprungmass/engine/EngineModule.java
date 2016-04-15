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

import dagger.Module;
import dagger.Provides;
import it.stefanocappa.daggerexample.vehicle.sprungmass.Electric;
import it.stefanocappa.daggerexample.vehicle.sprungmass.Gpl;
import it.stefanocappa.daggerexample.vehicle.sprungmass.Petrol;

@Module
public class EngineModule {
    @Provides
    @Gpl
    Engine provideGplEngine(GplEngine engine) {
        return engine;
    }

    @Provides
    @Petrol
    Engine providePetrolEngine(PetrolEngine engine) {
        return engine;
    }

    @Provides
    @Electric
    Engine provideElectricEngine(ElectricEngine engine) {
        return engine;
    }

    //    @Provides
//    @Named("hybrid_engine")
//    HybridMotor provideHybridEngine(@Gpl Tank tank1, @Petrol Tank tank2) {
//        List<Engine> e = new ArrayList<>();
//        e.add(new GplMotor(tank1));
//        e.add(new PetrolMotor(tank2));
//        return new HybridMotor(e);
//    }
//
//    @Provides
//    @Named("hybrid_electric_engine")
//    @Singleton
//    HybridMotor provideHybridElectricEngine(@Electric Tank tank1, @Petrol Tank tank2) {
//        List<Engine> e = new ArrayList<>();
//        e.add(new ElectricEngine(tank1));
//        e.add(new PetrolMotor(tank2));
//        return new HybridMotor(e);
//    }
}
