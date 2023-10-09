package pe.edu.idat.appforms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import pe.edu.idat.appforms.databinding.ActivityMainBinding;
import pe.edu.idat.appforms.databinding.ActivityPrimosBinding;

public class PrimosActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityPrimosBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPrimosBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.idCalcularprimo.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Integer numero= Integer.parseInt(binding.txtnumprimo.getText().toString());
        String resultado = esPrimo(numero) ? "El número ingresado es PRIMO":"El número ingresado no es PRIMO";
        binding.txtr.setText(resultado);
    }
    private Boolean esPrimo(Integer numero){
        int contador=0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i==0){
                contador++;
            }
        }
        return contador <= 2;
    }
}