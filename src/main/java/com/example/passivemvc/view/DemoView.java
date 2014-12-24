package com.example.passivemvc.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.passivemvc.R;


public class DemoView extends LinearLayout {

    public DemoView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void incrementNumber() {
        int count = getCount();
        setCount(++count);
    }

    public void setListeners(OnClickListener listener) {
        ((Button) this.findViewById(R.id.counter_Button)).setOnClickListener(listener);
    }

    public int getCount() {
        return Integer.valueOf(getCounterView().getText().toString());
    }

    private void setCount(int count) {
        getCounterView().setText(String.valueOf(count));
    }

    private TextView getCounterView() {
        return (TextView) this.findViewById(R.id.counter_TextView);
    }

}
