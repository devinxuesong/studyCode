package com.devin.mvp.Activity;

import android.arch.lifecycle.LifecycleActivity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.devin.mvp.Presenter.LoginPresenter;

public class BaseLifecycleActivity extends LifecycleActivity {
    public LoginPresenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = new LoginPresenter();
        getLifecycle().addObserver(presenter);
    }
}
