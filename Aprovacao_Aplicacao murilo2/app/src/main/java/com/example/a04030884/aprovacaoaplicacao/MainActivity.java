package com.example.a26146398.aprovacaoaplicacao;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    public TextInputEditText nota1;
    public TextInputEditText nota2;
    public TextView theView;
    public float resultado;
    public float v1;
    public float v2;
    public Button theButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        theButton = findViewById(R.id.button);
        theView = findViewById(R.id.textView);
        nota1 = findViewById(R.id.av1);
        nota2 = findViewById(R.id.av2);

    }

    public void Calcular(View v)
    {
        v1 = Float.parseFloat(nota1.getText().toString());
        v2 = Float.parseFloat(nota2.getText().toString());
        resultado = (v1 + v2) / 2;
        if(resultado >= 7.0f)
            theView.setText("Você foi aprovado !");
        else if (resultado < 7.0 & resultado >= 4.0)
            theView.setText("Você ficou de prova final !");
        else
            theView.setText("Você foi reprovado");


    }
}
