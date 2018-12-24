package com.devin.mvp.Activity;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;

import com.devin.mvp.Presenter.LoginPresenter;

public class BaseLifecycleActivity extends FragmentActivity {
    public LoginPresenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = new LoginPresenter();

        getLifecycle().addObserver(presenter);
    }
}
