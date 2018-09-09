package com.example.adrianzabdiel.ev1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText nombres= (EditText) findViewById(R.id.editText19);
        final EditText apellidos= (EditText) findViewById(R.id.editText16);
        final EditText sexo= (EditText) findViewById(R.id.editText);
        final EditText nacimiento= (EditText) findViewById(R.id.editText22);
        final String state = ((Spinner) findViewById(R.id.spinner)).getSelectedItem().toString();
        Button boton = (Button) findViewById(R.id.button);

        boton.setOnClickListener (new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                Usuario usuario = new Usuario (nombres.getText().toString(), apellidos.getText().toString(),sexo.getText().toString(),nacimiento.getText().toString(),state);
                intent.putExtra("usuario", usuario);
                startActivity(intent);
            }
        });


    }
}
