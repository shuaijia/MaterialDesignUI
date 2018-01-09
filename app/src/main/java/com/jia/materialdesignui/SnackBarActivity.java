package com.jia.materialdesignui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.gc.materialdesign.widgets.SnackBar;

public class SnackBarActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bt_click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack_bar);
        initView();
    }

    private void initView() {
        bt_click = (Button) findViewById(R.id.bt_click);

        bt_click.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_click:

                SnackBar snackbar = new SnackBar(this, "关注获取更多", "好的", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                });
                snackbar.show();

                break;
        }
    }
}
