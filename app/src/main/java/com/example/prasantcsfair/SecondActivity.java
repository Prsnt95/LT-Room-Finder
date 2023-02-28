package com.example.prasantcsfair;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {
    Button button;
    EditText roomA;
    EditText roomB;
    Intent myIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        roomA = findViewById(R.id.et1);
        roomB = findViewById(R.id.et2);
        button=findViewById(R.id.button2);



        //button is clicked
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //gets the values from edit texts.
                String a = roomA.getText().toString();
                String b = roomB.getText().toString();
                // sends the value in integer to the new layout.
                myIntent = new Intent(SecondActivity.this, Map.class);
                myIntent.putExtra("roomFrom",a);
                myIntent.putExtra("roomTo",b);

                startActivity(myIntent);



            }
        });

    }
}

