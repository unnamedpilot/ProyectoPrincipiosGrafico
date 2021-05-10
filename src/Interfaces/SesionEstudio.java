/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases.Conexion;
import Clases.Conexion;
import Clases.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

/**
 *
 * @author alver
 */
public class SesionEstudio extends javax.swing.JFrame {

    PreparedStatement pst = null;
    ResultSet rs = null;
    Connection con = null;
    public SesionEstudio() {
        initComponents();
        this.setLocationRelativeTo(null);
        con = Conexion.conectar();
        this.pnlResp.setVisible(false);
        this.txtRespuesta.setVisible(false);
        
        String sql = "SELECT * FROM usuarios WHERE correo LIKE ? AND contrasena LIKE ?";
        try {
            pst = con.prepareStatement(sql);
            
            pst.setString(1,mail);
            pst.setString(2,pass);
            rs = pst.executeQuery();
            
            if(rs.next())
            {
                this.dispose();
                Dashboard Tekli = new Dashboard();
                Tekli.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Contraseña o usuario incorrecto", "Fallo", JOptionPane.NO_OPTION);
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnMostrarResp = new javax.swing.JButton();
        pnlResp = new javax.swing.JPanel();
        btnOtraVez = new javax.swing.JButton();
        btnBien = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtRespuesta = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtPregunta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(52, 89, 239));

        btnMostrarResp.setText("Ver Respuesta");
        btnMostrarResp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMostrarResp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarRespActionPerformed(evt);
            }
        });

        pnlResp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnOtraVez.setText("Otra vez");
        btnOtraVez.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOtraVez.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnOtraVezFocusGained(evt);
            }
        });

        btnBien.setForeground(new java.awt.Color(0, 204, 0));
        btnBien.setText("Bien");
        btnBien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlRespLayout = new javax.swing.GroupLayout(pnlResp);
        pnlResp.setLayout(pnlRespLayout);
        pnlRespLayout.setHorizontalGroup(
            pnlRespLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRespLayout.createSequentialGroup()
                .addGap(323, 323, 323)
                .addComponent(btnOtraVez)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBien)
                .addContainerGap(330, Short.MAX_VALUE))
        );
        pnlRespLayout.setVerticalGroup(
            pnlRespLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRespLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnlRespLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOtraVez)
                    .addComponent(btnBien))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMostrarResp)
                .addGap(330, 330, 330))
            .addComponent(pnlResp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnlResp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnMostrarResp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 376, 787, 70));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txtRespuesta.setBackground(new java.awt.Color(255, 255, 255));
        txtRespuesta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtRespuesta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtRespuesta.setText("Respuesta");

        txtPregunta.setBackground(new java.awt.Color(255, 255, 255));
        txtPregunta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPregunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPregunta.setText("Pregunta");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(221, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(243, 243, 243))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(txtPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(185, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -5, 790, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBienActionPerformed
        this.btnMostrarResp.setVisible(true);
        this.pnlResp.setVisible(false);
        this.txtRespuesta.setVisible(false);
        
        
    }//GEN-LAST:event_btnBienActionPerformed

    private void btnOtraVezFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnOtraVezFocusGained
        
    }//GEN-LAST:event_btnOtraVezFocusGained

    private void btnMostrarRespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarRespActionPerformed
        this.btnMostrarResp.setVisible(false);
        this.pnlResp.setVisible(true);
        this.txtRespuesta.setVisible(true);
        
        
    }//GEN-LAST:event_btnMostrarRespActionPerformed

    public void cambioPreg()
    {
        
    }
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
            java.util.logging.Logger.getLogger(SesionEstudio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SesionEstudio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SesionEstudio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SesionEstudio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SesionEstudio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBien;
    private javax.swing.JButton btnMostrarResp;
    private javax.swing.JButton btnOtraVez;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel pnlResp;
    private javax.swing.JLabel txtPregunta;
    private javax.swing.JLabel txtRespuesta;
    // End of variables declaration//GEN-END:variables
}
