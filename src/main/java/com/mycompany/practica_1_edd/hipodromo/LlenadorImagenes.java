/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica_1_edd.hipodromo;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;


/**
 *
 * @author nroda
 */
public class LlenadorImagenes {
    
    //Metodos
    
    public Icon editarFondo(JLabel fondo){//Cambia el fondo del JFrame Main
        ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/Imagen_Fondo_Main.jpg"));
        Icon fondoImagen = new ImageIcon(imagenFondo.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_DEFAULT));
        return fondoImagen;
    }
    
    public Icon editarFondoRechazo(JLabel fondo){//Cambia el fondo del JFrame Main
        ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/Rechazo.jpg"));
        Icon fondoImagen = new ImageIcon(imagenFondo.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_DEFAULT));
        return fondoImagen;
    }
    
    public Icon editarFondoTiempo(JLabel fondo){//Cambia el fondo del JFrame Main
        ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/Tiempo.jpg"));
        Icon fondoImagen = new ImageIcon(imagenFondo.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_DEFAULT));
        return fondoImagen;
    }
    
    
}
