/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica_1_edd.resultados;

import com.mycompany.practica_1_edd.listas.Nodo;
import com.mycompany.practica_1_edd.listas.ServicioCritico;

/**
 *
 * @author nroda
 */
public class Resultados {

    //Atributos
    public static int contadorPasosverificacion = 0;
    public static int contadorPasosCalculos = 0;
    public static int contadorPasosOrdenNombre = 0;
    public static int contadorPasosOrdenPuntos = 0;
    public static int tiempoVerificacion = 0;
    public static int tiemporCalculos = 0;
    public static int tiempoNombre = 0;
    public static int tiempoPuntos = 0;
    public static int tamanioLista = 0;

    //Calcula el tamaño de la lista
    public static void calcularTamaño() {
        Nodo auxiliar = ServicioCritico.getPrimero();
        while (auxiliar != null) {
            tamanioLista++;
            auxiliar = auxiliar.getSiguiente();
        }
    }

    //Reinicia los valores para una nueva cuenta
    public static void reinicarValores() {
        contadorPasosverificacion = 0;
        contadorPasosCalculos = 0;
        contadorPasosOrdenNombre = 0;
        contadorPasosOrdenPuntos = 0;
        tiempoVerificacion = 0;
        tiemporCalculos = 0;
        tiempoNombre = 0;
        tiempoPuntos = 0;
        tamanioLista = 0;
    }

    //Getters y Setters
    public static int getContadorPasosverificacion() {
        return contadorPasosverificacion;
    }

    public static void setContadorPasosverificacion(int contadorPasosverificacion) {
        Resultados.contadorPasosverificacion += contadorPasosverificacion;
    }

    public static int getContadorPasosCalculos() {
        return contadorPasosCalculos;
    }

    public static void setContadorPasosCalculos(int contadorPasosCalculos) {
        Resultados.contadorPasosCalculos += contadorPasosCalculos;
    }

    public static int getContadorPasosOrdenNombre() {
        return contadorPasosOrdenNombre;
    }

    public static void setContadorPasosOrdenNombre(int contadorPasosOrden) {
        Resultados.contadorPasosOrdenNombre += contadorPasosOrden;
    }

    public static int getTamanioLista() {
        return tamanioLista;
    }

    public static void setTamanioLista(int tamanioLista) {
        Resultados.tamanioLista = tamanioLista;
    }

    public static int getContadorPasosOrdenPuntos() {
        return contadorPasosOrdenPuntos;
    }

    public static void setContadorPasosOrdenPuntos(int contadorPasosOrdenPuntos) {
        Resultados.contadorPasosOrdenPuntos += contadorPasosOrdenPuntos;
    }

    public static int getTiempoVerificacion() {
        return tiempoVerificacion;
    }

    public static void setTiempoVerificacion(int tiempoVerificacion) {
        Resultados.tiempoVerificacion += tiempoVerificacion;
    }

    public static int getTiemporCalculos() {
        return tiemporCalculos;
    }

    public static void setTiemporCalculos(int tiemporCalculos) {
        Resultados.tiemporCalculos += tiemporCalculos;
    }

    public static int getTiempoNombre() {
        return tiempoNombre;
    }

    public static void setTiempoNombre(int tiempoNombre) {
        Resultados.tiempoNombre += tiempoNombre;
    }

    public static int getTiempoPuntos() {
        return tiempoPuntos;
    }

    public static void setTiempoPuntos(int tiempoPuntos) {
        Resultados.tiempoPuntos += tiempoPuntos;
    }

}
