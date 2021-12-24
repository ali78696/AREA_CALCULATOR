package com.example.areacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;

public class circle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);
        Button calculate=findViewById(R.id.calculate);
        EditText value=findViewById(R.id.value);
        TextView answer=findViewById(R.id.answer);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // do something when the corky is clicked
                if(!value.getText().toString().isEmpty()&&!value.getText().toString().isEmpty())
                {
                    float a= (float) (Float.parseFloat(value.getText().toString())*Float.parseFloat(value.getText().toString())*3.1428);
                    answer.setText(Float.toString(a));
                    value.setText("");

                }
            }
        });

    }
}