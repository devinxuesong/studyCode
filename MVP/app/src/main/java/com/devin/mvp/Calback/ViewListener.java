package com.devin.mvp.Calback;

public interface ViewListener {

    void showLoading();

    void hideLoading();

    void showData(String data);

    void showFailureMessage(String msg);

    void showErrorMessage();
}
