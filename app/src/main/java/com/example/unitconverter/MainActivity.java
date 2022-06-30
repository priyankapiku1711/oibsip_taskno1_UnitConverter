package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView3;
    private TextView textView7;
    private EditText editText;
    private EditText editText6;
    private Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        button2=findViewById(R.id.button2);
        textView3 = findViewById(R.id.textView3);
        textView7 = findViewById(R.id.textView7);
        editText = findViewById(R.id.editTextTextPersonName);
        editText6= findViewById(R.id.editTextTextPersonName3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  Toast.makeText(MainActivity.this, "hello it work", Toast.LENGTH_SHORT).show();
                String s= editText.getText().toString();
                int meter =Integer.parseInt(s);
                double centimeter =100*meter;
                textView3.setText("The centimeter value is: "+centimeter);

            }

        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast.makeText(MainActivity.this, "hello it work", Toast.LENGTH_SHORT).show();
                String st= editText6.getText().toString();
                int kg =Integer.parseInt(st);
                int gram= 1000*kg;
                textView7.setText("The gram value is:"+gram);

            }
        });

    }
}