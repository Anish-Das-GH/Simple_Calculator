package com.anish.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText n1,n2;
    Button add,sub,multi,div;
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        multi = findViewById(R.id.multi);
        div = findViewById(R.id.div);
        tv = findViewById(R.id.tv);

        // addition part

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int p,q,r;
                if(!n1.getText().toString().equals("") && !n2.getText().toString().equals("")) {
                    p = Integer.parseInt(n1.getText().toString());
                    q = Integer.parseInt(n2.getText().toString());
                    r = (p + q);
                    Toast.makeText(MainActivity.this, "Successfully Calculated", Toast.LENGTH_SHORT).show();
                    tv.setText("Result is " + r);
                }else {
                    Toast.makeText(MainActivity.this, "Error: This field cannot be blank ", Toast.LENGTH_SHORT).show();

                }
            }
        });

        //subtraction part

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int p,q,r;
                if(!n1.getText().toString().equals("") && !n2.getText().toString().equals("")) {
                    p = Integer.parseInt(n1.getText().toString());
                    q = Integer.parseInt(n2.getText().toString());
                    r = (p - q);
                    Toast.makeText(MainActivity.this, "Successfully Calculated", Toast.LENGTH_SHORT).show();
                    tv.setText("Result is " + r);
                }else {
                    Toast.makeText(MainActivity.this, "Error: This field cannot be blank ", Toast.LENGTH_SHORT).show();

                }
            }
        });


        // multiplication part
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int p,q,r;
                if(!n1.getText().toString().equals("") && !n2.getText().toString().equals("")) {
                    p = Integer.parseInt(n1.getText().toString());
                    q = Integer.parseInt(n2.getText().toString());
                    r = (p * q);
                    Toast.makeText(MainActivity.this, "Successfully Calculated", Toast.LENGTH_SHORT).show();
                    tv.setText("Result is " + r);
                }else {
                    Toast.makeText(MainActivity.this, "Error: This field cannot be blank ", Toast.LENGTH_SHORT).show();

                }
            }
        });


        //divison part

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int p,q,r;
                if(!n1.getText().toString().equals("") && !n2.getText().toString().equals("")) {
                    p = Integer.parseInt(n1.getText().toString());
                    q = Integer.parseInt(n2.getText().toString());
                    r = (p / q);
                    Toast.makeText(MainActivity.this, "Successfully Calculated", Toast.LENGTH_SHORT).show();
                    tv.setText("Result is " + r);
                }else {
                    Toast.makeText(MainActivity.this, "Error: This field cannot be blank ", Toast.LENGTH_SHORT).show();

                }
            }
        });

    }
}












