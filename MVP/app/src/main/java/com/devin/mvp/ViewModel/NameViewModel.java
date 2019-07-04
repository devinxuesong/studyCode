package com.devin.mvp.ViewModel;


import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NameViewModel extends ViewModel {

    // Create a LiveData with a String
    private MutableLiveData<String> mCurrentName;

    public MutableLiveData<String> getCurrentName() {
        if (mCurrentName == null) {
            mCurrentName = new MutableLiveData<String>();
        }
        return mCurrentName;
    }

    // Rest of the ViewModel...

        /*  3. LiveData的使用
       创建一个持有某种数据类型的LiveData对象
       创建一个观察者对象，通常在UI Controller(如Activity或Fragment)中创建这个观察者。
       将观察者对象作为参数传入LiveData.observe()方法，连接观察者和LiveData。*/

}
