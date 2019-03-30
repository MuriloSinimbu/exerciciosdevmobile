package com.example.a26146398.confederacao;

import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    public TextInputEditText input;
    public TextView theView;
    public String sting;
    public int age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = findViewById(R.id.theInput);
        theView = findViewById(R.id.textView);

    }

    public void Calcular(View v)
    {
        sting = input.getText().toString();
        age = Integer.parseInt(sting);
        if(age >= 5 & age <= 7 )
        {
            theView.setText("Infantil A");
        }

        else if(age >= 8 & age <= 10 )
        {
            theView.setText("Infantil B");
        }

        else if(age >= 11 & age <= 13 )
        {
            theView.setText("Juvenil A");
        }

        else if(age >= 14 & age <= 17 )
        {
            theView.setText("Juvenil B");
        }

        else if(age >= 18 )
        {
            theView.setText("Sênior");
        }


    }
}
