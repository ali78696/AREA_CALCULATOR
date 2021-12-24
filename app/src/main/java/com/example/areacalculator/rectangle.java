package com.example.areacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class rectangle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle);
        Button calculate=findViewById(R.id.calculate);
        EditText length=findViewById(R.id.length);
        EditText width=findViewById(R.id.width);
        TextView ans=findViewById(R.id.answer);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // do something when the corky is clicked
                if(!length.getText().toString().isEmpty()&&!width.getText().toString().isEmpty())
                {
                    float a=Float.parseFloat(length.getText().toString())*Float.parseFloat(width.getText().toString());
                    ans.setText(Float.toString(a));
                    length.setText("");
                    width.setText("");
                }
            }
        });
    }
}