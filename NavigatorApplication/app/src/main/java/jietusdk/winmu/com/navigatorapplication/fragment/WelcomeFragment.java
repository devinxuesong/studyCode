package jietusdk.winmu.com.navigatorapplication.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigation;


import jietusdk.winmu.com.navigatorapplication.R;

public class WelcomeFragment extends BaseFragment implements View.OnClickListener {

    private Button loginBtn;

    @Override
    public void initdata() {

    }

    @Override
    public ViewGroup setRootView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return (ViewGroup) inflater.inflate(R.layout.fragment_welcome, container, false);
    }

    @Override
    public void initView() {
        loginBtn = mRootView.findViewById(R.id.btn_login);
        loginBtn.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_login:
                Bundle bundle = new Bundle();
                bundle.putString("from", WelcomeFragment.class.getSimpleName());
                NavOptions.Builder builder = new NavOptions.Builder()
                        .setLaunchSingleTop(true)
                        .setEnterAnim(R.anim.nav_default_enter_anim)
                        .setExitAnim(R.anim.nav_default_exit_anim)
                        .setPopEnterAnim(R.anim.nav_default_pop_enter_anim)
                        .setPopExitAnim(R.anim.nav_default_pop_exit_anim);
                NavOptions options = builder.build();
                Navigation.findNavController(v).navigate(R.id.login, bundle, options);
                break;
            default:
                break;
        }
    }


}
