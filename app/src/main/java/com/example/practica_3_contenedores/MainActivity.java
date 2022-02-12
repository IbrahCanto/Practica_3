package com.example.practica_3_contenedores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Declarar las variables por elemento
    TextView register2, show;
    ImageView logo;
    EditText user, pass;
    Button iniciar, salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Inicializar nuestros elementos
        setContentView(R.layout.activity_main);
        register2 =(TextView) findViewById(R.id.register2);
        logo=(ImageView) findViewById(R.id.logo);
        user=(EditText) findViewById(R.id.eiduser);
        pass=(EditText) findViewById(R.id.edipass);
        iniciar=(Button) findViewById(R.id.btninicio);
        salir=(Button) findViewById(R.id.btncancelar);
        show=(TextView) findViewById(R.id.show);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Bloque que se ejecuta
                Toast.makeText(getApplicationContext(), "Hiciste click en el TextView", Toast.LENGTH_LONG).show();
                Log.i("ERROR1", "Diste click en el TextView");
            }
        });

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Bloque que se ejecuta
                Toast.makeText(getApplicationContext(), "Hiciste click en el TextView", Toast.LENGTH_LONG).show();
                Log.i("ERROR1", "Diste click en el TextView");
                finish();
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });



    }


    public void Registro (View view){
        Intent registro = new Intent(this, MainActivity2.class);
        startActivity(registro);
    }
}