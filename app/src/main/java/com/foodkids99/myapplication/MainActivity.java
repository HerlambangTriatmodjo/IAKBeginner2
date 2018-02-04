package com.foodkids99.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout mlineLearn, mlineQize, mlineAbout, mlineEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mlineLearn = (LinearLayout) findViewById(R.id.lineLearn);
        mlineAbout = (LinearLayout) findViewById(R.id.lineContact);
        mlineQize = (LinearLayout) findViewById(R.id.lineExercise);
        mlineEmail = (LinearLayout) findViewById(R.id.lineContact);

        mlineLearn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
