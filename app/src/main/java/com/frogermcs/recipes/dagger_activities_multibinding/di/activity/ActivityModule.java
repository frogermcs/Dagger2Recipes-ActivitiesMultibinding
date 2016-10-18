package com.frogermcs.recipes.dagger_activities_multibinding.di.activity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by froger_mcs on 09/08/16.
 */

@Module
public abstract class ActivityModule<T> {
    protected final T activity;

    public ActivityModule(T activity) {
        this.activity = activity;
    }

    @Provides
    @ActivityScope
    public T provideActivity() {
        return activity;
    }
}
