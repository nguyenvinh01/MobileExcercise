package com.example.hanoitour;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text = (TextView) findViewById(R.id.textview);
        TextView text1 = (TextView) findViewById(R.id.textview1);
        TextView text2 = (TextView) findViewById(R.id.textview2);

        text.setMovementMethod(LinkMovementMethod.getInstance());
        text1.setMovementMethod(LinkMovementMethod.getInstance());
        text2.setMovementMethod(LinkMovementMethod.getInstance());

    }
}