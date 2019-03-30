package com.example.a26146398.restaurante;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextInputEditText input;
    public int index;
    public String nome;
    public Button botao;
    public float conta;
    public TextView theView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = findViewById(R.id.theInput);
        botao = findViewById(R.id.button);
        theView = findViewById(R.id.textView);
    }

    public void Analisar(View v)
    {
      nome = input.getText().toString();
      if(nome.charAt(0) == 'a')
      {
          theView.setText("Você ganhou um desconto de 30%");
      }

        if(nome.charAt(0) == 'e')
        {
            theView.setText("Você ganhou um desconto de 30%");
        }

        if(nome.charAt(0) == 'i')
        {
            theView.setText("Você ganhou um desconto de 30%");
        }

        if(nome.charAt(0) == 'o')
        {
            theView.setText("Você ganhou um desconto de 30%");
        }

        if(nome.charAt(0) == 'u')
        {
            theView.setText("Você ganhou um desconto de 30%");
        }

        else
            {
                theView.setText("Infelizmente hoje não é seu dia de ganhar desconto !");
            }
    }
}
