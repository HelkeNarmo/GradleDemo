package com.narmo.gradledemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((TextView) findViewById(R.id.txt)).setText(Lalala.class.getName());
        Toast.makeText(this, "Yeah!", Toast.LENGTH_SHORT).show();
    }


    private enum Test {
        abc, efg
    }
}
