package com.frogermcs.recipes.dagger_activities_multibinding.second_activity;

import com.frogermcs.recipes.dagger_activities_multibinding.di.activity.ActivityComponent;
import com.frogermcs.recipes.dagger_activities_multibinding.di.activity.ActivityComponentBuilder;
import com.frogermcs.recipes.dagger_activities_multibinding.di.activity.ActivityModule;
import com.frogermcs.recipes.dagger_activities_multibinding.di.activity.ActivityScope;

import dagger.Module;
import dagger.Subcomponent;

/**
 * Created by froger_mcs on 16/10/2016.
 */

@ActivityScope
@Subcomponent(
        modules = SecondActivityComponent.SecondActivityModule.class
)
public interface SecondActivityComponent extends ActivityComponent<SecondActivity> {

    @Subcomponent.Builder
    interface Builder extends ActivityComponentBuilder<SecondActivityModule, SecondActivityComponent> {
    }

    @Module
    class SecondActivityModule extends ActivityModule<SecondActivity> {
        SecondActivityModule(SecondActivity activity) {
            super(activity);
        }
    }
}