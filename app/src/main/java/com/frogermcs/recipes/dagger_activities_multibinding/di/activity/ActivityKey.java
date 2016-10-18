package com.frogermcs.recipes.dagger_activities_multibinding.di.activity;

import android.app.Activity;

import dagger.MapKey;

/**
 * Created by froger_mcs on 16/10/2016.
 */

@MapKey
public @interface ActivityKey {
    Class<? extends Activity> value();
}
