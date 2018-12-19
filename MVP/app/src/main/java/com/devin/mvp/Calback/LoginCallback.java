package com.devin.mvp.Calback;

public interface LoginCallback {

    void onSuccess(String data);

    void onFailure(String msg);

    void onError();

    void onComplete();
}
