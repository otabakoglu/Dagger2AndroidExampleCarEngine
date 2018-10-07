package com.example.ozanmac.dagger2androiddependencyinjection.model.car;

import android.util.Log;

import com.example.ozanmac.dagger2androiddependencyinjection.model.Car;
import com.example.ozanmac.dagger2androiddependencyinjection.model.Engine;

import javax.inject.Inject;

public class MercedesCar implements Car {

    Engine engine;

    @Inject
    public MercedesCar(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void start() {
        Log.v("Dagger Example", "Mercedes Car is Started..");
        engine.turnOn();
    }

    @Override
    public void stop() {
        Log.v("Dagger Example", "Mercedes Car is Stoped");
        engine.turnOff();
    }
}
