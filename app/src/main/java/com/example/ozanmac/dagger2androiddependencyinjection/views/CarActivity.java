
package com.example.ozanmac.dagger2androiddependencyinjection.views;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ozanmac.dagger2androiddependencyinjection.Dagger2Application;
import com.example.ozanmac.dagger2androiddependencyinjection.R;
import com.example.ozanmac.dagger2androiddependencyinjection.model.Car;

import javax.inject.Inject;

public class CarActivity extends Activity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);

        inject();

        car.start();
        car.stop();
    }

    private void inject(){
        Dagger2Application app = (Dagger2Application) getApplication();
        app.getAppComponent().inject(this);
    }
}
