package com.example.trafficlight;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;


public class MainActivity extends AppCompatActivity {
private ConstraintLayout layout;
private Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  Button button1, button2, button3;
        final RelativeLayout relativeLayout;


        button1 = findViewById(R.id.button1);


        button2 = findViewById(R.id.button2);

        button3 = findViewById(R.id.button3);


        relativeLayout = findViewById(R.id.rlVar1);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                relativeLayout.setBackgroundResource(R.color.grenn);
            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                relativeLayout.setBackgroundResource(R.color.yellow);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                relativeLayout.setBackgroundResource(R.color.red);
            }
        });
    }
});

}}
