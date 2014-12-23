package com.example.passivemvc.view;


public class DemoView extends LinearLayout {

    public DemoView(Context context, AttributeSet, attrs) {
        super(context, attrs);
    }
    
    public View getCounterButton() {
        return this.findViewById(R.id.button_counter);
    }
}
