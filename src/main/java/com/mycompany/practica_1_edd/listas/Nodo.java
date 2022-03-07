/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica_1_edd.listas;

import com.mycompany.practica_1_edd.hipodromo.Apuesta;

/**
 *
 * @author nroda
 */
public class Nodo {
    //Atributos
    private Nodo siguiente;
    private Nodo anterior;
    private Apuesta apuesta;
    //Contructor
    public Nodo(Nodo siguiente, Nodo anterior, Apuesta apuesta) {
        this.siguiente = siguiente;
        this.anterior = anterior;
        this.apuesta = apuesta;
    }
 
    //Getters y Setters

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public Apuesta getApuesta() {
        return apuesta;
    }

    public void setApuesta(Apuesta apuesta) {
        this.apuesta = apuesta;
    }

    
    
}
