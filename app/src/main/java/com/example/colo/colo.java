package com.example.colo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import java.util.Random;

public class colo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colo);

        Random Ros= new Random();
        int col = Color.argb(Ros.nextInt(256),Ros.nextInt(256),Ros.nextInt(256),Ros.nextInt(256));
        findViewById(android.R.id.content).setBackgroundColor(col);

    }
}
