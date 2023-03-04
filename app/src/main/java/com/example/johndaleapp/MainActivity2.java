package com.example.johndaleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    public static final String TAG  ="Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Log.v(TAG, "verbose nga log");
        Log.d(TAG, "verbose nga log");
        Log.i(TAG, "verbose nga log");
        Log.e(TAG, "verbose nga log");
        Log.w(TAG, "verbose nga log");

        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "button clicker");
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
            }


        });




    }
}