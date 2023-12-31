/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui.MantenimientoForms;

import Logger.EmpleadoLog;
import Model.Empleado;
import Model.Usuario;
import dao.Conexion;
import dao.UsuarioDao;
import dao.Utilitarios;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author clide
 */
public class MntUsuarios extends javax.swing.JPanel {

    /**
     * Creates new form MntUsuarios
     */
    
    Conexion cnx = new Conexion();
    Connection cn = cnx.getCn();
    Boolean editMode = false;
    UsuarioDao usuDao = new UsuarioDao();
    EmpleadoLog empLog = new EmpleadoLog();
    Utilitarios utilitarios = new Utilitarios();
    public MntUsuarios() {
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

        Container = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtCodEmp = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtApellidosUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCodUser = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        dcFecRegistro = new com.toedter.calendar.JDateChooser();
        lblClaveUsr = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cboPerfilUsuario = new javax.swing.JComboBox<>();
        txtPasword = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        cboEstadoUsuario = new javax.swing.JComboBox<>();
        btnEditar = new javax.swing.JToggleButton();
        btnGuardar = new javax.swing.JToggleButton();
        btnAgregarUsuario = new javax.swing.JToggleButton();
        btnEliminar = new javax.swing.JToggleButton();
        btnCancelar = new javax.swing.JToggleButton();
        Foto_Container = new javax.swing.JPanel();
        lblFotoUsr = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();

        addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                formAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos De Usuario"));

        jLabel1.setText("Codigo de Empleado :");

        txtNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreUsuarioActionPerformed(evt);
            }
        });
        txtNombreUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreUsuarioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreUsuarioKeyTyped(evt);
            }
        });

        jLabel2.setText("Nombres:");

        txtApellidosUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApellidosUsuarioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosUsuarioKeyTyped(evt);
            }
        });

        jLabel3.setText("Apellidos:");

        jLabel6.setText("Fecha de Registro:");

        txtCodUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodUserActionPerformed(evt);
            }
        });
        txtCodUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodUserKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodUserKeyTyped(evt);
            }
        });

        jLabel8.setText("Codigo de Usuario:");

        dcFecRegistro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dcFecRegistroKeyPressed(evt);
            }
        });

        lblClaveUsr.setText("Clave de Usuario:");

        jLabel18.setText("Estado de Usuario:");

        cboPerfilUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtPasword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaswordActionPerformed(evt);
            }
        });
        txtPasword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPaswordKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaswordKeyTyped(evt);
            }
        });

        jLabel20.setText("Perfil de Usuario:");

        cboEstadoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3))
                    .addComponent(jLabel1)
                    .addComponent(jLabel8)
                    .addComponent(lblClaveUsr)
                    .addComponent(jLabel18)
                    .addComponent(jLabel6)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboPerfilUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCodUser)
                    .addComponent(dcFecRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(txtCodEmp)
                    .addComponent(txtNombreUsuario)
                    .addComponent(txtApellidosUsuario)
                    .addComponent(txtPasword)
                    .addComponent(cboEstadoUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidosUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClaveUsr)
                    .addComponent(txtPasword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(cboPerfilUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(dcFecRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(cboEstadoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        btnEditar.setText("Editar Privilegios");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnAgregarUsuario.setText("Agregar Usuario");
        btnAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarUsuarioActionPerformed(evt);
            }
        });

        btnEliminar.setText("Quitar Usuario");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        Foto_Container.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Foto de Usuario"));

        javax.swing.GroupLayout Foto_ContainerLayout = new javax.swing.GroupLayout(Foto_Container);
        Foto_Container.setLayout(Foto_ContainerLayout);
        Foto_ContainerLayout.setHorizontalGroup(
            Foto_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFotoUsr, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
        );
        Foto_ContainerLayout.setVerticalGroup(
            Foto_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Foto_ContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFotoUsr, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblUsuarios.setAutoResizeMode(0);
        tblUsuarios.setAutoscrolls(false);
        tblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsuarios);

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(Foto_Container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(252, 252, 252)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1090, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 191, Short.MAX_VALUE))
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Foto_Container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addComponent(btnAgregarUsuario)
                        .addGap(35, 35, 35)
                        .addComponent(btnCancelar))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar)
                    .addComponent(btnGuardar))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreUsuarioActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtNombreUsuarioActionPerformed

    private void txtNombreUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreUsuarioKeyPressed
        // TODO add your handling code here:
        utilitarios.Cambiar_Cursor(evt, txtApellidosUsuario);

    }//GEN-LAST:event_txtNombreUsuarioKeyPressed

    private void txtNombreUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreUsuarioKeyTyped

    }//GEN-LAST:event_txtNombreUsuarioKeyTyped

    private void txtApellidosUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosUsuarioKeyPressed

    }//GEN-LAST:event_txtApellidosUsuarioKeyPressed

    private void txtApellidosUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosUsuarioKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosUsuarioKeyTyped

    private void txtCodUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodUserActionPerformed

    private void txtCodUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodUserKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodUserKeyPressed

    private void txtCodUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodUserKeyTyped

    }//GEN-LAST:event_txtCodUserKeyTyped

    private void dcFecRegistroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dcFecRegistroKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_dcFecRegistroKeyPressed

    private void txtPaswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaswordActionPerformed

    private void txtPaswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaswordKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaswordKeyPressed

    private void txtPaswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaswordKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaswordKeyTyped

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        if(!"".equals(txtCodEmp.getText())){
            botones(false);
            campos(true);
            this.btnGuardar.setText("Actualizar");
            editMode = true;
        }else{
            JOptionPane.showMessageDialog(null, "No se ha seleccionado un usuario");
        }

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(!editMode){
            if( usuDao.agregarUsr(txtCodEmp.getText(),
                txtCodUser.getText(),
                txtPasword.getText(),
                cboPerfilUsuario.getSelectedItem().toString(),
                this.dcFecRegistro.getDate(),
                cboEstadoUsuario.getSelectedItem().toString()
            )
        ){
            JOptionPane.showMessageDialog(null,"Usuario  Agregado con exito");
            campos(false);
            botones(true);
            limpiarCampos();
            tblUsuarios.setModel(usuDao.crearMdlUsuario());
        }else{
            JOptionPane.showMessageDialog(null, "Registro No agregado","",0);
            campos(false);
            botones(true);
            limpiarCampos();
        }
        }else{
            if(usuDao.actualizarUsuario(this.txtCodEmp.getText(),
                this.txtCodUser.getText(),
                this.txtPasword.getText(),
                this.cboPerfilUsuario.getSelectedItem().toString(),
                this.cboEstadoUsuario.getSelectedItem().toString() )
        ){
            JOptionPane.showMessageDialog(null,"Usuario Actualizado con exito");
        }else{
            JOptionPane.showMessageDialog(null, "Registro No Actualizado","",0);
        }

        tblUsuarios.setModel(usuDao.crearMdlUsuario());
        //ajustarColumnas(tblUsuarios,19,130);
        editMode = false;
        campos(false);
        botones(true);
        limpiarCampos();
        btnGuardar.setText("Guardar");
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarUsuarioActionPerformed
        // TODO add your handling code here:

        String codigo = JOptionPane.showInputDialog(null,"Ingrese Codigo del Empleado");
        Empleado emp = empLog.buscarEmp(codigo);
        if(emp != null){
            if(empLog.contratoVigenteEmp(codigo)){
                Usuario usu = usuDao.crearUsuario(codigo);
                if(usu != null){
                    JOptionPane.showMessageDialog(  null ,"El empleado ya tiene una cuenta de Usuario" , "Proyecto", 0);
                }else{
                    JOptionPane.showMessageDialog(  null , "Registro Encontrado", "Proyecto", 3);
                    limpiarCampos();
                    cargarVistaNuevoUsuario(emp);
                    editMode = false;
                    botones(false);
                    campos(true);
                }
            }else{
                JOptionPane.showMessageDialog(  null ,"El empleado: " + codigo + "No tiene un contrato Activo\n Para crear un nuevo contrato vaya a Mantenimeinto>Contrato de empleado", "Proyecto", 0);
            }

        }else{
            JOptionPane.showMessageDialog(  null , "No se ha encontrado en el registro, \n Para registrar un nuevo empleado vaye a Mantenimiento > Empleados", "Proyecto", 0);
        }

    }//GEN-LAST:event_btnAgregarUsuarioActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        int selected = tblUsuarios.getSelectedRow();
        if(selected != -1){
            String codEmp = tblUsuarios.getValueAt(selected,0).toString();
            if(usuDao.eliminarUsuario(codEmp)){
                JOptionPane.showMessageDialog(null,"Se ha eliminado la cuenta de usuario");
                tblUsuarios.setModel(usuDao.crearMdlUsuario());
                limpiarCampos();
            }else{
                JOptionPane.showMessageDialog(null, "Registro de empleado no encontrado");
            }
        }else{

        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        if(!editMode){
            limpiarCampos();
            botones(true);
            campos(false);
        }else{
            int Rpta = 0;
            Rpta = JOptionPane.showConfirmDialog(null,"SEGURO QUE DESEA SALIR?, LA CREACION DE USUARIO NO SE HA COMPLETADO","Mensaje al usuario",
                JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(Rpta==0){
                limpiarCampos();
                botones(true);
                campos(false);
                editMode = false;
            }
        }

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tblUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuariosMouseClicked
        // TODO add your handling code here:
        if(!editMode){
            int selected = tblUsuarios.getSelectedRow();
            String codEmp = tblUsuarios.getValueAt(selected, 0).toString();

            Usuario usr = usuDao.crearUsuario(codEmp);
            System.out.println(usr.getCodEmp());
            limpiarCampos();
            cargarVista(usr);
        }else{
            JOptionPane.showMessageDialog(null,"Tiene Datos que aun no ha guardado");
        }
    }//GEN-LAST:event_tblUsuariosMouseClicked

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
        // TODO add your handling code here:
        tblUsuarios.setModel(usuDao.crearMdlUsuario());
        
        this.limpiarCampos();
        botones(true);
        campos(false);
    }//GEN-LAST:event_formAncestorAdded
    
    
    
    void cargarVista(Usuario usr){
       txtCodEmp.setText(usr.getCodEmp());
       txtNombreUsuario.setText(usr.getNombres());
       txtApellidosUsuario.setText(usr.getApellidos());
       txtCodUser.setText(usr.getNumDoc());
       cboPerfilUsuario.setSelectedItem(usr.getRol());
       dcFecRegistro.setDate(usr.getFecReg());
       cboEstadoUsuario.setSelectedItem(usr.getEstadoUsuario());
        cargarFoto(usr.getFoto());
       
    }
    
    public void limpiarCampos(){
       txtCodEmp.setText("");
       txtNombreUsuario.setText("");
       txtApellidosUsuario.setText("");
       txtCodUser.setText("");
       txtPasword.setText("");
       cboPerfilUsuario.removeAllItems();
       cboPerfilUsuario.addItem("<SELECCIONE>");
       cboPerfilUsuario.addItem("Administrativo");
       cboPerfilUsuario.addItem("Mantenimiento");
       cboPerfilUsuario.addItem("Trabajador");
       cboPerfilUsuario.addItem("Invitado");
       
       dcFecRegistro.setDate(null);
       
       cboEstadoUsuario.removeAllItems();
       cboEstadoUsuario.addItem("<SELECCIONE>");
       cboEstadoUsuario.addItem("Inactivo");
       cboEstadoUsuario.addItem("Activo");
       this.lblFotoUsr.setIcon(null);
    }
    void cargarVistaNuevoUsuario(Empleado emp){
       txtCodEmp.setText(emp.getCod());
       txtNombreUsuario.setText(emp.getNombre());
       txtApellidosUsuario.setText(emp.getApellidos());
       txtCodUser.setText(emp.getNumDoc());
       txtPasword.setText(emp.getNumDoc());
       cboEstadoUsuario.removeAllItems();
       cboPerfilUsuario.addItem("<SELECCIONE>");
       cboPerfilUsuario.addItem("Administrativo");
       cboPerfilUsuario.addItem("Mantenimiento");
       cboPerfilUsuario.addItem("Trabajador");
       cboPerfilUsuario.addItem("Invitado");
       Date now = new Date();
       // para formatear fecha: SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
       dcFecRegistro.setDate(now);
       cboEstadoUsuario.addItem("<SELECCIONE>");
       cboEstadoUsuario.addItem("Inactivo");
       cboEstadoUsuario.addItem("Activo");
        
    }
    public void botones(boolean b){
        btnAgregarUsuario.setEnabled(b);
        btnGuardar.setEnabled(!b);
        btnCancelar.setEnabled(!b);
        btnEliminar.setEnabled(b);
        btnEditar.setEnabled(b);
    }
    
    public void campos(boolean b){
       txtCodEmp.setEnabled(false);
       txtNombreUsuario.setEnabled(false);
       txtApellidosUsuario.setEnabled(false);
       dcFecRegistro.setEnabled(false);
       txtCodUser.setEnabled(false);
       txtPasword.setEnabled(b);
       cboPerfilUsuario.setEnabled(b);
       cboEstadoUsuario.setEnabled(b);
    }

    public void cargarCombo( JComboBox combo , String tbl, String dboCol) {
        combo.removeAllItems();
        combo.addItem("<SELECCIONE>");
        
        try{
           String sql = "select " + dboCol +  " from " + tbl;
           Statement st = cn.createStatement();
           ResultSet rs = st.executeQuery(sql);
           while(rs.next()){
               combo.addItem(rs.getString(1));
           }
        }catch(SQLException Error ){
             JOptionPane.showMessageDialog(null, "Error en Cargar Combo"+Error.getMessage(),"None",
                                            JOptionPane.ERROR_MESSAGE);
        }

    }
    

    void cargarFoto(byte[] bytesArr){
        try {
            
            if(bytesArr != null){

                InputStream is = new ByteArrayInputStream(bytesArr);
                BufferedImage img = ImageIO.read(is);
                File archivo = new File("img.jpg");

                ImageIO.write(img, "jpg",archivo);

                ImageIcon imagen = new ImageIcon(archivo.getAbsolutePath());
                Icon icoImg = new ImageIcon(imagen.getImage().getScaledInstance(lblFotoUsr.getWidth(),lblFotoUsr.getHeight(), Image.SCALE_SMOOTH));
                lblFotoUsr.setIcon(icoImg);
            }else{
                
            }
            
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error garrafal " + e.getMessage()+  e.getStackTrace());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    private javax.swing.JPanel Foto_Container;
    private javax.swing.JToggleButton btnAgregarUsuario;
    private javax.swing.JToggleButton btnCancelar;
    private javax.swing.JToggleButton btnEditar;
    private javax.swing.JToggleButton btnEliminar;
    private javax.swing.JToggleButton btnGuardar;
    private javax.swing.JComboBox<String> cboEstadoUsuario;
    private javax.swing.JComboBox<String> cboPerfilUsuario;
    private com.toedter.calendar.JDateChooser dcFecRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblClaveUsr;
    private javax.swing.JLabel lblFotoUsr;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtApellidosUsuario;
    private javax.swing.JTextField txtCodEmp;
    private javax.swing.JTextField txtCodUser;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JTextField txtPasword;
    // End of variables declaration//GEN-END:variables
}
