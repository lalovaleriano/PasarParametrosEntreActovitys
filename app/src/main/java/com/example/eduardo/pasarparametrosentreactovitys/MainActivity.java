package com.example.eduardo.pasarparametrosentreactovitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText et1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //se conecta la parte logica con la parte grafica
        et1 = (EditText)findViewById(R.id.et1);
    }

    //metodo para el boton enviar
    public void enviar(View view){
        //con un intent conecto las dos actovitys
        Intent i = new Intent(this,Main2Activity.class);


        //con esto paso lo que el usuario escriba
        //se llevara lo que tenga et1 la parte de dato es el nombre llave o identificador
        i.putExtra("dato",et1.getText().toString());

        //inicio el metodo startactivity
        startActivity(i);

    }
}
