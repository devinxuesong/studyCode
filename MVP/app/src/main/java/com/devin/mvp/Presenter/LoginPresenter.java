package com.devin.mvp.Presenter;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;

import com.devin.mvp.Calback.LoginCallback;
import com.devin.mvp.Calback.ViewListener;
import com.devin.mvp.Dao.User;

public class LoginPresenter implements LifecycleObserver {


    private ViewListener viewListener;
    private LoginCallback loginCallback;

    public void doLogin(User user, ViewListener viewListener) {


    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    void onDestroy() {
        viewListener = null;
    }
}
