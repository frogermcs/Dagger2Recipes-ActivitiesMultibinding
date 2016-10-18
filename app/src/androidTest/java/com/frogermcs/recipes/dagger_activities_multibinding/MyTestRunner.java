package com.frogermcs.recipes.dagger_activities_multibinding;

import android.app.Application;
import android.content.Context;
import android.support.test.runner.AndroidJUnitRunner;

/**
 * Created by Miroslaw Stanek on 24.09.15.
 */
public class MyTestRunner extends AndroidJUnitRunner {

    @Override
    public Application newApplication(ClassLoader cl, String className, Context context)
            throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return super.newApplication(cl, ApplicationMock.class.getName(), context);
    }
}
