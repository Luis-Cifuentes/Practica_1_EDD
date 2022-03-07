/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica_1_edd.hipodromo;

/**
 *
 * @author nroda
 */
public class Apuesta {
    
    //Atributos
    private String nombre_apostador;
    private Double monto_apostado;
    private int puntaje_obtenido;
    private int[] orden_caballos;
    
    //Constructor

    public Apuesta(String nombre_apostador, Double monto_apostado, int[] orden_caballos) {
        this.nombre_apostador = nombre_apostador;
        this.monto_apostado = monto_apostado;
        this.puntaje_obtenido = 0;
        this.orden_caballos = orden_caballos;
    }
    
    //Getters y Setters

    public String getNombre_apostador() {
        return nombre_apostador;
    }

    public void setNombre_apostador(String nombre_apostador) {
        this.nombre_apostador = nombre_apostador;
    }

    public Double getMonto_apostado() {
        return monto_apostado;
    }

    public void setMonto_apostado(Double monto_apostado) {
        this.monto_apostado = monto_apostado;
    }

    public int getPuntaje_obtenido() {
        return puntaje_obtenido;
    }

    public void setPuntaje_obtenido(int puntaje_obtenido) {
        this.puntaje_obtenido = puntaje_obtenido;
    }

    public int[] getOrden_caballos() {
        return orden_caballos;
    }

    public void setOrden_caballos(int[] orden_caballos) {
        this.orden_caballos = orden_caballos;
    }
    
    
    
}
