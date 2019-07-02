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

public class RegisterFragment extends BaseFragment implements View.OnClickListener {
    Button back;

    @Override
    public void initdata() {

    }

    @Override
    public ViewGroup setRootView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return (ViewGroup) inflater.inflate(R.layout.fragment_register, container, false);
    }

    @Override
    public void initView() {
        back = mRootView.findViewById(R.id.register_back);
        back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.register_back:
                //  Navigation.findNavController(v).popBackStack();//返回上一个，减少当前一个实例
                //  Navigation.findNavController(v).navigate(R.id.welcome);//跳转会第一个，存在所有的实例
                Navigation.findNavController(v).popBackStack(R.id.welcome, true);//返回第一个

                break;
            default:
                break;
        }
    }


}
