package com.frogermcs.recipes.dagger_activities_multibinding;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

import com.frogermcs.recipes.dagger_activities_multibinding.di.activity.ActivityComponentBuilder;
import com.frogermcs.recipes.dagger_activities_multibinding.di.activity.HasActivitySubcomponentBuilders;
import com.frogermcs.recipes.dagger_activities_multibinding.di.app.AppComponent;
import com.frogermcs.recipes.dagger_activities_multibinding.di.app.DaggerAppComponent;

import java.util.Map;

import javax.inject.Inject;
import javax.inject.Provider;

/**
 * Created by froger_mcs on 14/09/16.
 */

public class MyApplication extends Application implements HasActivitySubcomponentBuilders {

    @Inject
    Map<Class<? extends Activity>, Provider<ActivityComponentBuilder>> activityComponentBuilders;

    private AppComponent appComponent;

    public static HasActivitySubcomponentBuilders get(Context context) {
        return ((HasActivitySubcomponentBuilders) context.getApplicationContext());
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.create();
        appComponent.inject(this);
    }

    @Override
    public ActivityComponentBuilder getActivityComponentBuilder(Class<? extends Activity> activityClass) {
        return activityComponentBuilders.get(activityClass).get();
    }
}