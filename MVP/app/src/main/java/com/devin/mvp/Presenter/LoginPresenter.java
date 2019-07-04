package com.devin.mvp.Presenter;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

import com.devin.mvp.Calback.LoginCallback;
import com.devin.mvp.Calback.ViewListener;
import com.devin.mvp.Dao.User;

public class LoginPresenter implements LifecycleObserver {

    private String TAG = "LoginPresenter";
    private ViewListener viewListener;
    private LoginCallback loginCallback;

    public void doLogin(User user, ViewListener viewListener) {


    }


    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    void onCreate() {
        Log.i(TAG, "LoginPresenter onCreate:   ");
        viewListener = null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    void onResume() {
        Log.i(TAG, "LoginPresenter onResume:   ");
        viewListener = null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    void onPause() {
        Log.i(TAG, "LoginPresenter onPause:   ");
        viewListener = null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    void onStop() {
        Log.i(TAG, "LoginPresenter onStop:   ");
        viewListener = null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    void onDestroy() {
        Log.i(TAG, "LoginPresenter onDestroy:  viewListener = null");
        viewListener = null;
    }
}
