package com.example.ozanmac.dagger2androiddependencyinjection.injectors;

import com.example.ozanmac.dagger2androiddependencyinjection.views.CarActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton @Component(modules = AppModule.class)
public interface AppComponent {

    void inject(CarActivity carActivity);

}
