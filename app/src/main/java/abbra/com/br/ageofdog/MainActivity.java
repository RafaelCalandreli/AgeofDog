package abbra.com.br.ageofdog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    private EditText caixaTexto;
    private Button botaoIdade;
    private TextView resultadoIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caixaTexto = (EditText) findViewById(R.id.caixaTextoId);
        botaoIdade = (Button) findViewById(R.id.botaoGerarIdadeID);
        resultadoIdade =(TextView) findViewById(R.id.resultadoId);

        botaoIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //recuperar o que foi digitado

               String textoDigitado = caixaTexto.getText().toString();

                if(textoDigitado.isEmpty()){
                    resultadoIdade.setText("Nenhum valor foi informado");

                }else{
                    int valorDigitado = Integer.parseInt(textoDigitado);
                    int resultadoFinal = (valorDigitado * 7);
                    resultadoIdade.setText("A idade do cachorro é "+ resultadoFinal);
                }



            }
        });


    }
}
