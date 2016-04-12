package it.stefanocappa.daggerexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import it.stefanocappa.daggerexample.vehicle.Vehicle;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Vehicle v = new Vehicle();

        //.....SIMULATION.....
        //ATTENTION: to create a simple simulation I made this assumption:
        // 1rpm = 1fuel unit consumed
        // to be able to accelerate to X rpm you need at least X fuel units in your tank
        // if the acceleration will be completed, the vehicle, consume the exact amount of fuel unit passed ad rpm
        // It's stupid, I know, it's only an example!!!
        this.simulateElectricEngine(v);
        this.simulateGplEngine(v);
        this.simulatePetrolEngine(v);


        // WheelModule wheelModule = new WheelModule();
//        UnsprungMassModule unsprungMassModule = new UnsprungMassModule();
//
//        UnsprungMassComponent unsprungMassComponent = DaggerUnsprungMassComponent.builder()
//                //.wheelModule(wheelModule)
//                .unsprungMassModule(unsprungMassModule)
//                .build();
//        UnsprungMassSubComponent unsprungMassSubComponent = unsprungMassComponent.subComponent(unsprungMassModule);
//
//        UnsprungMassMaker unsprungMassMaker = unsprungMassSubComponent.getUnsprungMassMaker();
//        unsprungMassMaker.startWheels();
//        unsprungMassMaker.setType("winter");
//        unsprungMassMaker.setSpeed(sprungMass.getRpm());
//        unsprungMassMaker.setSuspensionType("semi-active");
//        unsprungMassMaker.setTiresSize(17);
//        unsprungMassMaker.setTiresPressure(32);
    }


    private void simulateGplEngine(Vehicle v) {
        Log.d(TAG, "--------------GPL---------------");
        v.refillGpl(25); //by default a tank starts empty (fuel==0)
        v.accelerateGpl(20); //ok because 25 >= 20 | fuel remaining = 5

        v.refillGpl(0); //already 5
        v.accelerateGpl(3); //ok because 5 >= 3 | fuel remaining = 2

        v.refillGpl(8); //2+8=10
        v.accelerateGpl(50); //ERROR because 10 < 50 | fuel remaining = 10 (no changes)

        v.refillGpl(10); //10+10=20
        v.refillGpl(100); //20+100=120 //ERROR you exceeded the capacity

        v.brakeGpl();
    }

    private void simulatePetrolEngine(Vehicle v) {
        Log.d(TAG, "--------------PETROL---------------");
        v.refillPetrol(25); //by default a tank starts empty (fuel==0)
        v.acceleratePetrol(20); //ok because 25 >= 20 | fuel remaining = 5

        v.refillPetrol(0); //already 5
        v.acceleratePetrol(3); //ok because 5 >= 3 | fuel remaining = 2

        v.refillPetrol(8); //2+8=10
        v.acceleratePetrol(50); //ERROR because 10 < 50 | fuel remaining = 10 (no changes)

        v.refillPetrol(10); //10+10=20
        v.refillPetrol(100); //20+100=120 //ERROR you exceeded the capacity

        v.brakePetrol();
    }


    private void simulateElectricEngine(Vehicle v) {
        Log.d(TAG, "--------------ELECTRIC---------------");
        v.refillElectric(25); //by default a tank starts empty (fuel==0)
        v.accelerateElectric(20); //ok because 25 >= 20 | fuel remaining = 5

        v.refillElectric(0); //already 5
        v.accelerateElectric(3); //ok because 5 >= 3 | fuel remaining = 2

        v.refillElectric(8); //2+8=10
        v.accelerateElectric(50); //ERROR because 10 < 50 | fuel remaining = 10 (no changes)

        v.refillElectric(10); //10+10=20
        v.refillElectric(100); //20+100=120 //ERROR you exceeded the capacity

        v.brakeElectric();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
