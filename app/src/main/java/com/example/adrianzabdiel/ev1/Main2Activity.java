package com.example.adrianzabdiel.ev1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String datos = new String();
        Bundle extras = getIntent().getExtras();
        Usuario usuario= extras.getParcelable("usuario");
        if(usuario != null)
        {
            TextView nombres = (TextView)findViewById(R.id.nom);
            nombres.setText(usuario.nombres);
            TextView apellidos = (TextView)findViewById(R.id.ap);
            apellidos.setText(usuario.apellidos);
            TextView sexo = (TextView)findViewById(R.id.genre);
            sexo.setText(usuario.sexo);
            TextView nacimiento = (TextView)findViewById(R.id.born);
            nacimiento.setText(usuario.nacimiento);
            TextView state= (TextView)findViewById(R.id.entidad);
            state.setText(usuario.state);
        }


    }
}
