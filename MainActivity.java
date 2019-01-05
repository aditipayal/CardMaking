package com.example.aditi.anniversarycard;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mysong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mysong = MediaPlayer.create(MainActivity.this,R.raw.aedil);
    }


    public void playIt(View v)
    {
        mysong.start();
        if(v.getId() == R.id.button)
        {
            Intent i = new Intent(MainActivity.this,display.class);
            startActivity(i);
        }
    }
    public void onbuttonclick(View v)
    {
        if(v.getId() == R.id.button2)
        {
            Intent i1 = new Intent(MainActivity.this,display2.class);
            startActivity(i1);
        }
    }
}
