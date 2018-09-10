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

            TextView entidad=(TextView)findViewById(R.id.entidad);
            entidad.toString();
            TextView curp= (TextView)findViewById(R.id.curp);
            curp.toString();
            TextView sex= (TextView)findViewById(R.id.genre);
            sex.toString();
            curp.toString();
            String code;

        if(entidad="Aguascalientes"){
            code = "AG";
        }
        if(entidad="Baja California"){
             code="BC";
            }
        if(entidad="Baja California Sur"){
              code="BS";
            }
        if (entidad="Campeche"){
           code="CM";
        }
            if (entidad="Chiapas"){
            code="CS";
        }
            if (entidad="Chihuahua"){
           code="CH";
        }
            if (entidad="Cd Mexico"){
            code="CX";
        }
            if (entidad="Cohahuila"){
            code="CD";
        }
            if (entidad ="Durango"){
            code="DG";
        }
            if (entidad="Guanajuato"){
            code="GT";
        }
            if (entidad="Guerrero"){
            code="GR";
        }
            if (entidad="Hidalgo"){
            code="HG";
        }
            if (entidad="Jalisco"){
            code="JC";
        }
            if (entidad="Mexico"){
            code="MC";
        }
            if (entidad="Michoacane"){
            code="MN";
        }
            if (entidad="Morelos"){
            code="MO";
        }
            if (entidad="Nayarit"){
            code="NA";
        }
            if (entidad="Nuevo Leon"){
            code="NL";
        }
            if (entidad="Oaxaca"){
            code="OA";
        }
            if (entidad="Puebla"){
            code="PU";
        }
            if (entidad="Queretaro"){
            code="QT";
        }
            if (entidad="Quintana Roo"){
            code="QR";
        }
            if (entidad="San Luis"){
            code="SL";
        }
            if (entidad="Sinaloa"){
            code="SI";
        }
            if (entidad="Sonora"){
            code="SO";
        }
            if (entidad="Tabasco"){
            code="TB";
        }
            if (entidad="Tamaulipas"){
            code="TM";
        }
            if (entidad="Tlaxcala"){
            code="TL";
        }
            if (entidad="Veracruz"){
            code="VE";
        }
            if (entidad="Yucatan"){
            code="YU";
        }
            if (entidad="Zacatecas"){
            code="ZA";
        }

            if(sex="Hombre"){
            curp = ("H" + code);
            };
            if(sex="Mujer"){
            curp = ("M" + code);
            };
        }
        TextView Retroceder;
        Retroceder = (TextView) findViewById(R.id.Return);
        Retroceder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        TextView Salir;
        Salir = (TextView) findViewById(R.id.finish);
        Salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
