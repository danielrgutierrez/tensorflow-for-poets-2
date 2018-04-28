package com.example.android.tflitecamerademo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class InformationActivity extends Activity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        textView = (TextView) findViewById(R.id.textView);
        Intent intent = getIntent();
        String locationName = intent.getStringExtra("locationName");
        textView.setText(locationName);
    }
}
