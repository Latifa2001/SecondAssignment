package com.example.secondassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button) findViewById(R.id.button);
        e=(EditText) findViewById(R.id.EName);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n=e.getText().toString();
                TextView vt=(TextView)findViewById(R.id.hel);
                vt.setText("Hello, "+ n);


            }
        });
    }

}