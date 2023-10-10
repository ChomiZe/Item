/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;
import item.conexion;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import item.repFiltrado;


/**
 *
 * @author hp
 */
public class Acceso extends javax.swing.JFrame {
     String claveusuario;
        String AliasDB;
        String Nombre;
        //String Apellido;
        int intento;
        int idu;
        int tipousu;
          
    /**
     * Creates new form Acceso
     */
      public Acceso() {
        this.setSize(312, 139);
        this.setLocationRelativeTo(null);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Principal = new javax.swing.JFrame();
        menuprincipal = new javax.swing.JMenuBar();
        mDatosReferenciales = new javax.swing.JMenu();
        mRefFuncionarios = new javax.swing.JMenuItem();
        mRefCargos = new javax.swing.JMenuItem();
        mMovimientos = new javax.swing.JMenu();
        mMovAsistencias = new javax.swing.JMenuItem();
        mInformes = new javax.swing.JMenu();
        mInfCargos = new javax.swing.JMenuItem();
        mInfFuncionarios = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mInfAsistencias = new javax.swing.JMenuItem();
        mCerrar = new javax.swing.JMenu();
        mCerSalir = new javax.swing.JMenuItem();
        Usuario = new javax.swing.JLabel();
        txtAlias = new javax.swing.JTextField();
        txtcontraseña = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        Usuario1 = new javax.swing.JLabel();
        txtFuncionario = new javax.swing.JTextField();

        mDatosReferenciales.setText("Datos Referenciales");

        mRefFuncionarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        mRefFuncionarios.setText("Funcionario");
        mRefFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mRefFuncionariosActionPerformed(evt);
            }
        });
        mDatosReferenciales.add(mRefFuncionarios);

        mRefCargos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        mRefCargos.setText("Cargos");
        mRefCargos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mRefCargosActionPerformed(evt);
            }
        });
        mDatosReferenciales.add(mRefCargos);

        menuprincipal.add(mDatosReferenciales);

        mMovimientos.setText("Movimientos");

        mMovAsistencias.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        mMovAsistencias.setText("Asistencias");
        mMovAsistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mMovAsistenciasActionPerformed(evt);
            }
        });
        mMovimientos.add(mMovAsistencias);

        menuprincipal.add(mMovimientos);

        mInformes.setText("Informes");

        mInfCargos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.SHIFT_MASK));
        mInfCargos.setText("Cargos");
        mInfCargos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mInfCargosActionPerformed(evt);
            }
        });
        mInformes.add(mInfCargos);

        mInfFuncionarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.SHIFT_MASK));
        mInfFuncionarios.setText("Funcionarios");
        mInfFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mInfFuncionariosActionPerformed(evt);
            }
        });
        mInformes.add(mInfFuncionarios);
        mInformes.add(jSeparator1);

        mInfAsistencias.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.SHIFT_MASK));
        mInfAsistencias.setText("Asistencias");
        mInformes.add(mInfAsistencias);

        menuprincipal.add(mInformes);

        mCerrar.setText("Cerrar...");

        mCerSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, 0));
        mCerSalir.setText("Salir del Sistema");
        mCerSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCerSalirActionPerformed(evt);
            }
        });
        mCerrar.add(mCerSalir);

        menuprincipal.add(mCerrar);

        Principal.setJMenuBar(menuprincipal);

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal.getContentPane());
        Principal.getContentPane().setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 359, Short.MAX_VALUE)
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 245, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setResizable(false);

        Usuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Usuario.setText("Alias");

        txtAlias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAliasActionPerformed(evt);
            }
        });
        txtAlias.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAliasFocusLost(evt);
            }
        });

        txtcontraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontraseñaActionPerformed(evt);
            }
        });
        txtcontraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcontraseñaKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Contraseña:");

        btnAceptar.setIcon(new javax.swing.ImageIcon("D:\\NetBeansProjects\\ITEM\\Button Icon\\1378826531_save_as.png")); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon("D:\\NetBeansProjects\\ITEM\\Button Icon\\1378826965_sign-out.png")); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        Usuario1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Usuario1.setText("Usuario:");

        txtFuncionario.setEditable(false);
        txtFuncionario.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 29, Short.MAX_VALUE)
                .addComponent(btnAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Usuario1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAlias)
                    .addComponent(txtcontraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(txtFuncionario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(Usuario))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtAlias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Usuario1)
                    .addComponent(txtFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAliasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAliasActionPerformed
        txtAlias.grabFocus();
    }//GEN-LAST:event_txtAliasActionPerformed

    private void txtAliasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAliasFocusLost
        String validar =  this.txtAlias.getText();
        if ( validar.length() > 0) {
            String sSQL = "";

            conexion mysql = new conexion();
            Connection con = mysql.getConexion();
            sSQL = "select "
                    + "u.idfuncionarios, "
                    + "f.NombreApellido, "
                    + "u.alias, "
                    + "u.clave "
                    + "from usuario u "
                    + "inner join funcionarios f on u.idfuncionarios = f.idfuncionarios WHERE alias = '" + this.txtAlias.getText()+"'";
            try {
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sSQL);

                while (rs.next()) {
                    idu = rs.getInt(1);
                    AliasDB = rs.getString(3);
                    claveusuario = rs.getString(4);
                    System.out.print(AliasDB);
                    txtFuncionario.setText(rs.getString(2));
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
            //System.out.print(AliasDB);
            String login = this.txtAlias.getText();
            if (login.equals(AliasDB)){
                this.txtcontraseña.grabFocus();
            }else {
                JOptionPane.showMessageDialog(null,"El Alias ingresado no coincide con el registro del Usuario", "Error de Alias",JOptionPane.ERROR_MESSAGE);
                
                this.txtAlias.grabFocus();

            }
        }
    }//GEN-LAST:event_txtAliasFocusLost

    private void txtcontraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontraseñaActionPerformed
        btnAceptar.doClick();
    }//GEN-LAST:event_txtcontraseñaActionPerformed

    private void txtcontraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontraseñaKeyPressed
        if (evt.getKeyCode()==evt.VK_ESCAPE) {
            dispose();
        }
    }//GEN-LAST:event_txtcontraseñaKeyPressed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if (intento < 3) {
            int x1, x2;
            String codigo="";
            String contrasenha = this.txtcontraseña.getText();
            String mensaje = "";

            for (int i = 0; i < contrasenha.length(); i++) {
                char xC = contrasenha.charAt(i);
                x1 = (int)xC;
                x2 = x1 + 128;
                xC = (char) x2;
                codigo = codigo + xC;
            }
           
            if(codigo.equals(claveusuario)){
                 Inicio.aliasusu = txtAlias.getText();
                  Inicio vpr = new Inicio();
                  vpr.setVisible(true);
                   dispose();
            }else{
               JOptionPane.showMessageDialog(null, "La Clave no coincide");
            intento++;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ha llegado al límite de intentos (3) ","Sin acceso",JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
       
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void combopruebaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combopruebaItemStateChanged

    }//GEN-LAST:event_combopruebaItemStateChanged

    private void combopruebaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_combopruebaPropertyChange

    }//GEN-LAST:event_combopruebaPropertyChange

    private void mRefFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mRefFuncionariosActionPerformed
        frmFunc vFunc = new frmFunc(this, true);
        vFunc.setVisible(true);
    }//GEN-LAST:event_mRefFuncionariosActionPerformed

    private void mRefCargosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mRefCargosActionPerformed
       
    }//GEN-LAST:event_mRefCargosActionPerformed

    private void mMovAsistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mMovAsistenciasActionPerformed
       
    }//GEN-LAST:event_mMovAsistenciasActionPerformed

    private void mInfCargosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mInfCargosActionPerformed
        
    }//GEN-LAST:event_mInfCargosActionPerformed

    private void mInfFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mInfFuncionariosActionPerformed
        repFiltrado vrepFuncionarios = new repFiltrado("repFuncionarios", "Informe de Funcionarios");
        vrepFuncionarios.setVisible(true);
    }//GEN-LAST:event_mInfFuncionariosActionPerformed

    private void mCerSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCerSalirActionPerformed
       // System.exit(0);
        dispose();
        Acceso vlogin = new Acceso();
        vlogin.setVisible(true);
    }//GEN-LAST:event_mCerSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acceso().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame Principal;
    private javax.swing.JLabel Usuario;
    private javax.swing.JLabel Usuario1;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem mCerSalir;
    private javax.swing.JMenu mCerrar;
    private javax.swing.JMenu mDatosReferenciales;
    private javax.swing.JMenuItem mInfAsistencias;
    private javax.swing.JMenuItem mInfCargos;
    private javax.swing.JMenuItem mInfFuncionarios;
    private javax.swing.JMenu mInformes;
    private javax.swing.JMenuItem mMovAsistencias;
    private javax.swing.JMenu mMovimientos;
    private javax.swing.JMenuItem mRefCargos;
    private javax.swing.JMenuItem mRefFuncionarios;
    private javax.swing.JMenuBar menuprincipal;
    private javax.swing.JTextField txtAlias;
    private javax.swing.JTextField txtFuncionario;
    private javax.swing.JPasswordField txtcontraseña;
    // End of variables declaration//GEN-END:variables

}