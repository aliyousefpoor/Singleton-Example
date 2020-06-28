package com.example.singletonexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button fbutton,sbutton,tbutton,cbutton;
    Singleton object =Singleton.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fbutton = findViewById(R.id.fbtn);
        sbutton = findViewById(R.id.sbtn);
        tbutton = findViewById(R.id.tbtn);
        cbutton = findViewById(R.id.counter);

        fbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                object.showToast(getApplicationContext());
            }
        });

        sbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                object.showSecondToast(getApplicationContext());
            }
        });

        tbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                object.showThirdToast(getApplicationContext());
            }
        });

        cbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                object.counter(getApplicationContext());
            }
        });


    }
}