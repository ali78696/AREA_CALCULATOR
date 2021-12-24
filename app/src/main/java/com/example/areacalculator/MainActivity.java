package com.example.areacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button square=findViewById(R.id.square);
        Button rectangle=findViewById(R.id.rectangle);
        Button triangle=findViewById(R.id.triangle);
        Button circle=findViewById(R.id.circle);

        square.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(getApplicationContext(), square.class));
            }
        });
       triangle.setOnClickListener(new View.OnClickListener() {

           public void onClick(View v) {
               startActivity(new Intent(getApplicationContext(),triangle.class));
           }
       });
        rectangle.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),rectangle.class));
            }
        });

        circle.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),circle.class));
            }
        });
    }
}