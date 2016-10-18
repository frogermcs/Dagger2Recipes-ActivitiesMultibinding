package com.frogermcs.recipes.dagger_activities_multibinding.di.activity;

import android.app.Activity;

import com.frogermcs.recipes.dagger_activities_multibinding.di.activity.ActivityComponentBuilder;

/**
 * Created by froger_mcs on 18/09/16.
 */
public interface HasActivitySubcomponentBuilders {
    ActivityComponentBuilder getActivityComponentBuilder(Class<? extends Activity> activityClass);
}