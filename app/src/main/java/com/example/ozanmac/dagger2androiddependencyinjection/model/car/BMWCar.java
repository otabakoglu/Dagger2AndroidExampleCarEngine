package com.example.ozanmac.dagger2androiddependencyinjection.model.car;

import android.util.Log;

import com.example.ozanmac.dagger2androiddependencyinjection.model.Car;
import com.example.ozanmac.dagger2androiddependencyinjection.model.Engine;

import javax.inject.Inject;

public class BMWCar implements Car {

    Engine engine;

    @Inject
    public BMWCar(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void start() {
        Log.v("Dagger Example", "BMW Car is Started..");
        engine.turnOn();
    }

    @Override
    public void stop() {
        Log.v("Dagger Example", "BMW Car is Stoped");
        engine.turnOff();
    }
}
