package com.frogermcs.recipes.dagger_activities_multibinding;

import android.app.Activity;

import com.frogermcs.recipes.dagger_activities_multibinding.di.activity.ActivityComponentBuilder;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Miroslaw Stanek on 24.09.15.
 */
public class ApplicationMock extends MyApplication {

    public void putActivityComponentBuilder(ActivityComponentBuilder builder, Class<? extends Activity> cls) {
        Map<Class<? extends Activity>, ActivityComponentBuilder> activityComponentBuilders = new HashMap<>(this.activityComponentBuilders);
        activityComponentBuilders.put(cls, builder);
        this.activityComponentBuilders = activityComponentBuilders;
    }
}