package com.example.passivemvc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.passivemvc.controller.DemoController;
import com.example.passivemvc.view.DemoView;

public class MainActivity extends Activity
{
    DemoView demoView;
    DemoController demoController;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        DemoView demoView = (DemoView) this.findViewById(R.id.demoview);
        DemoController demoController = new DemoController(demoView);
        ((Button) demoView.getCounterButton()).setOnClickListener(demoController);
    }
}
