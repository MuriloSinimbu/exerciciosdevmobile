package com.example.a04030884.pesoplaneta;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Button botaoCalcular;
    public RadioGroup rGroup;
    public TextInputEditText inputText;
    public TextView theView;
    public float gravity;
    public float peso;
    public float pesoPlaneta;
    public String randString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botaoCalcular = findViewById(R.id.button);
        rGroup = findViewById(R.id.radioGroup);
        inputText = findViewById(R.id.hintou);
        theView = findViewById(R.id.textView);
    }

    public void Calcular(View v)
    {
      if(rGroup.getCheckedRadioButtonId() == R.id.bMercurio)
      {
          gravity = 0.37f;
       peso = Float.parseFloat(inputText.getText().toString());
       pesoPlaneta = (peso / 10) * gravity;
       randString = String.valueOf(pesoPlaneta);
       theView.setText(randString);
      }

        if(rGroup.getCheckedRadioButtonId() == R.id.bVenus)
        {
            gravity = 0.88f;
            peso = Float.parseFloat(inputText.getText().toString());
            pesoPlaneta = (peso / 10) * gravity;
            randString = String.valueOf(pesoPlaneta);
            theView.setText(randString);
        }

        if(rGroup.getCheckedRadioButtonId() == R.id.bMarte)
        {
            gravity = 0.38f;
            peso = Float.parseFloat(inputText.getText().toString());
            pesoPlaneta = (peso / 10) * gravity;
            randString = String.valueOf(pesoPlaneta);
            theView.setText(randString);
        }

        if(rGroup.getCheckedRadioButtonId() == R.id.bJupiter)
        {
            gravity = 2.64f;
            peso = Float.parseFloat(inputText.getText().toString());
            pesoPlaneta = (peso / 10) * gravity;
            randString = String.valueOf(pesoPlaneta);
            theView.setText(randString);
        }

        if(rGroup.getCheckedRadioButtonId() == R.id.bSaturno)
        {
            gravity = 1.15f;
            peso = Float.parseFloat(inputText.getText().toString());
            pesoPlaneta = (peso / 10) * gravity;
            randString = String.valueOf(pesoPlaneta);
            theView.setText(randString);
        }

        if(rGroup.getCheckedRadioButtonId() == R.id.bUrano)
        {
            gravity = 1.17f;
            peso = Float.parseFloat(inputText.getText().toString());
            pesoPlaneta = (peso / 10) * gravity;
            randString = String.valueOf(pesoPlaneta);
            theView.setText(randString);
        }
    }
}
