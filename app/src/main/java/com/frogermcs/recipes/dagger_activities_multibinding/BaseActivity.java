package com.frogermcs.recipes.dagger_activities_multibinding;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.frogermcs.recipes.dagger_activities_multibinding.di.activity.HasActivitySubcomponentBuilders;

/**
 * Created by froger_mcs on 09/08/16.
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupActivityComponent();
    }

    protected void setupActivityComponent() {
        injectMembers(MyApplication.get(this));
    }

    protected abstract void injectMembers(HasActivitySubcomponentBuilders hasActivitySubcomponentBuilders);
}
