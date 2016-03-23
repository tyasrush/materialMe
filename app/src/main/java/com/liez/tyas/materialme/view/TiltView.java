package com.liez.tyas.materialme.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by tyasrus on 23/03/16.
 */
public class TiltView extends View {
    public TiltView(Context context) {
        super(context);
    }

    public TiltView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TiltView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public TiltView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
