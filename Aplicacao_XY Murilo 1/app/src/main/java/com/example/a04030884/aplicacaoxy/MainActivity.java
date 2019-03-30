package com.example.a04030884.aplicacaoxy;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Button theButton;
    public TextInputEditText inputText;
    public TextView theView;
    public float y;
    public float x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        theButton = findViewById(R.id.theB);
        inputText = findViewById(R.id.entrada);
        theView = findViewById(R.id.textView);

    }

    public void Calcular(View v)
    {
        x = Float.parseFloat(inputText.getText().toString());
        y = 8;
        y = y / 2 - x;
        theView.setText(String.valueOf(y));
    }


}
