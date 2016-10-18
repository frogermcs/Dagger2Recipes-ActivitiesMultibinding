package com.frogermcs.recipes.dagger_activities_multibinding.di.app;

import com.frogermcs.recipes.dagger_activities_multibinding.MyApplication;
import com.frogermcs.recipes.dagger_activities_multibinding.di.activity.ActivityBindingModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by froger_mcs on 14/09/16.
 */
@Singleton
@Component(
        modules = {
                AppModule.class,
                ActivityBindingModule.class
        }
)
public interface AppComponent {
    MyApplication inject(MyApplication application);
}