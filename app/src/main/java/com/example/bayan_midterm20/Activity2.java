package com.example.bayan_midterm20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    EditText name, birth;
    TextView text;
    String gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        text = (TextView) findViewById(R.id.result);
        name = (EditText)findViewById(R.id.name);
        birth = (EditText)findViewById(R.id.birth);
        RadioButton male = (RadioButton) findViewById(R.id.male);
        RadioButton female = (RadioButton) findViewById(R.id.female);

        Button act1 =(Button)findViewById(R.id.act1F2);
        Button act3 =(Button)findViewById(R.id.act3F1);
        Button submit =(Button)findViewById(R.id.submit);

        act1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Activity2.this,MainActivity.class));
            }
        });
        act3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Activity2.this,Activity3.class));
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameT = name.getText().toString();
                int birthT = Integer.parseInt(birth.toString());
                if(male.isSelected()){
                    gender = "Mr";
                }
                if(male.isSelected()){
                    gender = "Miss";
                }

                text.setText("Hi "+gender+" "+ nameT+ ",You are "+birthT+ " years old");
            }
        });

    }
}