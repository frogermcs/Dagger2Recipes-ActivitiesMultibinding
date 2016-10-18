package com.frogermcs.recipes.dagger_activities_multibinding.di.activity;

import android.app.Activity;

import dagger.MembersInjector;

/**
 * Created by froger_mcs on 16/10/2016.
 */

public interface ActivityComponent<A extends Activity> extends MembersInjector<A> {
}
