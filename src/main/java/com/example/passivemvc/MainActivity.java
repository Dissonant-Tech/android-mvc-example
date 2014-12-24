package com.example.passivemvc;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.passivemvc.controller.DemoController;
import com.example.passivemvc.controller.DemoController.DemoListener;
import com.example.passivemvc.view.DemoView;

public class MainActivity extends Activity implements DemoListener {

    private final String TAG = "MainActivity";

    DemoView demoView;
    DemoController demoController;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        DemoView demoView = (DemoView) this.findViewById(R.id.demoview);
        DemoController demoController = new DemoController(demoView, this);
        demoView.setListeners(demoController);
    }

    public void onLimitReached(int limit) {
        Log.i(TAG, "Limit Reached... Toasting");

        String text = "Limit of "+String.valueOf(limit)+" reached!";
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
}
