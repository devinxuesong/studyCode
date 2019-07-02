package jietusdk.winmu.com.navigatorapplication.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigation;

import jietusdk.winmu.com.navigatorapplication.R;

public class LoginFragment extends BaseFragment implements View.OnClickListener {

    Button btn_next, btn_back, btn_test;
    NavOptions options;
    Bundle bundle;


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_register:
                Log.i("LoginFragment", "LoginFragment ---------进入注册");
                Navigation.findNavController(v).navigate(R.id.register, bundle, options);

                break;
            case R.id.button_back:
                Log.i("LoginFragment", "LoginFragment ---------进入本身");
                Navigation.findNavController(v).navigate(R.id.login, bundle, options);


                break;
            case R.id.button_test:
                Log.i("LoginFragment", "LoginFragment ---------跳转欢迎");
                Navigation.findNavController(v).navigate(R.id.welcome, bundle, options);
                break;
            default:
                break;
        }
    }

    @Override
    public void initdata() {
        NavOptions.Builder builder = new NavOptions.Builder()
                .setLaunchSingleTop(true)
                .setEnterAnim(R.anim.nav_default_enter_anim)
                .setExitAnim(R.anim.nav_default_exit_anim)
                .setPopEnterAnim(R.anim.nav_default_pop_enter_anim)
                .setPopExitAnim(R.anim.nav_default_pop_exit_anim);
        options = builder.build();
        bundle = new Bundle();
        bundle.putString("from", WelcomeFragment.class.getSimpleName());
    }

    @Override
    public ViewGroup setRootView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return (ViewGroup) inflater.inflate(R.layout.fragment_login, container, false);
    }

    @Override
    public void initView() {
        btn_next = mRootView.findViewById(R.id.button_register);
        btn_back = mRootView.findViewById(R.id.button_back);
        btn_test = mRootView.findViewById(R.id.button_test);

        btn_next.setOnClickListener(this);
        btn_back.setOnClickListener(this);
        btn_test.setOnClickListener(this);
    }
}
