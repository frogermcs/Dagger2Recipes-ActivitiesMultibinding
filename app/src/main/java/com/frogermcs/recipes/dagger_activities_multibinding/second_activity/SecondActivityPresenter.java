package com.frogermcs.recipes.dagger_activities_multibinding.second_activity;

import com.frogermcs.recipes.dagger_activities_multibinding.di.activity.ActivityScope;

import javax.inject.Inject;

/**
 * Created by froger_mcs on 16/10/2016.
 */

@ActivityScope
public class SecondActivityPresenter {
    private SecondActivity activity;

    @Inject
    public SecondActivityPresenter(SecondActivity activity) {
        this.activity = activity;
    }
}
