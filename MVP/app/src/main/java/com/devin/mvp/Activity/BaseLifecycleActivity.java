package com.devin.mvp.Activity;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;

import com.devin.mvp.Presenter.LoginPresenter;

public class BaseLifecycleActivity extends FragmentActivity {
    public LoginPresenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}
