package com.example.ozanmac.dagger2androiddependencyinjection.injectors;

import com.example.ozanmac.dagger2androiddependencyinjection.Dagger2Application;
import com.example.ozanmac.dagger2androiddependencyinjection.model.Car;
import com.example.ozanmac.dagger2androiddependencyinjection.model.Engine;
import com.example.ozanmac.dagger2androiddependencyinjection.model.car.BMWCar;
import com.example.ozanmac.dagger2androiddependencyinjection.model.engine.PetrolEngine;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private final Dagger2Application dagger2Application;

    public AppModule(Dagger2Application dagger2Application) {
        this.dagger2Application = dagger2Application;
    }

    @Provides @Singleton
    Dagger2Application provideApp(){
        return dagger2Application;
    }

    @Provides @Singleton
    Engine provideEngine(){
        return new PetrolEngine();
    }

    @Provides @Singleton
    Car provideCar(Engine engine){
        return new BMWCar(engine);
    }
}
