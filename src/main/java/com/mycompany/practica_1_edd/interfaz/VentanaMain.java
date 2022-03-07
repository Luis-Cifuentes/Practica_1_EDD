/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica_1_edd.interfaz;

import com.mycompany.practica_1_edd.hipodromo.LlenadorImagenes;
import com.mycompany.practica_1_edd.archivos.CargaArchivo;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author nroda
 */
public class VentanaMain extends javax.swing.JFrame {
    
    //Atributos
    private LlenadorImagenes imagenes = new LlenadorImagenes();

    /**
     * Creates new form VentanaMain
     */
    public VentanaMain() {
        initComponents();
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.Label_Imagen.setIcon(imagenes.editarFondo(this.Label_Imagen));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Fondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Boton_Manual = new javax.swing.JButton();
        Boton_Carga = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Panel_Imagen = new javax.swing.JPanel();
        Label_Imagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel_Fondo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Sistema para registro de apuestas");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("SimSun", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Hipodromo BigO");

        Boton_Manual.setBackground(new java.awt.Color(0, 0, 0));
        Boton_Manual.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        Boton_Manual.setForeground(new java.awt.Color(255, 255, 255));
        Boton_Manual.setText("Ingreso Manual");
        Boton_Manual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_ManualActionPerformed(evt);
            }
        });

        Boton_Carga.setBackground(new java.awt.Color(0, 0, 0));
        Boton_Carga.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        Boton_Carga.setForeground(new java.awt.Color(255, 255, 255));
        Boton_Carga.setText("Cargar Archivo");
        Boton_Carga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_CargaActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Seleccion como introduciras las apuestas...");

        Panel_Imagen.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Panel_ImagenLayout = new javax.swing.GroupLayout(Panel_Imagen);
        Panel_Imagen.setLayout(Panel_ImagenLayout);
        Panel_ImagenLayout.setHorizontalGroup(
            Panel_ImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Label_Imagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Panel_ImagenLayout.setVerticalGroup(
            Panel_ImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Label_Imagen, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Panel_FondoLayout = new javax.swing.GroupLayout(Panel_Fondo);
        Panel_Fondo.setLayout(Panel_FondoLayout);
        Panel_FondoLayout.setHorizontalGroup(
            Panel_FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_FondoLayout.createSequentialGroup()
                .addGroup(Panel_FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_FondoLayout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel1))
                    .addGroup(Panel_FondoLayout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addGroup(Panel_FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(Panel_FondoLayout.createSequentialGroup()
                                .addComponent(Boton_Manual)
                                .addGap(85, 85, 85)
                                .addComponent(Boton_Carga))
                            .addComponent(Panel_Imagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(Panel_FondoLayout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jLabel2)))
                .addContainerGap(194, Short.MAX_VALUE))
        );
        Panel_FondoLayout.setVerticalGroup(
            Panel_FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_FondoLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(Panel_Imagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(43, 43, 43)
                .addGroup(Panel_FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton_Manual)
                    .addComponent(Boton_Carga))
                .addGap(103, 103, 103))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_ManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_ManualActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Este modo esta deshabilitado");
    }//GEN-LAST:event_Boton_ManualActionPerformed

    private void Boton_CargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_CargaActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        int seleccion = fc.showOpenDialog(this);
        // Escogemos el fichero
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = fc.getSelectedFile();
            String ruta = archivo.getAbsolutePath();
            CargaArchivo.cargarArchivo(ruta);
            VentanaApuestas nuevaVentana = new VentanaApuestas();
            this.setVisible(false);
        }
    }//GEN-LAST:event_Boton_CargaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Carga;
    private javax.swing.JButton Boton_Manual;
    private javax.swing.JLabel Label_Imagen;
    private javax.swing.JPanel Panel_Fondo;
    private javax.swing.JPanel Panel_Imagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
