/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import MetodosDeBusqueda.Busqueda;
import MetodosDeOrdenamiento.Ordenamiento;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author isidro
 */
public class VentanaBusqueda extends javax.swing.JFrame {

    private long[] arreglo, busquedaBinaria;
    private Busqueda buscar;
    private Ordenamiento ordenar;
    private boolean ordenado;

    /**
     * Creates new form VentanaBusqueda
     */
    public VentanaBusqueda() {
        busquedaBinaria = null;
        ordenado = false;
        buscar = new Busqueda();
        ordenar = new Ordenamiento();
        arreglo = new long[100000];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (long) (100000 * Math.random());
        }
        initComponents();
        mostrarArreglo(arreglo);
        this.setTitle("Ventana busqueda");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSecuencial = new javax.swing.JLabel();
        btnBusquedaSecuencial = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        PaneArreglo = new javax.swing.JTextPane();
        lblNumSec = new javax.swing.JLabel();
        txtNumSec = new javax.swing.JTextField();
        lblResultado = new javax.swing.JLabel();
        lblTimepoSec = new javax.swing.JLabel();
        txtTiempoSecuencial = new javax.swing.JTextField();
        txtNumBin = new javax.swing.JTextField();
        lblResultadoBin = new javax.swing.JLabel();
        lblTiempoBin = new javax.swing.JLabel();
        txtTiempoBin = new javax.swing.JTextField();
        lblBinaria = new javax.swing.JLabel();
        bntBusquedaBinaria = new javax.swing.JButton();
        lblNumBin = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblSecuencial.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        lblSecuencial.setText("Busqueda secuencial");
        lblSecuencial.setToolTipText("");

        btnBusquedaSecuencial.setText("Buscar");
        btnBusquedaSecuencial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBusquedaSecuencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedaSecuencialActionPerformed(evt);
            }
        });

        PaneArreglo.setEditable(false);
        PaneArreglo.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        jScrollPane1.setViewportView(PaneArreglo);

        lblNumSec.setText("Numero busqueda");

        lblResultado.setText("Resultado busqueda secuencial");

        lblTimepoSec.setText("Tiempo de busqueda:");

        txtTiempoSecuencial.setEditable(false);

        lblResultadoBin.setText("Resultado busqueda binaria");

        lblTiempoBin.setText("Tiempo de busqueda:");

        txtTiempoBin.setEditable(false);

        lblBinaria.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        lblBinaria.setText("Busqueda binaria");
        lblBinaria.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        bntBusquedaBinaria.setText("Buscar");
        bntBusquedaBinaria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bntBusquedaBinaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBusquedaBinariaActionPerformed(evt);
            }
        });

        lblNumBin.setText("Numero busqueda");

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/volver.png"))); // NOI18N
        btnVolver.setToolTipText("Volver");
        btnVolver.setContentAreaFilled(false);
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnVolver))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblResultadoBin, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblSecuencial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblNumSec)
                                        .addComponent(lblTimepoSec))
                                    .addGap(38, 38, 38)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtNumSec, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(56, 56, 56)
                                            .addComponent(btnBusquedaSecuencial))
                                        .addComponent(txtTiempoSecuencial, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblBinaria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblNumBin)
                                        .addComponent(lblTiempoBin))
                                    .addGap(38, 38, 38)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtNumBin, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(56, 56, 56)
                                            .addComponent(bntBusquedaBinaria))
                                        .addComponent(txtTiempoBin, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSecuencial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNumSec)
                            .addComponent(txtNumSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBusquedaSecuencial))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTimepoSec)
                                .addGap(18, 18, 18)
                                .addComponent(lblResultado))
                            .addComponent(txtTiempoSecuencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lblBinaria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNumBin)
                            .addComponent(txtNumBin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bntBusquedaBinaria))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTiempoBin)
                                .addGap(18, 18, 18)
                                .addComponent(lblResultadoBin))
                            .addComponent(txtTiempoBin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBusquedaSecuencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaSecuencialActionPerformed
        if(txtNumSec.getText().isEmpty()) showMessageDialog(this,"NO hay un numero que buscar");
        try {
            long numBusqueda = Integer.parseInt(txtNumSec.getText());

            long inicio = System.nanoTime();
            boolean encontrado = buscar.Secuencial(arreglo, numBusqueda);
            long fin = System.nanoTime();

            long tiempoTotal = fin - inicio;
            double tiempo = (tiempoTotal / 1e+9);
            txtTiempoSecuencial.setText(tiempo + " segundos");
            if (encontrado) {
                lblResultado.setText("Valor encontrado en la posicion " + buscar.pos);
            } else {
                lblResultado.setText("Valor no encontrado en el arreglo");
            }
        } catch (NumberFormatException e) {
            showMessageDialog(this,"Solo es posible buscar numeros enteros");
        }

    }//GEN-LAST:event_btnBusquedaSecuencialActionPerformed

    private void bntBusquedaBinariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBusquedaBinariaActionPerformed
        if(txtNumBin.getText().isEmpty()) showMessageDialog(this,"NO hay un numero que buscar");
        try{
            long numBusqueda = Integer.parseInt(txtNumBin.getText());
            if (!ordenado) {
                busquedaBinaria = ordenar.Shellsort(arreglo);
                mostrarArreglo(busquedaBinaria);
                ordenado = true;
            }
            long inicio = System.nanoTime();
            boolean encontrado = buscar.Binaria(busquedaBinaria, numBusqueda);
            long fin = System.nanoTime();

            long tiempoTotal = fin - inicio;
            double tiempo = (tiempoTotal / 1e+9);
            txtTiempoBin.setText(tiempo + " segundos");
            if (encontrado) {
                lblResultadoBin.setText("Valor encontrado en la posicion " + buscar.pos);
            } else {
                lblResultadoBin.setText("Valor no encontrado en el arreglo");
            }
        }catch(NumberFormatException e){
            showMessageDialog(this,"Solo es posible buscar numeros enteros");
        }    
    }//GEN-LAST:event_bntBusquedaBinariaActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Principal p = new Principal();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    public void mostrarArreglo(long[] arregloMostrar) {
        String mostrar = "";
        for (int i = 0; i < arregloMostrar.length; i++) {
            mostrar += "[" + (i + 1) + "] " + arregloMostrar[i] + "\n";
        }
        PaneArreglo.setText(mostrar);
    }

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
            java.util.logging.Logger.getLogger(VentanaBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaBusqueda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane PaneArreglo;
    private javax.swing.JButton bntBusquedaBinaria;
    private javax.swing.JButton btnBusquedaSecuencial;
    private javax.swing.JButton btnVolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBinaria;
    private javax.swing.JLabel lblNumBin;
    private javax.swing.JLabel lblNumSec;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblResultadoBin;
    private javax.swing.JLabel lblSecuencial;
    private javax.swing.JLabel lblTiempoBin;
    private javax.swing.JLabel lblTimepoSec;
    private javax.swing.JTextField txtNumBin;
    private javax.swing.JTextField txtNumSec;
    private javax.swing.JTextField txtTiempoBin;
    private javax.swing.JTextField txtTiempoSecuencial;
    // End of variables declaration//GEN-END:variables
}
