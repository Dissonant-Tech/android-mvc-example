package com.example.passivemvc.controller;

import android.view.View;

import com.example.passivemvc.view.DemoView;

public class DemoController implements View.OnClickListener {

    private DemoView demoView;

    public DemoController(DemoView demoView) { 
		this.demoView = demoView;
    }

    public void onClick(View v) {
        demoView.incrementNumber();
    }
}
