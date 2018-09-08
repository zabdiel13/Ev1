package com.example.adrianzabdiel.ev1;

import android.os.Parcel;
import android.os.Parcelable;

public class Usuario implements Parcelable {

    public String nombres;
    public String apellidos;
    public String nacimiento;
    public String sexo;
    public String state;

    public Usuario(String nombres, String apellidos, String nacimiento, String sexo, String state) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.nacimiento = nacimiento;
        this.sexo = sexo;
        this.state = state;
    }

    public String n() {return nombres; }
    public String a() {return apellidos; }
    public String f() {return nacimiento; }
    public String s() {return sexo; }
    public String e() {return state; }

    protected Usuario(Parcel in) {
        nombres = in.readString();
        apellidos = in.readString();
        nacimiento = in.readString();
        sexo = in.readString();
        state = in.readString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nombres);
        dest.writeString(apellidos);
        dest.writeString(nacimiento);
        dest.writeString(sexo);
        dest.writeString(state);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Usuario> CREATOR = new Parcelable.Creator<Usuario>() {

        public Usuario createFromParcel(Parcel in) {
            return new Usuario(in);
        }

        public Usuario[] newArray(int size) {
            return new Usuario[size];
        }
    };
}

