package com.frogermcs.recipes.dagger_activities_multibinding.di.activity;

/**
 * Created by froger_mcs on 14/09/16.
 */

public interface ActivityComponentBuilder<M extends ActivityModule, C extends ActivityComponent> {
    ActivityComponentBuilder<M, C> activityModule(M activityModule);
    C build();
}