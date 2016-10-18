package com.frogermcs.recipes.dagger_activities_multibinding.main_activity;

import com.frogermcs.recipes.dagger_activities_multibinding.di.activity.ActivityComponent;
import com.frogermcs.recipes.dagger_activities_multibinding.di.activity.ActivityComponentBuilder;
import com.frogermcs.recipes.dagger_activities_multibinding.di.activity.ActivityModule;
import com.frogermcs.recipes.dagger_activities_multibinding.di.activity.ActivityScope;

import dagger.Module;
import dagger.Subcomponent;

/**
 * Created by froger_mcs on 14/09/16.
 */

@ActivityScope
@Subcomponent(
        modules = MainActivityComponent.MainActivityModule.class
)
public interface MainActivityComponent extends ActivityComponent<MainActivity> {

    @Subcomponent.Builder
    interface Builder extends ActivityComponentBuilder<MainActivityModule, MainActivityComponent> {
    }

    @Module
    class MainActivityModule extends ActivityModule<MainActivity> {
        MainActivityModule(MainActivity activity) {
            super(activity);
        }
    }
}
