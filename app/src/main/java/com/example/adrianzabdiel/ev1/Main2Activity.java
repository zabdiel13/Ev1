package com.example.adrianzabdiel.ev1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
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

            TextView fn=(TextView)findViewById(R.id.born);
            fn.toString();
            TextView entidad=(TextView)findViewById(R.id.entidad);
            String curp = null;
            TextView sex= (TextView)findViewById(R.id.genre);
            String code = null;

        if(entidad.toString() =="Aguascalientes"){
            code = "AG";
        }
        if(entidad.toString() =="Baja California"){
             code="BC";
            }
        if(entidad.toString() =="Baja California Sur"){
              code="BS";
            }
        if (entidad.toString() =="Campeche"){
           code="CM";
        }
            if (entidad.toString() =="Chiapas"){
            code="CS";
        }
            if (entidad.toString() =="Chihuahua"){
           code="CH";
        }
            if (entidad.toString() =="Cd Mexico"){
            code="CX";
        }
            if (entidad.toString() =="Cohahuila"){
            code="CD";
        }
            if (entidad.toString() =="Durango"){
            code="DG";
        }
            if (entidad.toString() =="Guanajuato"){
            code="GT";
        }
            if (entidad.toString() =="Guerrero"){
            code="GR";
        }
            if (entidad.toString() =="Hidalgo"){
            code="HG";
        }
            if (entidad.toString() =="Jalisco"){
            code="JC";
        }
            if (entidad.toString() =="Mexico"){
            code="MC";
        }
            if (entidad.toString() =="Michoacane"){
            code="MN";
        }
            if (entidad.toString() =="Morelos"){
            code="MO";
        }
            if (entidad.toString() =="Nayarit"){
            code="NA";
        }
            if (entidad.toString() =="Nuevo Leon"){
            code="NL";
        }
            if (entidad.toString() =="Oaxaca"){
            code="OA";
        }
            if (entidad.toString() =="Puebla"){
            code="PU";
        }
            if (entidad.toString() =="Queretaro"){
            code="QT";
        }
            if (entidad.toString() =="Quintana Roo"){
            code="QR";
        }
            if (entidad.toString() =="San Luis"){
            code="SL";
        }
            if (entidad.toString() =="Sinaloa"){
            code="SI";
        }
            if (entidad.toString() =="Sonora"){
            code="SO";
        }
            if (entidad.toString() =="Tabasco"){
            code="TB";
        }
            if (entidad.toString() =="Tamaulipas"){
            code="TM";
        }
            if (entidad.toString() =="Tlaxcala"){
            code="TL";
        }
            if (entidad.toString() =="Veracruz"){
            code="VE";
        }
            if (entidad.toString() =="Yucatan"){
            code="YU";
        }
            if (entidad.toString() =="Zacatecas"){
            code="ZA";

        }
            if(sex.toString() =="Hombre"){
                curp = (fn +"H" + code);
            };
            if(sex.toString() =="Mujer"){
                curp = (fn +"M" + code);
            };
        }

    }
}
