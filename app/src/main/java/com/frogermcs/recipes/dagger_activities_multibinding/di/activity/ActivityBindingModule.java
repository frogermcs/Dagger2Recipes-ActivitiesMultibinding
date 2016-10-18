package com.frogermcs.recipes.dagger_activities_multibinding.di.activity;

import com.frogermcs.recipes.dagger_activities_multibinding.main_activity.MainActivity;
import com.frogermcs.recipes.dagger_activities_multibinding.main_activity.MainActivityComponent;
import com.frogermcs.recipes.dagger_activities_multibinding.second_activity.SecondActivity;
import com.frogermcs.recipes.dagger_activities_multibinding.second_activity.SecondActivityComponent;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

/**
 * Created by froger_mcs on 14/09/16.
 */

@Module(
        subcomponents = {
                MainActivityComponent.class,
                SecondActivityComponent.class
        })
public abstract class ActivityBindingModule {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    public abstract ActivityComponentBuilder mainActivityComponentBuilder(MainActivityComponent.Builder impl);

    @Binds
    @IntoMap
    @ActivityKey(SecondActivity.class)
    public abstract ActivityComponentBuilder secondActivityComponentBuilder(SecondActivityComponent.Builder impl);
}