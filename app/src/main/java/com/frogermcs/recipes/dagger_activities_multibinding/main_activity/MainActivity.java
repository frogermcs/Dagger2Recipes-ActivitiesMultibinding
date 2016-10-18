package com.frogermcs.recipes.dagger_activities_multibinding.main_activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.frogermcs.recipes.dagger_activities_multibinding.BaseActivity;
import com.frogermcs.recipes.dagger_activities_multibinding.R;
import com.frogermcs.recipes.dagger_activities_multibinding.di.activity.HasActivitySubcomponentBuilders;
import com.frogermcs.recipes.dagger_activities_multibinding.second_activity.SecondActivity;

import javax.inject.Inject;

public class MainActivity extends BaseActivity {

    @Inject
    MainActivityPresenter mainActivityPresenter;

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        mainActivityPresenter.init();
    }

    @Override
    protected void injectMembers(HasActivitySubcomponentBuilders hasActivitySubcomponentBuilders) {
        ((MainActivityComponent.Builder) hasActivitySubcomponentBuilders.getActivityComponentBuilder(MainActivity.class))
                .activityModule(new MainActivityComponent.MainActivityModule(this))
                .build()
                .injectMembers(this);
    }

    public void openSecondScreen(View v) {
        startActivity(new Intent(this, SecondActivity.class));
    }

    public void updateText(String text) {
        textView.setText(text);
    }
}
