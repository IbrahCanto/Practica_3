package com.example.practica_3_contenedores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    //TextView mensaje;
    //String NombreUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //mensaje=(TextView) findViewById(R.id.TextView2);

        //Bundle extras = getIntent().getExtras();
        //NombreUser = extras.getString("NombreUser");
        //mensaje.setText("Hola "+ NombreUser + " bienvenid@ a mi pantalla");
    }

    public void Anterior (View view){
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);

    }


}