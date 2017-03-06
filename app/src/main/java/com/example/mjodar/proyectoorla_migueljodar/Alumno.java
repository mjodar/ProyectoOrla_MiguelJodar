package com.example.mjodar.proyectoorla_migueljodar;

import android.graphics.Bitmap;

/**
 * Created by mjodar on 6/03/17.
 */

public class Alumno {
    private String nombre;
    private String apellido;
    private String curso;
    private String cumple;
    private String user;
    private Bitmap foto;


    public Alumno() {
    }

    public Alumno(String nombre, String apellido, String curso, String cumple, String user, Bitmap foto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.cumple = cumple;
        this.user = user;
        this.foto = foto;
    }


    //------------------------------------------------------------

    public String getNombre() {
        return nombre;
    }


    public String getCumple() {
        return cumple;
    }


    public String getApellido() {
        return apellido;
    }


    public String getUser() {
        return user;
    }

    public String getCurso() {
        return curso;
    }


    public Bitmap getFoto() {
        return foto;
    }

    //------------------------------------------------------------

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCumple(String cumple) {
        this.cumple = cumple;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }


    public void setUser(String user) {
        this.user = user;
    }

    public void setFoto(Bitmap foto) {
        this.foto = foto;
    }

    //------------------------------------------------------------
}
