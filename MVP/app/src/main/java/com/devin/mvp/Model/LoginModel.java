package com.devin.mvp.Model;

import android.os.Handler;

import com.devin.mvp.Calback.LoginCallback;
import com.devin.mvp.Dao.User;

public class LoginModel {


    public static void getNetData(final User user, final LoginCallback callback){
        // 利用postDelayed方法模拟网络请求数据的耗时操作
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                switch (user.getName()){
                    case "normal":
                        callback.onSuccess("根据参数"+user.getName()+"的请求网络数据成功");
                        break;
                    case "failure":
                        callback.onFailure("请求失败：参数有误");
                        break;
                    case "error":
                        callback.onError();
                        break;
                }
                callback.onComplete();
            }
        },3000);
    }
}
