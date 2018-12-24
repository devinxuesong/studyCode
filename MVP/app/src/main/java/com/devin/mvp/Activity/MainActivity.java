package com.devin.mvp.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.devin.mvp.Calback.ViewListener;
import com.devin.mvp.Dao.User;
import com.devin.mvp.Presenter.LoginPresenter;
import com.devin.mvp.R;

public class MainActivity extends BaseLifecycleActivity implements ViewListener {
    private Button button;
    private User myUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.mybutton);
        myUser = new User();
        myUser.setAge(2222);
        myUser.setName("lixuesong");
    }

    @Override
    protected void onResume() {
        super.onResume();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login(myUser);
            }
        });
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
