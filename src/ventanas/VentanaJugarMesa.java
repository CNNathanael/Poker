/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import clases.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Narcis
 */
public class VentanaJugarMesa extends javax.swing.JFrame {
    private JFrame principal;
    private static Jugador_registrado jug;
    private final HashMap<String, Jugador_registrado> jugadores;
    private ArrayList<Carta> mano;
    private ArrayList<Carta> mano2;
    private ArrayList<Carta> mano3;
    private ArrayList<Carta> mano4;
    /**
     * Creates new form VentanaJugarMesa
     */
    public VentanaJugarMesa(JFrame ventana) {
        initComponents();
        principal = ventana;
        principal.setVisible(false);
        this.setVisible(true);
        jugadores = CasaApuestas.getJug();
        jug = jugadores.get(VentanaJugadorRegistrado.jTextFieldNIF.getText());       
        jTextFieldSaldoActual.setText(String.valueOf(jug.getSaldo_acumulado()) + "€");
    }
    public static Jugador_registrado getJugPlayingM(){
        return jug;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextFieldApuesta = new javax.swing.JTextField();
        jButtonApostar = new javax.swing.JButton();
        jButtonAumSaldo = new javax.swing.JButton();
        jTextFieldCantidadAum = new javax.swing.JTextField();
        jButtonRetBeneficios = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jTextFieldSaldoActual = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaJugReg = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setText("Cantidad que desea apostar");

        jTextFieldApuesta.setText("5");
        jTextFieldApuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldApuestaActionPerformed(evt);
            }
        });

        jButtonApostar.setText("APOSTAR");
        jButtonApostar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApostarActionPerformed(evt);
            }
        });

        jButtonAumSaldo.setText("Aumentar Saldo");
        jButtonAumSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAumSaldoActionPerformed(evt);
            }
        });

        jButtonRetBeneficios.setText("Retirar beneficios");
        jButtonRetBeneficios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRetBeneficiosActionPerformed(evt);
            }
        });

        jButtonVolver.setText("VOLVER");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jTextAreaJugReg.setEditable(false);
        jTextAreaJugReg.setColumns(20);
        jTextAreaJugReg.setRows(5);
        jScrollPane1.setViewportView(jTextAreaJugReg);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jTextArea4.setEditable(false);
        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        jTextField2.setEditable(false);
        jTextField2.setText("Jugador Registrado");

        jTextField3.setEditable(false);
        jTextField3.setText("Jugador 2");

        jTextField4.setEditable(false);
        jTextField4.setText("Jugador 4");

        jTextField5.setEditable(false);
        jTextField5.setText("Jugador 3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addComponent(jButtonApostar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonAumSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldApuesta, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(jTextFieldCantidadAum)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldSaldoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonRetBeneficios))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addComponent(jButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSaldoActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAumSaldo)
                    .addComponent(jTextFieldCantidadAum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRetBeneficios))
                .addGap(30, 30, 30)
                .addComponent(jButtonApostar)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonVolver))
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldApuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldApuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldApuestaActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        this.setVisible(false);
        principal.setVisible(true);
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonAumSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAumSaldoActionPerformed
        double aum_saldo;
        aum_saldo = Double.parseDouble(jTextFieldCantidadAum.getText());
        jug.setSaldo_acumulado(jug.getSaldo_acumulado() + aum_saldo);
        JOptionPane.showMessageDialog(this, "Has aumentado tu saldo en:" + aum_saldo, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        jTextFieldCantidadAum.setText(null);
        jTextFieldSaldoActual.setText(String.valueOf(jug.getSaldo_acumulado()) + "€");
    }//GEN-LAST:event_jButtonAumSaldoActionPerformed

    private void jButtonRetBeneficiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRetBeneficiosActionPerformed
        JOptionPane.showMessageDialog(this, "Has retirado tu dinero.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        try {
            CasaApuestas.generaFactura(jug);
        } catch (IOException ex) {
           JOptionPane.showMessageDialog(this, "Ha ocurrido un error.", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        jug.retirarBeneficios();
        jTextFieldSaldoActual.setText(String.valueOf(0));
    }//GEN-LAST:event_jButtonRetBeneficiosActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       CasaApuestas.guardarDatos();
    }//GEN-LAST:event_formWindowClosing

    private void jButtonApostarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApostarActionPerformed
        if (Double.parseDouble((String) jTextFieldApuesta.getText()) > jug.getSaldo_acumulado()) {
            JOptionPane.showMessageDialog(this, "Saldo Insuficiente", "Aviso", JOptionPane.WARNING_MESSAGE);
        }else{
        Baraja baraja=new Baraja();
        mano= baraja.crearMano();
        mano2=baraja.crearMano();
        mano3=baraja.crearMano();
        mano4=baraja.crearMano();
        jTextAreaJugReg.setText(mano.toString());
        jTextArea2.setText(mano2.toString());
        jTextArea3.setText(mano3.toString());
        jTextArea4.setText(mano4.toString());
        jug.setSaldo_acumulado(jug.getSaldo_acumulado()-Double.parseDouble((String) jTextFieldApuesta.getText()));
        int n1,n2,n3,n4;
        n1=Apuesta.verPremioMesa(mano);
        n2=Apuesta.verPremioMesa(mano2);
        n3=Apuesta.verPremioMesa(mano3);
        n4=Apuesta.verPremioMesa(mano4);
        if (n1>=n2 & n1>=n3 &n1>=n4){
            Apuesta apuesta=new Apuesta(Double.parseDouble((String) jTextFieldApuesta.getText()),mano);
            apuesta.verPremio(mano);
            JOptionPane.showMessageDialog(this, "Has ganado !", "GANADOR", JOptionPane.INFORMATION_MESSAGE);
            Premio premio = new Premio(apuesta.verPremioEstad(mano), jug.getSaldo_acumulado()
                 - Double.parseDouble((String) jTextFieldSaldoActual.getText()), "Mesa", jug);
            
        }
        else if(n2>n1 & n2>n3 &n2>n4){
            JOptionPane.showMessageDialog(this, "El jugador 2 ha ganado", "Jugador 2", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(n3>n1 & n3>n2 &n3>n4){
            JOptionPane.showMessageDialog(this, "El jugador 3 ha ganado", "Jugador 3", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(n4>n1 & n4>n3 &n4>n2){
            JOptionPane.showMessageDialog(this, "El jugador 4 ha ganado", "Jugador 4", JOptionPane.INFORMATION_MESSAGE);
        }
        }
        jTextFieldSaldoActual.setText(String.valueOf(jug.getSaldo_acumulado()) + "€");
    }//GEN-LAST:event_jButtonApostarActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonApostar;
    private javax.swing.JButton jButtonAumSaldo;
    private javax.swing.JButton jButtonRetBeneficios;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextAreaJugReg;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextFieldApuesta;
    private javax.swing.JTextField jTextFieldCantidadAum;
    private javax.swing.JTextField jTextFieldSaldoActual;
    // End of variables declaration//GEN-END:variables
}
