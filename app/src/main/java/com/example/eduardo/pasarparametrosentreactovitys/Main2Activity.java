package com.example.eduardo.pasarparametrosentreactovitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {


    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //creamos la relacion de connecion de parte logica y de diseño
        tv1 = (TextView)findViewById(R.id.tv1);

        //obtengo la funcion que tiene el primer intent, .getInte.... obtengo el valor, dato o key
        //dependiendo del parametro que ocupes es el parametro que vas a recivir
        //eso se cambia en  .getString o .getInt o lo que envies
        String dato = getIntent().getStringExtra("dato");

        //tomo a tv1 y le digo que muestre lo que tiene el String dato
        tv1.setText("hola "+dato);
    }


    public void regresar(View view){
        Intent regreso = new Intent(this,MainActivity.class);
        startActivity(regreso);
    }

}
