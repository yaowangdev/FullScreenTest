package com.ehighsun.fullscreentest;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;

public class MainActivity extends BaseActivity {
    private LinearLayout llTitleBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        llTitleBar = (LinearLayout) findViewById(R.id.title_bar);
        ViewTreeObserver observer = llTitleBar.getViewTreeObserver();
        observer.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                Log.d("getMeasuredHeight","height="+llTitleBar.getMeasuredHeight());
            }
        });
    }



    public void goBack(View v){
        finish();
    }
}
