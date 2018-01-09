package com.jia.materialdesignui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tv_button;
    private TextView tv_switch;
    private TextView tv_progress;
    private TextView tv_snack_bar;
    private TextView tv_dialog;
    private TextView tv_color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        tv_button = (TextView) findViewById(R.id.tv_button);
        tv_switch = (TextView) findViewById(R.id.tv_switch);
        tv_progress = (TextView) findViewById(R.id.tv_progress);
        tv_snack_bar = (TextView) findViewById(R.id.tv_snack_bar);
        tv_dialog = (TextView) findViewById(R.id.tv_dialog);
        tv_color = (TextView) findViewById(R.id.tv_color);

        tv_button.setOnClickListener(this);
        tv_switch.setOnClickListener(this);
        tv_progress.setOnClickListener(this);
        tv_snack_bar.setOnClickListener(this);
        tv_dialog.setOnClickListener(this);
        tv_color.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_button:
                startActivity(new Intent(MainActivity.this, ButtonActivity.class));
                break;
            case R.id.tv_switch:
                startActivity(new Intent(MainActivity.this, SwitchActivity.class));
                break;
            case R.id.tv_progress:
                startActivity(new Intent(MainActivity.this, ProgressActivity.class));
                break;
            case R.id.tv_snack_bar:
                startActivity(new Intent(MainActivity.this, SnackBarActivity.class));
                break;
            case R.id.tv_dialog:
                startActivity(new Intent(MainActivity.this, DialogActivity.class));
                break;
            case R.id.tv_color:
                startActivity(new Intent(MainActivity.this, ColorSelectorActivity.class));
                break;
        }
    }
}
