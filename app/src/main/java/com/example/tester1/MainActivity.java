package com.example.tester1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    Button btn;
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "New feature");
        Log.i(TAG, "scaryFunction: BOOOOOOOO!!!!!!");
    }

}
