package com.example.inhwalee.myapplication4;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {
    Button btnRotate;
    ImageView imgDog;
    float angle = 0;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("연습문제 4-9");

        btnRotate = (Button) findViewById(R.id.BtnRotate);
        imgDog = (ImageView) findViewById(R.id.ImgDog);

        btnRotate.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                angle += 10;
                imgDog.setRotation(angle);

            }

        });

    }
}