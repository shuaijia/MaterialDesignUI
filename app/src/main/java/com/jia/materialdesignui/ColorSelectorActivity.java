package com.jia.materialdesignui;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.gc.materialdesign.widgets.ColorSelector;

public class ColorSelectorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_selector);

        ColorSelector.OnColorSelectedListener listener = new ColorSelector.OnColorSelectedListener() {
            @Override
            public void onColorSelected(int color) {
                Toast.makeText(ColorSelectorActivity.this, color + "", Toast.LENGTH_LONG).show();
            }
        };

        ColorSelector colorSelector = new ColorSelector(this, Color.parseColor("#854000"), listener);
        colorSelector.show();
    }
}
