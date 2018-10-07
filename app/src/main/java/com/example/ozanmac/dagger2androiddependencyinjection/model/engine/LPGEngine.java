package com.example.ozanmac.dagger2androiddependencyinjection.model.engine;

import android.util.Log;

import com.example.ozanmac.dagger2androiddependencyinjection.model.Engine;

public class LPGEngine implements Engine {

    @Override
    public void turnOn() {
        Log.v("DaggerExample", "LPG Engine On..");
    }

    @Override
    public void turnOff() {
        Log.v("DaggerExample", "LPG Engine Off..");
    }
}
