package com.jia.materialdesignui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gc.materialdesign.widgets.Dialog;

public class DialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);

        Dialog dialog = new Dialog(this,"Notice", "Do you accept these requirements?");
        dialog.addCancelButton("CANCEL");
        dialog.show();


    }
}
