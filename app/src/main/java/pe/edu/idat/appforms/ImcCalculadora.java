package pe.edu.idat.appforms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import pe.edu.idat.appforms.databinding.ActivityImcCalculadoraBinding;

public class ImcCalculadora extends AppCompatActivity implements View.OnClickListener {
//para ejecturar este archivo cambiar en androidManifest el intent-filter.
    private ActivityImcCalculadoraBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityImcCalculadoraBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnCalcularImc.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Double talla = Double.parseDouble(binding.txttalla.getText().toString());
        Double peso = Double.parseDouble(binding.txtpeso.getText().toString());
        binding.txtResultadoImc.setText(diagnostico(calcularImc(talla,peso)));
    }

    private Double calcularImc(Double centimetros, Double peso){
        Double talla = centimetros/100;
        Double imc = peso/(talla*talla);
        return imc;
    }

    private String diagnostico(Double ValorImc){
        String resultado =  "";
        if(ValorImc <= 18.5){
            resultado = "Por debajo del peso";
        } else if (ValorImc <= 25) {
            resultado = "Peso normal";
        } else if (ValorImc <= 30) {
            resultado = "Sobrepeso";
        } else if (ValorImc <= 35) {
            resultado = "Obesidad Leve";
        } else if (ValorImc <= 39) {
            resultado = "Obesidad media";
        }else {
            resultado =  "Obesidad mórbida";
        }

        return resultado;
    }
}