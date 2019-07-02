package com.devin.mvp.Utils;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;

public class UIViewHelper {


    /**
     * <p>对 View 做透明度变化的进场动画。</p>
     * <p>相关方法 {@link #fadeOut(View, int, Animation.AnimationListener, boolean)}</p>
     *
     * @param view            做动画的 View
     * @param duration        动画时长(毫秒)
     * @param listener        动画回调
     * @param isNeedAnimation 是否需要动画
     */
    public static AlphaAnimation fadeIn(View view, int duration, Animation.AnimationListener listener, boolean isNeedAnimation) {
        if (view == null) {
            return null;
        }
        if (isNeedAnimation) {
            view.setVisibility(View.VISIBLE);
            AlphaAnimation alpha = new AlphaAnimation(0, 1);
            alpha.setInterpolator(new DecelerateInterpolator());
            alpha.setDuration(duration);
            alpha.setFillAfter(true);
            if (listener != null) {
                alpha.setAnimationListener(listener);
            }
            view.startAnimation(alpha);
            return alpha;
        } else {
            view.setAlpha(1);
            view.setVisibility(View.VISIBLE);
            return null;
        }
    }

    /**
     * <p>对 View 做透明度变化的退场动画</p>
     * <p>相关方法 {@link #fadeIn(View, int, Animation.AnimationListener, boolean)}</p>
     *
     * @param view            做动画的 View
     * @param duration        动画时长(毫秒)
     * @param listener        动画回调
     * @param isNeedAnimation 是否需要动画
     */
    public static AlphaAnimation fadeOut(final View view, int duration, final Animation.AnimationListener listener, boolean isNeedAnimation) {
        if (view == null) {
            return null;
        }
        if (isNeedAnimation) {
            AlphaAnimation alpha = new AlphaAnimation(1, 0);
            alpha.setInterpolator(new DecelerateInterpolator());
            alpha.setDuration(duration);
            alpha.setAnimationListener(new Animation.AnimationListener() {
                @Override
                public void onAnimationStart(Animation animation) {
                    if (listener != null) {
                        listener.onAnimationStart(animation);
                    }
                }

                @Override
                public void onAnimationEnd(Animation animation) {
                    view.setVisibility(View.GONE);
                    if (listener != null) {
                        listener.onAnimationEnd(animation);
                    }
                }

                @Override
                public void onAnimationRepeat(Animation animation) {
                    if (listener != null) {
                        listener.onAnimationRepeat(animation);
                    }
                }
            });
            view.startAnimation(alpha);
            return alpha;
        } else {
            view.setVisibility(View.GONE);
            return null;
        }
    }


}
