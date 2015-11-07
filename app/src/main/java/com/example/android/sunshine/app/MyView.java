//package com.example.android.sunshine.app;
//
//import android.content.Context;
//import android.graphics.Canvas;
//import android.util.AttributeSet;
//import android.view.View;
//import android.view.accessibility.AccessibilityEvent;
//
///**
// * Created by Bokii on 6/3/2015.
// */
//public class MyView extends View
//{
//    public MyView(Context context){
//        super(context)
//    }
//
//    public MyView(Context context, AttributeSet attrs){
//        super(context, attrs);
//    }
//
//    public MyView(Context context, AttributeSet attrs, int defaultStyle){
//        super(context, attrs, defaultStyle);
//    }
//    @Override
//    protected void onMeasure(int wMeasureSpec, int hMeasureSpec){}
//
//    @Override
//    protected void onDraw(Canvas canvas){
//
//    }
//
//    //if (AccessibilityManger.getInstance(mContext).isEnabled()) {
//    // sendAccessibilityEvent(accessibilityEvent.TYPE_VIEW_TEXT_CHANGED);
//
//
//    @Override
//    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent ev) {
//        ev.getText().add(windSpeedDir);
//        return true;
//    }
//}
