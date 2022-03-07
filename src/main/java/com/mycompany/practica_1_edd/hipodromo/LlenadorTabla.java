/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica_1_edd.hipodromo;

import com.mycompany.practica_1_edd.listas.Nodo;
import com.mycompany.practica_1_edd.listas.ServicioCritico;
import javax.swing.JMenuItem;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nroda
 */
public class LlenadorTabla {
    
    //Metodo que se encarga de llenar la tabla que muestra todos los elementos de las apuestas
    public static void llenarTablaApuestas(JTable tabladatos) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nombre");
        model.addColumn("Monto");
        model.addColumn("1er");
        model.addColumn("2do");
        model.addColumn("3er");
        model.addColumn("4to");
        model.addColumn("5to");
        model.addColumn("6to");
        model.addColumn("7mo");
        model.addColumn("8vo");
        model.addColumn("9no");
        model.addColumn("10mo");

        //Se llena la tabla
        Nodo auxiliar = ServicioCritico.getPrimero();
        while (auxiliar != null) {
            int[] orden = auxiliar.getApuesta().getOrden_caballos();       
            model.addRow(new Object[]{auxiliar.getApuesta().getNombre_apostador(), auxiliar.getApuesta().getMonto_apostado(), orden[0]+"", orden[1]+"",
            orden[2]+"", orden[3]+"", orden[4]+"", orden[5]+"", orden[6]+"", orden[7]+"", orden[8]+"", orden[9]+""});
            auxiliar = auxiliar.getSiguiente();
        }
        tabladatos.setModel(model);
    }
    
    //Metodo que llena la tabla solo mostrando los resultados
    public static void llenarTablaResultados(JTable tabladatos) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nombre");
        model.addColumn("Monto");
        model.addColumn("Puntaje Obtenido");

        //Se llena la tabla
        Nodo auxiliar = ServicioCritico.getPrimero();
        while (auxiliar != null) {
            int[] orden = auxiliar.getApuesta().getOrden_caballos();       
            model.addRow(new Object[]{auxiliar.getApuesta().getNombre_apostador(), auxiliar.getApuesta().getMonto_apostado(), auxiliar.getApuesta().getPuntaje_obtenido()});
            auxiliar = auxiliar.getSiguiente();
        }
        tabladatos.setModel(model);
    }
    
}
