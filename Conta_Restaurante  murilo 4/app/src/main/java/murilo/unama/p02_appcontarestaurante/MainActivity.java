package Luiz.unama.p02_appcontarestaurante;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // 1. declarar os componentes dinâmicos:
    EditText editValor;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 2. Integração com o XML:
        editValor = findViewById(R.id.edit_valor);
        txtResultado = findViewById(R.id.txt_resultado);
    } // fim do onCreate

    // 3. método para calcular o resultado:
    public void calcResultado(View v) {
        // 4. pegar valor digitado:
        String valorDigitado = editValor.getText().toString();
        // 5. converter String para double:
        double valor = Double.parseDouble(valorDigitado);
        // 6. realizar o cálculo:
        double resultado = valor * 1.1;
        // 7. atribuir o resultado na tela:
        txtResultado.setText("Conta com 10%: R$ "+resultado);
    } // fim do calcResultado

} // fim da classe
