/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import dao.KardexDao;
import java.awt.Component;
import java.util.LinkedList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author clide
 */
public class Kardex extends javax.swing.JPanel {

    TableRowSorter<DefaultTableModel> filtro ;
    KardexDao kardexDao = new KardexDao();
    public Kardex() {
        initComponents();
        DefaultTableModel mdl = kardexDao.crearKardexMdl();
        tblKardex.setModel(mdl);
        tblKardex.setAutoCreateRowSorter(true);
        filtro = new TableRowSorter<>(mdl);
        tblKardex.setRowSorter(filtro);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblKardex = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        checkSuc = new javax.swing.JCheckBox();
        checkRespons = new javax.swing.JCheckBox();
        txtReponsable = new javax.swing.JTextField();
        dcFecReg = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        checkMarca = new javax.swing.JCheckBox();
        txtNumOperacion = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JToggleButton();
        checkFecReg = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        txtNombreProd = new javax.swing.JTextField();
        cboTipoOperacion = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cboSucursal = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(1320, 640));
        addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                formAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        tblKardex.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblKardex);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtro De Registros"));

        checkSuc.setText("Sucursal de Almacén:");

        checkRespons.setText("Empleado Responsable:");
        checkRespons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkResponsActionPerformed(evt);
            }
        });

        txtReponsable.setText("jTextField2");
        txtReponsable.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtReponsableFocusGained(evt);
            }
        });

        dcFecReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dcFecRegMouseClicked(evt);
            }
        });

        jLabel1.setText("Numero de operación:");

        txtMarca.setText("jTextField2");
        txtMarca.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMarcaFocusGained(evt);
            }
        });

        checkMarca.setText("Marca:");
        checkMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMarcaActionPerformed(evt);
            }
        });

        txtNumOperacion.setText("numero de op");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        checkFecReg.setText("Fecha De Registro:");

        jLabel3.setText("Nombre Producto:");

        txtNombreProd.setToolTipText("Buscar por Nombre de producto, categoria, Sucursal, Responsable, Fecha de Vencimiento");
        txtNombreProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProdActionPerformed(evt);
            }
        });
        txtNombreProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreProdKeyReleased(evt);
            }
        });

        cboTipoOperacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Tipo de Operación:");

        cboSucursal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboSucursal.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboSucursalItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(checkFecReg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dcFecReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(checkSuc, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(checkRespons, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtReponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(checkMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMarca))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreProd, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboTipoOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dcFecReg, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkFecReg)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombreProd, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(cboTipoOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtNumOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(checkSuc)
                                .addComponent(cboSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(checkRespons)
                                .addComponent(txtReponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(checkMarca)
                                .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(17, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
        // TODO add your handling code here:
        limpiarCampos();
        
    }//GEN-LAST:event_formAncestorAdded

    private void checkResponsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkResponsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkResponsActionPerformed

    private void checkMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkMarcaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        evalBusqueda();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtNombreProdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreProdKeyReleased
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_txtNombreProdKeyReleased

    void evalBusqueda(){
        
        List<Object> dataArgs = new ArrayList<>();
        if(!"".equals(txtNumOperacion.getText())){
            dataArgs.add(txtNumOperacion.getText());
            dataArgs.add(0);
        }else{
            if(!"<SELECCIONE>".equals(cboTipoOperacion.getSelectedItem().toString())){
                dataArgs.add(cboTipoOperacion.getSelectedItem().toString());
                dataArgs.add(3);
            }

            if(this.checkFecReg.isSelected()){
                dataArgs.add(dcFecReg.getDate());
                dataArgs.add(1);
            }
            if(this.checkSuc.isSelected()){
                if(!"<SELECCIONE>".equals(cboSucursal.getSelectedItem().toString())){
                    dataArgs.add(cboSucursal.getSelectedItem().toString());
                    dataArgs.add(7);
                }
            }
            if(checkRespons.isSelected()){
                dataArgs.add(txtReponsable.getText());
                dataArgs.add(8);
            }
            if(!"".equals(txtNombreProd.getText())){
                dataArgs.add(txtNombreProd.getText());
                dataArgs.add(5);
            }
            if(checkMarca.isSelected()){
                dataArgs.add(txtMarca.getText());
                dataArgs.add(6);
            }
        
        }
        if (!dataArgs.isEmpty()) {
            filtrar(dataArgs.toArray());
        } else {
           JOptionPane.showMessageDialog(null,"Seleccione al menos un Item o rellene al menos un Campo \n Para realizar la busqueda");
        }

    }
    void filtrar(Object... args) {
        try {
            // Crear una lista para almacenar filtros
            LinkedList<RowFilter<Object, Object>> lista = new LinkedList<>();

            // Agregar filtros a la lista
            for (int i = 0; i < args.length; i += 2) {
                
                if (args[i] != null && args[i + 1] != null) {
                    RowFilter<Object, Object> filtroCol = RowFilter.regexFilter(args[i].toString(), (int) args[i+1]);
                    lista.add(filtroCol);
                }
            }

            // Combinar filtros usando AND
            RowFilter<Object, Object> filtroCombinado = RowFilter.andFilter(lista);

            // Aplicar el filtro a la tabla
            filtro.setRowFilter(filtroCombinado);
        } catch (Exception e) {
            System.out.println("Error al aplicar el filtro: " + e.getMessage() + e.getCause());
        }
    }
   
    
    
    private void txtNombreProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProdActionPerformed

    private void dcFecRegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dcFecRegMouseClicked
        // TODO add your handling code here:
        this.checkFecReg.setSelected(true);
    }//GEN-LAST:event_dcFecRegMouseClicked

    private void cboSucursalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboSucursalItemStateChanged
        // TODO add your handling code here:
        checkSuc.setSelected(true);
    }//GEN-LAST:event_cboSucursalItemStateChanged

    private void txtReponsableFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtReponsableFocusGained
        // TODO add your handling code here:
        checkRespons.setSelected(true);
        
    }//GEN-LAST:event_txtReponsableFocusGained

    private void txtMarcaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMarcaFocusGained
        // TODO add your handling code here:
        checkMarca.setSelected(true);
    }//GEN-LAST:event_txtMarcaFocusGained
    
    void limpiarCampos(){
      this.txtNombreProd.setText("");
      this.dcFecReg.setDate(null);
      this.cboSucursal.removeAllItems();
      this.cboSucursal.addItem("<SELECCIONE>");
      this.cboSucursal.addItem("Sucursal 01 - San Juan de Lurigancho");
      this.cboSucursal.addItem("Sucursal 02 - Puente Piedra");
      this.cboSucursal.addItem("Sucursal 03 - Villa El Salvador");
      this.txtReponsable.setText("");
      this.txtNombreProd.setText("");
      this.txtNumOperacion.setText("");
      this.txtMarca.setText("");
      this.cboTipoOperacion.removeAllItems();
      this.cboTipoOperacion.addItem("<SELECCIONE>");
      this.cboTipoOperacion.addItem("Ingreso por Compra");
      this.cboTipoOperacion.addItem("Ingreso por Préstamo");
      this.cboTipoOperacion.addItem("Ingreso por Reposición");
      this.cboTipoOperacion.addItem("Salida por Venta");
      this.cboTipoOperacion.addItem("Salida por Reposición");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnBuscar;
    private javax.swing.JComboBox<String> cboSucursal;
    private javax.swing.JComboBox<String> cboTipoOperacion;
    private javax.swing.JCheckBox checkFecReg;
    private javax.swing.JCheckBox checkMarca;
    private javax.swing.JCheckBox checkRespons;
    private javax.swing.JCheckBox checkSuc;
    private com.toedter.calendar.JDateChooser dcFecReg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblKardex;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNombreProd;
    private javax.swing.JTextField txtNumOperacion;
    private javax.swing.JTextField txtReponsable;
    // End of variables declaration//GEN-END:variables
}
