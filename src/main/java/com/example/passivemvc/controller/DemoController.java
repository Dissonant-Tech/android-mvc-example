package com.example.passivemvc.controller;

import android.view.View;

import com.example.passivemvc.view.DemoView;

public class DemoController implements View.OnClickListener {

    private static final String TAG = "DemoController";

    public interface DemoListener {
        void onLimitReached(int limit);
    }

    private DemoView demoView;
    private DemoListener listener;
    // Arbitrary limit
    private int countLimit = 10;

    public DemoController(DemoView demoView, DemoListener listener) { 
		this.demoView = demoView;
        this.listener = listener;
    }

    public void onClick(View v) {
        if (demoView.getCount() >= countLimit) {
            listener.onLimitReached(countLimit);
        } else {
            demoView.incrementNumber();
        }
    }
}
