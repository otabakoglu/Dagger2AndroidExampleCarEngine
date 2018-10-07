package com.example.ozanmac.dagger2androiddependencyinjection;

import android.app.Application;

import com.example.ozanmac.dagger2androiddependencyinjection.injectors.AppComponent;
import com.example.ozanmac.dagger2androiddependencyinjection.injectors.AppModule;
import com.example.ozanmac.dagger2androiddependencyinjection.injectors.DaggerAppComponent;


public class Dagger2Application extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        initializeInjector();
    }

    private void initializeInjector(){
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent(){
        return appComponent;
    }
}
