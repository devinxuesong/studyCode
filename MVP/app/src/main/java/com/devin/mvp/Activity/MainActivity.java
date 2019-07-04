package com.devin.mvp.Activity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.devin.mvp.Calback.ViewListener;
import com.devin.mvp.Dao.User;
import com.devin.mvp.Presenter.LoginPresenter;
import com.devin.mvp.R;
import com.devin.mvp.Utils.UIViewHelper;
import com.devin.mvp.ViewModel.NameViewModel;

public class MainActivity extends BaseLifecycleActivity implements ViewListener {
    private Button button, button2;
    private User myUser;
    private TextView textView;
    private NameViewModel nameViewModel, nameViewModel2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.mybutton1);
        button2 = findViewById(R.id.mybutton2);
        textView = findViewById(R.id.tvview);
        myUser = new User();
        myUser.setAge(2222);
        myUser.setName("lixuesong");
        presenter = new LoginPresenter();
        getLifecycle().addObserver(presenter);

        nameViewModel = ViewModelProviders.of(this).get(NameViewModel.class);//fragment getactivity
        // nameViewModel2 =  ViewModelProviders.of(this).get(NameViewModel.class);
        final Observer<String> nameObserver = new Observer<String>() {
            @Override
            public void onChanged(@Nullable final String newName) {
                // Update the UI, in this case, a TextView.
                button.setText(newName);
            }
        };
        nameViewModel.getCurrentName().observe(this, nameObserver);
    }

    @Override
    protected void onResume() {
        super.onResume();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // login(myUser);
                //     UIViewHelper.fadeIn(textView, 500, null, true);

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // login(myUser);
                nameViewModel.getCurrentName().setValue("anotherName");
                //  UIViewHelper.fadeOut(textView, 500, null, true);
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
