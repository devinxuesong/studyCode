package com.devin.mvp.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.devin.mvp.Calback.ViewListener;
import com.devin.mvp.Dao.User;
import com.devin.mvp.Presenter.LoginPresenter;
import com.devin.mvp.R;
import com.devin.mvp.Utils.UIViewHelper;

public class MainActivity extends BaseLifecycleActivity implements ViewListener {
    private Button button,button2;
    private User myUser;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.mybutton1);
        button2 =  findViewById(R.id.mybutton2);
        textView = findViewById(R.id.tvview);
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
               // login(myUser);
                UIViewHelper.fadeIn(textView, 500, null, true);

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // login(myUser);

                UIViewHelper.fadeOut(textView, 500, null, true);
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
