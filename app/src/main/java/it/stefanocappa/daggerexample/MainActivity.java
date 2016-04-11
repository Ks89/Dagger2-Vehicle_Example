package it.stefanocappa.daggerexample;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import it.stefanocappa.daggerexample.vehicle.Vehicle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        Vehicle p = new Vehicle();
        p.startEngines(25, 20);

//        SprungMass v = new SprungMass();
//        v.startGplMotor(10, 50);

//        v.accelerateGplEngine(15);
//        v.setGplLevel(10);
//
//        Log.d(MainActivity.class.getSimpleName(), "RPM: " + v.getGplRpm());
//
//        v.accelerateGplEngine(50);
//
//        Log.d(MainActivity.class.getSimpleName(), "RPM after acceleration: " + v.getGplRpm());

        //v.startElectricMotor(45,34);


//
//        EngineModule engineModule = new EngineModule();
//
//
//        VehicleComponent vehicleComponent = DaggerVehicleComponent.builder()
//                //.tankModule(new TankModule())
//                .engineModule(engineModule)
//                .build();
////        Tank tank = vehicleComponent.tank();
////        Motor motor = vehicleComponent.motor();
//
//        VehicleMaker sprungMass = vehicleComponent.sprungMass();
//        sprungMass.startElectricMotor(10, 5);
//        sprungMass.startPetrolMotor(30, 20);
//        sprungMass.startGplMotor(30, 15);
//        sprungMass.startHybridMotor(20, 10, 18);
//        sprungMass.startHybridElectricMotor(15, 15, 18);

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
