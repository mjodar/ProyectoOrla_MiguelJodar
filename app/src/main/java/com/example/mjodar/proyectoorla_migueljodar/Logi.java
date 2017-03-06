package com.example.mjodar.proyectoorla_migueljodar;

import android.content.Context;
import android.os.AsyncTask;

/**
 * Created by mjodar on 6/03/17.
 */

public class Logi extends AsyncTask <String , Void, Alumno> {
    String usuario, pass;
    Context context;

    //-------------------------------------------------

    public Logi() {
    }

    public Logi(String usuario, String pass, Context context) {
        this.usuario = usuario;
        this.pass = pass;
        this.context = context;
    }

    //-------------------------------------------------

    @Override
    protected Alumno doInBackground(String... strings) {
        return null;
    }


}
