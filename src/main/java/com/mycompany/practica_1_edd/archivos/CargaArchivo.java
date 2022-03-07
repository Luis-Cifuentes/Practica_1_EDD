/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica_1_edd.archivos;

import com.mycompany.practica_1_edd.hipodromo.Apuesta;
import com.mycompany.practica_1_edd.listas.ServicioCritico;
import com.mycompany.practica_1_edd.resultados.Resultados;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nroda
 */
public class CargaArchivo {

    private static String linea;

    //Metodos
    public static void cargarArchivo(String ruta) {//Este metodo carga el archivo
        File archivo = new File(ruta);
        if (archivo.exists()) {
            try {
                BufferedReader lectura = new BufferedReader(new FileReader(archivo));
                while ((linea = lectura.readLine()) != null) {
                    String[] arregloDatos = linea.split(",");
                    if (arregloDatos.length == 12) {
                        String nombre = arregloDatos[0];
                        double monto = Double.parseDouble(arregloDatos[1]);
                        int[] ordenCaballos = new int[10];
                        ordenCaballos[0] = Integer.parseInt(arregloDatos[2]);
                        ordenCaballos[1] = Integer.parseInt(arregloDatos[3]);
                        ordenCaballos[2] = Integer.parseInt(arregloDatos[4]);
                        ordenCaballos[3] = Integer.parseInt(arregloDatos[5]);
                        ordenCaballos[4] = Integer.parseInt(arregloDatos[6]);
                        ordenCaballos[5] = Integer.parseInt(arregloDatos[7]);
                        ordenCaballos[6] = Integer.parseInt(arregloDatos[8]);
                        ordenCaballos[7] = Integer.parseInt(arregloDatos[9]);
                        ordenCaballos[8] = Integer.parseInt(arregloDatos[10]);
                        ordenCaballos[9] = Integer.parseInt(arregloDatos[11]);
                        Apuesta apuesta = new Apuesta(nombre, monto, ordenCaballos);
                        ServicioCritico.insertarApuesta(apuesta);
                        Resultados.setTamanioLista(1);
                    }
                }
                lectura.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(CargaArchivo.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(CargaArchivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void guardarRechazadas(String ruta, String apuestas){//Este metodo guarda las apuestas rechazadas
        File archivo = new File(ruta);
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(CargaArchivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            FileWriter escribir = new FileWriter(archivo);
            BufferedWriter buffer = new BufferedWriter(escribir);
            buffer.write(apuestas);
            buffer.close();
        } catch (IOException ex) {
            Logger.getLogger(CargaArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
