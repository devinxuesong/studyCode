package com.devin.mvp.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.devin.mvp.Calback.ViewListener;
import com.devin.mvp.Dao.User;
import com.devin.mvp.Presenter.LoginPresenter;
import com.devin.mvp.R;

public class MainActivity extends BaseLifecycleActivity implements ViewListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(User user) {
        if (presenter != null) {
            presenter.doLogin(user, this);
        }
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showData(String data) {

    }

    @Override
    public void showFailureMessage(String msg) {

    }

    @Override
    public void showErrorMessage() {

    }
}
