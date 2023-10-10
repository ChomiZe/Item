/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;
import item.conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Chotra
 */
public class frmUsuarios extends javax.swing.JDialog {
    conexion conex;
    Statement ejecutar;
    ResultSet resultado;
    String sentencia;
    char operacion;
    DefaultTableModel tabla = new DefaultTableModel();    

    /**
     * Creates new form frmUsuarios
     */
    public frmUsuarios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        try {
            ejecutar = conex.getConexion().createStatement();
             btnAgregar.grabFocus();
            cargarUsuario();
            mostrarUsuario();
        } catch (SQLException ex) {
            Logger.getLogger(frmUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
          modoEdicion(false);
        this.setLocationRelativeTo(null);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        txtseguridad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtAlias = new javax.swing.JTextField();
        txtClave = new javax.swing.JTextField();
        comboFun = new javax.swing.JComboBox();
        chkActivo = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        txtCodSeguridad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("REGISTRO DE USUARIOS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText(" Funcionario->");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("BUSCAR->");

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre,Apellido", "Alias"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaUsuarios.getTableHeader().setReorderingAllowed(false);
        tablaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaUsuarios);
        tablaUsuarios.getColumnModel().getColumn(0).setMinWidth(50);
        tablaUsuarios.getColumnModel().getColumn(0).setMaxWidth(50);
        tablaUsuarios.getColumnModel().getColumn(1).setMinWidth(150);
        tablaUsuarios.getColumnModel().getColumn(1).setMaxWidth(150);
        tablaUsuarios.getColumnModel().getColumn(2).setMinWidth(80);
        tablaUsuarios.getColumnModel().getColumn(2).setMaxWidth(80);

        btnAgregar.setIcon(new javax.swing.ImageIcon("D:\\NetBeansProjects\\ITEM\\Button Icon\\1378826392_add_list.png")); // NOI18N
        btnAgregar.setText("Añadir");
        btnAgregar.setToolTipText("click para agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon("D:\\NetBeansProjects\\ITEM\\Button Icon\\1378826531_save_as.png")); // NOI18N
        btnGuardar.setText("Aceptar");
        btnGuardar.setToolTipText("click para guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon("D:\\NetBeansProjects\\ITEM\\Button Icon\\1378826616_cancel.png")); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("click para cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon("D:\\NetBeansProjects\\ITEM\\Button Icon\\1378826672_edit.png")); // NOI18N
        btnModificar.setText("Editar");
        btnModificar.setToolTipText("click para modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon("D:\\NetBeansProjects\\ITEM\\Button Icon\\1378826847_gem_cancel_2.png")); // NOI18N
        btnEliminar.setText("Suprimir");
        btnEliminar.setToolTipText("click para eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCerrar.setIcon(new javax.swing.ImageIcon("D:\\NetBeansProjects\\ITEM\\Button Icon\\1378826965_sign-out.png")); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.setToolTipText("click para cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        txtseguridad.setEditable(false);
        txtseguridad.setFocusable(false);
        txtseguridad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtseguridadKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Alias->");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("Clave Acceso->");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("Ingrese Codigo de seguridad->");

        txtAlias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAliasActionPerformed(evt);
            }
        });

        comboFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFunActionPerformed(evt);
            }
        });
        comboFun.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboFunKeyPressed(evt);
            }
        });

        chkActivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                chkActivoKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Activo->");

        txtCodSeguridad.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtCodSeguridadCaretUpdate(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon("D:\\NetBeansProjects\\ITEM\\Button Icon\\ubicaciones.png")); // NOI18N
        jLabel9.setText("jLabel4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel6))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(21, 21, 21)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(comboFun, 0, 150, Short.MAX_VALUE)
                                .addComponent(txtClave)
                                .addComponent(txtAlias))
                            .addGap(243, 243, 243)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtseguridad, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(chkActivo))
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtCodSeguridad, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(btnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnGuardar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCancelar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnModificar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnEliminar))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(btnCerrar)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtseguridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtAlias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodSeguridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(chkActivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        char car = evt.getKeyChar();
        if((car < 'a' || car > 'z')){
            evt.consume();
        }
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void tablaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaUsuariosMouseClicked
        cargarCuadros();
    }//GEN-LAST:event_tablaUsuariosMouseClicked

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        accionAgregar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        accionGuardar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        accionCancelar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        accionModificar(); // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        accionEliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtseguridadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtseguridadKeyTyped
//        char car = evt.getKeyChar();
//        if((car < '0' || car > '9')){
//            evt.consume();
//        }
    }//GEN-LAST:event_txtseguridadKeyTyped

    private void txtAliasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAliasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAliasActionPerformed

    private void comboFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboFunActionPerformed

    private void chkActivoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_chkActivoKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txtCodSeguridad.grabFocus();
        }
    }//GEN-LAST:event_chkActivoKeyPressed

    private void comboFunKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboFunKeyPressed
      if (evt.getKeyCode() == evt.VK_ENTER) {
            txtAlias.grabFocus();
      }
    }//GEN-LAST:event_comboFunKeyPressed

    private void txtCodSeguridadCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtCodSeguridadCaretUpdate
       buscarUsuario();
    }//GEN-LAST:event_txtCodSeguridadCaretUpdate

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
            java.util.logging.Logger.getLogger(frmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmUsuarios dialog = new frmUsuarios(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JCheckBox chkActivo;
    private javax.swing.JComboBox comboFun;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaUsuarios;
    private javax.swing.JTextField txtAlias;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtCodSeguridad;
    private javax.swing.JTextField txtseguridad;
    // End of variables declaration//GEN-END:variables

    private void modoEdicion(boolean vL) {
        comboFun.setEnabled(vL);
        txtAlias.setEnabled(vL);
        txtClave.setEnabled(vL);
        chkActivo.setEnabled(vL);
        txtCodSeguridad.setEnabled(vL);
        //botones
        btnAgregar.setEnabled(!vL);
        btnGuardar.setEnabled(vL);
        btnCancelar.setEnabled(vL);
        btnModificar.setEnabled(!vL);
        btnEliminar.setEnabled(!vL);
        btnCerrar.setEnabled(!vL);

        tablaUsuarios.setEnabled(!vL);
    }

    private void cargarUsuario() {
        sentencia = " SELECT * FROM funcionarios";
        try {
            resultado = ejecutar.executeQuery(sentencia);
             while (resultado.next()) {
                comboFun.addItem(resultado.getString(1)+"- "+ resultado.getString(2).toUpperCase());
             }
        } catch (SQLException ex) {
            Logger.getLogger(frmUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void accionAgregar() {
        limpiarCuadros();
        sentencia = "SELECT MAX(idfuncionarios) FROM usuario";
        try {
            resultado = ejecutar.executeQuery(sentencia);
             resultado.first();
            modoEdicion(true);
            operacion = 'A';
            GenerarCodigo();
            txtAlias.grabFocus();
        } catch (SQLException ex) {
            Logger.getLogger(frmUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void limpiarCuadros() {
        txtAlias.setText(null);
        txtClave.setText(null);
        txtBuscar.setText(null);
        txtCodSeguridad.setText(null);
        chkActivo.setText(null);
    }

    private void GenerarCodigo() {
        String xcon = "";
        int r1;
        String cadena = "abcdefghijklmnopqrABCDEFGHIJKLMNO1234567890";
        for (int e = 0; e< 4; e++ ){
            Random w = new Random();
            int rd = w.nextInt(42);
            char xk = cadena.charAt(rd);
            r1 = (int) xk;
            xcon = xcon + xk;
            this.txtseguridad.setText(xcon);
            
        }
    }

    private void accionGuardar() {
        String fu = comboFun.getSelectedItem().toString();
        int pos = fu.indexOf("-");
        String v1 = fu.substring(0, pos);
        String v2 = txtAlias.getText();
        int x1, x2;
        
          String cadena, v3 = "";
        cadena = txtClave.getText();
        
       for (int i = 0; i < cadena.length(); i++) {
            char xC = cadena.charAt(i);
            x1 = (int) xC;
            x2 = x1 + 128;
            xC = (char) x2;
            v3 = v3 + xC;
        }
         int v4;
        if (chkActivo.isSelected()) {
            v4 = 0;
        } else {
            v4 = 1;
        }
        if (v2.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el Alias","Cuadro vacio", JOptionPane.ERROR_MESSAGE);
            txtAlias.grabFocus();
        } else {
            if (txtClave.getText().length() <6) {
                JOptionPane.showMessageDialog(this, "Debe ingresar mas de 6 caracter",
                        "Poco caracter", JOptionPane.ERROR_MESSAGE);
                txtClave.grabFocus();
            } else {
                if (txtseguridad.getText().equals(txtCodSeguridad.getText())) {
                    if (operacion == 'A') {
                        sentencia = "INSERT INTO usuario VALUES('"+v1+"','"+v2+"','"+v4+"','"+v3+"')";
                    
                    }
                    if (operacion == 'M') {
                        sentencia = "UPDATE usuario SET alias='"+v1+"',clave='"+v2+"',usuActivo='"+v4+"'WHERE idfuncionario='"+v3+"'";
                    }
                     try {
                        ejecutar.executeUpdate(sentencia);
                        limpiarCuadros();
                        modoEdicion(false);
                    } catch (SQLException ex) {
                        //Logger.getLogger(frmUsuario.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(this, sentencia+"  \nNo se guardo nada"+ex);
                    }
                    mostrarUsuario();
                } else {
                    JOptionPane.showMessageDialog(null, "Es diferente el Codigo");
                    txtCodSeguridad.setText(null);
                    txtCodSeguridad.grabFocus();
                    //            limpiarCuadros();
                    GenerarCodigo();
                    modoEdicion(false);
                }
            }
        }
    }

    private void mostrarUsuario() {
        tabla.setRowCount(0);
        tabla = (DefaultTableModel) tablaUsuarios.getModel();
        sentencia = "SELECT * FROM vistaUsuarios";
        try {
            resultado = ejecutar.executeQuery(sentencia);
            while (resultado.next()) {
                Object fila[] = new Object[3];
                fila[0] = resultado.getString(1);
                fila[1] = resultado.getString(2);
                fila[2] = resultado.getString(3);
                
               tabla.addRow(fila);
            }
            tablaUsuarios.setModel(tabla);
        } catch (SQLException ex) {
            Logger.getLogger(frmUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void accionCancelar() {
        modoEdicion(false);
    }

    private void cargarCuadros() {
       int fSel = tablaUsuarios.getSelectedRow();
        if (fSel >= 0) {
            String xid = tablaUsuarios.getValueAt(fSel, 2).toString();
            sentencia = "SELECT * FROM vistausuarios WHERE idfuncionarios='"+xid+"'"; 
        }
            try {
                resultado = ejecutar.executeQuery(sentencia);
                 resultado.first();
                String xc = resultado.getString(1)+"- "+resultado.getString(2).toUpperCase();
                comboFun.setSelectedItem(xc);
                txtAlias.setText(resultado.getString(2));
                String codigo = resultado.getString(3);
                String codigo1 = "";
                int x1;
                for (int i = 0; i < codigo.length(); i++) {
                    char xC = codigo.charAt(i);
                    x1 = ((int) xC - 128);
                    codigo1 = codigo1 + (char) x1;
                }
                txtClave.setText(codigo1);
                chkActivo.setSelected(true);
            } catch (SQLException ex) {
              Logger.getLogger(frmUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
            mostrarUsuario();
    }

    

    private void accionEliminar() {
         int fSel = tablaUsuarios.getSelectedRow();
        if (fSel >= 0) {
            String xid = tablaUsuarios.getValueAt(fSel, 0).toString();
            String xal = tablaUsuarios.getValueAt(fSel, 1).toString();
            int resp = JOptionPane.showConfirmDialog(this,
                    "Confirma que desea eliminar el Usuario " + xal.toUpperCase()
                    + " del Sistema?", "Confirme...", JOptionPane.YES_NO_OPTION);
            if (resp == JOptionPane.YES_OPTION) {
                sentencia = "DELETE FROM usuario WHERE idfuncionarios='"+xid+"'";
                try {
                    ejecutar.executeUpdate(sentencia);
                    mostrarUsuario();
                } catch (SQLException ex) {
                    Logger.getLogger(frmUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }
}

    private void accionModificar() {
         if (tablaUsuarios.getSelectedRow() >= 0) {
            operacion = 'M';
            modoEdicion(true);
            txtAlias.grabFocus();
        } else {
            JOptionPane.showMessageDialog(this, "No se ha seleccionado registro", "Seleccione...",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void buscarUsuario() {
        
         tabla.setRowCount(0);
     String criterio = txtBuscar.getText();
     sentencia = "SELECT * FROM vistausuarios WHERE NombreApellido LIKE'%"+criterio+"%'";
        try {
            resultado = ejecutar.executeQuery(sentencia);
            while (resultado.next()) {
                Object fila[] = new Object[3];
                fila[0] = resultado.getInt(1);
                fila[1] = resultado.getString(2);
                fila[2] = resultado.getBoolean(3);
           
                tabla.addRow(fila);
            }
            tablaUsuarios.setModel(tabla);
        } catch (SQLException ex) {
            Logger.getLogger(frmUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }
    }