package com.example.prasantcsfair;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class FirebaseActvity extends AppCompatActivity {
    Button button2;
    Button retrieve;
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firebase_actvity);
        button2=findViewById(R.id.save);
        retrieve=findViewById(R.id.retrieve);
        editText=findViewById(R.id.et);
        textView=findViewById(R.id.textView2);


        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef2 = database.getReference("Input");






        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = editText.getText().toString();


                FirebaseApp.initializeApp(FirebaseActvity.this);


                myRef2.setValue(input);

                myRef2.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String snapshotValue = snapshot.getValue(String.class);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

                }
            });
        retrieve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myRef2.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String snapshotValue= snapshot.getValue(String.class);
                        String snapshotValueII= snapshot.getValue(String.class);
                        String snapshotValueIII= snapshot.getValue(String.class);

                        textView.setText(snapshotValue+","+snapshotValueII+","+snapshotValueIII);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

            }
        });
    }
}

