package com.jia.materialdesignui;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gc.materialdesign.views.ProgressBarDeterminate;

public class ProgressActivity extends AppCompatActivity {

    private ProgressBarDeterminate progressDeterminate;

    int progress = 0;

    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            progressDeterminate.setProgress(progress);
            if (progress == 100) {
                progress = 0;
            } else {
                progress = progress + 10;
            }
            handler.sendEmptyMessageDelayed(111,800);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);

        progressDeterminate = (ProgressBarDeterminate) findViewById(R.id.progressDeterminate);

        handler.sendEmptyMessageDelayed(111, 800);
    }
}
