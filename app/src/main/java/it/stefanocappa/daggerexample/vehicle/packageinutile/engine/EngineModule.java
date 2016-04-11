package it.stefanocappa.daggerexample.vehicle.packageinutile.engine;

import dagger.Module;
import dagger.Provides;
import it.stefanocappa.daggerexample.vehicle.packageinutile.Electric;
import it.stefanocappa.daggerexample.vehicle.packageinutile.Gpl;
import it.stefanocappa.daggerexample.vehicle.packageinutile.Petrol;

@Module
public class EngineModule {
  @Provides @Gpl
  Engine provideGplEngine(GplEngine engine) {
    return engine;
  }

  @Provides @Petrol
  Engine providePetrolEngine(PetrolEngine engine) {
    return engine;
  }

  @Provides @Electric
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
