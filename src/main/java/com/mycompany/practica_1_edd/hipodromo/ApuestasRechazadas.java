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
public class ApuestasRechazadas {
    
    private static String rechazadas = "";

    public static String getRechazadas() {
        return rechazadas;
    }

    public static void setRechazadas(String rechazadas) {
        ApuestasRechazadas.rechazadas += rechazadas;
    }
    
    
}
