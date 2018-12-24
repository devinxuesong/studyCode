# studyCode
2018/12/20
新建mvp工程，集成LifecycleActivity


2018/12/24
LifecycleActivity废弃，可以直接在activity中使用。




使用方法
1；在mvp中，定义好presenter，p层应该有生命周期，使用Lifecycle后，则根据activity生命周期保持一致
在FragmentActivity中，在oncreact中直接使用  getLifecycle().addObserver(presenter);
在presenter 里面使用
 @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    void onCreate() {
        Log.i(TAG, "LoginPresenter onCreate:   ");
        viewListener = null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    void onResume() {
        Log.i(TAG, "LoginPresenter onResume:   ");
        viewListener = null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    void onPause() {
        Log.i(TAG, "LoginPresenter onPause:   ");
        viewListener = null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    void onStop() {
        Log.i(TAG, "LoginPresenter onStop:   ");
        viewListener = null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    void onDestroy() {
        Log.i(TAG, "LoginPresenter onDestroy:  viewListener = null");
        viewListener = null;
    }
