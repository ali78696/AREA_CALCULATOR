package com.example.areacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class triangle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);
        Button calculate=findViewById(R.id.calculate);
        EditText height=findViewById(R.id.height);
        EditText base=findViewById(R.id.base);
        TextView answer=findViewById(R.id.answer);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // do something when the corky is clicked
                if(!height.getText().toString().isEmpty()&&!base.getText().toString().isEmpty())
                {
                    float a= (float) (Float.parseFloat(height.getText().toString())*Float.parseFloat(base.getText().toString())*0.5);
                    answer.setText(Float.toString(a));
                    height.setText("");
                    base.setText("");
                }
            }
        });
    }
}