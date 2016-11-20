package com.frogermcs.recipes.dagger_activities_multibinding.di.activity;

import java.lang.ref.WeakReference;

import dagger.Module;
import dagger.Provides;

/**
 * Created by froger_mcs on 09/08/16.
 */

@Module
public abstract class ActivityModule<T> {
    protected final WeakReference<T> activity;

    public ActivityModule(T activity) {
        this.activity = new WeakReference<>(activity);
    }

    @Provides
    @ActivityScope
    public T provideActivity() {
        return activity.get();
    }
}
