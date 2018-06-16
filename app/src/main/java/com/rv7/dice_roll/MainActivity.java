package com.rv7.dice_roll;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Button dice = (Button)findViewById(R.id.button_roll);

    ImageView leftDice = (ImageView) findViewById(R.id.diceleft);

    ImageView rightDice = (ImageView) findViewById(R.id.diceright);




}
