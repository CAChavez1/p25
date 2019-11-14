package p25;

import java.sql.SQLException;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import mysql.Conexion;

public class frmInicio extends javax.swing.JFrame {

    Conexion cnn = new Conexion();

    public frmInicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblPasword = new javax.swing.JLabel();
        lblBD = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtPasword = new javax.swing.JTextField();
        txtBD = new javax.swing.JTextField();
        btnConectar = new javax.swing.JButton();
        btnDesconectar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblTitulo.setText("Conexión a Base de Datos MySQL-Práctica 25");

        lblUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblUsuario.setText("Usuario");

        lblPasword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblPasword.setText("Contraseña");

        lblBD.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblBD.setText("Base de Datos");

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        btnConectar.setText("Conectar");
        btnConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarActionPerformed(evt);
            }
        });

        btnDesconectar.setText("Desconectar");
        btnDesconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesconectarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitulo)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBD)
                            .addComponent(lblUsuario, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPasword, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPasword, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtBD)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnConectar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDesconectar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblTitulo)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPasword)
                    .addComponent(txtPasword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBD)
                    .addComponent(txtBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDesconectar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConectar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnDesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesconectarActionPerformed
        try {
            cnn.cerrar();
            JOptionPane.showMessageDialog(null, "Desconexión correcta!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Desconexión incorrecta!");
        }
    }//GEN-LAST:event_btnDesconectarActionPerformed

    private void btnConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarActionPerformed
        String usr = txtUsuario.getText();
        String pwd = txtPasword.getText();
        String base = txtBD.getText();

        if (usr.isEmpty() || base.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debes escribir los datos que se piden.");
        } else {
            try {
                cnn.obtener(usr, pwd, base);
                JOptionPane.showMessageDialog(null, "Conexión exitosa!");
            } catch (SQLException | ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos!");
                System.out.println(ex.toString()); 
            } finally {
                txtUsuario.setText("");
                txtPasword.setText("");
                txtBD.setText("");
            }
        }
    }//GEN-LAST:event_btnConectarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        try {
            JOptionPane.showMessageDialog(null, "Cerrando la base de datos...");
            TimeUnit.SECONDS.sleep(2);
            cnn.cerrar();
            JOptionPane.showMessageDialog(null, "Cierre correcto!");
            System.exit(0);
        } catch (SQLException | InterruptedException ex) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, se pprodujo un error al cerrar la base de datos :( ");
        }
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConectar;
    private javax.swing.JButton btnDesconectar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblBD;
    private javax.swing.JLabel lblPasword;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtBD;
    private javax.swing.JTextField txtPasword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
