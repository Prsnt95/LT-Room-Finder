package com.example.prasantcsfair;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button button;
    Intent myIntentA;
    ImageView iv;
    Button floorII;
    Intent myIntentB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button0);
        floorII=findViewById(R.id.floorII);
//        iv=findViewById(R.id.iv);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                myIntentA = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(myIntentA);


            }
        });
        floorII.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myIntentB=new Intent(MainActivity.this, SecondRoom.class);
                startActivity(myIntentB);
            }
        });

    }
}




