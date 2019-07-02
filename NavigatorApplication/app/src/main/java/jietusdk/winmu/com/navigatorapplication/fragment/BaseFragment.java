package jietusdk.winmu.com.navigatorapplication.fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public abstract class BaseFragment extends Fragment {
    public ViewGroup mRootView;
    public boolean isNavigationViewInit = false;
    private String TAG;


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        //  TAG = getFragmentTag();
        TAG = this.getClass().getSimpleName();
        Log.i(TAG, TAG + " ---------onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, TAG + " ---------onCreate");
    }

    @Nullable
    @Override
    public final View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i(TAG, TAG + " ---------onCreateView mRootView=" + mRootView);
        if (mRootView == null) {
            mRootView = setRootView(inflater, container, savedInstanceState);
        }
        return mRootView;

    }

    @Override
    public final void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Log.i(TAG, TAG + " ---------onViewCreated isNavigationViewInit=" + isNavigationViewInit);
        if (!isNavigationViewInit) {
            super.onViewCreated(view, savedInstanceState);
            initView();
            initdata();
            isNavigationViewInit = true;
        } else {

        }
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i(TAG, TAG + " --------- onActivityCreated");

    }


    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG, TAG + " --------- onStart");
    }


    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, TAG + " --------- onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, TAG + " --------- onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG, TAG + " --------- onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i(TAG, TAG + " --------- onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, TAG + " --------- onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i(TAG, TAG + " --------- onDetach");
    }

    //初始化数据
    public abstract void initdata();

    //设置根view
    public abstract ViewGroup setRootView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState);

    //初始化view
    public abstract void initView();

}
