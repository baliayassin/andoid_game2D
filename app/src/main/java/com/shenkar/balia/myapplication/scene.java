package com.shenkar.balia.myapplication;

import android.graphics.Canvas;
import android.view.MotionEvent;

public interface scene {
    public void update();
    public void draw(Canvas canvas);
    public void terminate();
    public void recieveTouch(MotionEvent event);
}
