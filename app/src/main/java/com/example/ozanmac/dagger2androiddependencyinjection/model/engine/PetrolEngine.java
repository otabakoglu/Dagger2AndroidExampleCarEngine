package com.example.ozanmac.dagger2androiddependencyinjection.model.engine;

import android.util.Log;

import com.example.ozanmac.dagger2androiddependencyinjection.model.Engine;

public class PetrolEngine implements Engine{

    @Override
    public void turnOn() {
        Log.v("DaggerExample", "Petrol Engine On..");
    }

    @Override
    public void turnOff() {
        Log.v("DaggerExample", "Petrol Engine Off..");
    }
}
