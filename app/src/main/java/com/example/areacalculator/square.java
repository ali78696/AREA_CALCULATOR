package com.example.areacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class square extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);
        Button calculate=findViewById(R.id.calculate);
        EditText value=findViewById(R.id.value);
        TextView ans=findViewById(R.id.answer);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // do something when the corky is clicked
                if(!value.getText().toString().isEmpty()&&!value.getText().toString().isEmpty())
                {
                    float a=Float.parseFloat(value.getText().toString())*Float.parseFloat(value.getText().toString());
                    ans.setText(Float.toString(a));
                    value.setText("");
                }
            }
        });
    }
}