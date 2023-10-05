package pe.edu.idat.appforms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import pe.edu.idat.appforms.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityMainBinding binding; //aumentar

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //aumentar
        binding =  ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnCalcular.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Integer numero1 = Integer.parseInt(binding.txtnum1.getText().toString());
        Integer numero2 = Integer.parseInt(binding.txtnum2.getText().toString());
        Integer suma =  sumar(numero1,numero2);
        binding.txtResultado.setText("El resultado es "+suma);
    }

    private Integer sumar(Integer numero1, Integer numero2){
        return numero1+numero2;
    }
}