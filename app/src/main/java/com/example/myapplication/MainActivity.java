package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText op1 = findViewById(R.id.op1);
        EditText op2 = findViewById(R.id.op2);

        TextView result = findViewById(R.id.result);


        Button button = (Button) findViewById(R.id.reset);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
            // Do something in response to button click
            int a = Integer.parseInt(op1.getText().toString());
            int b = Integer.parseInt(op2.getText().toString());

            int c = a + b;

            result.setText("Sum is: " + String.valueOf(c));
            // it.putExtra("sum", "Sum is: " + String.valueOf(c));
            //startActivity(it);
        }
        });
    }
}
