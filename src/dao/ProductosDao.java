/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Model.Producto;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author clide
 */
public class ProductosDao {
    Conexion cnx = new Conexion();
    Connection cn = cnx.getCn();
    
    public DefaultTableModel crearMdlProductos(){
        DefaultTableModel mdl = new DefaultTableModel();
        try {
            String sql = "SELECT dbo.Tb_Producto_Marca.CodRegistro, dbo.Tb_Categoria.Categoria, dbo.Tb_Producto.Producto, dbo.Tb_Marca.Marca, dbo.Tb_Producto_Marca.Descripcion_Producto, dbo.Tb_Producto_Marca.Presentacion, \n" +
                        "dbo.Tb_Producto_Marca.UniMed, dbo.Tb_Producto_Marca.Prec_Unitario, dbo.Tb_Producto_Marca.Prec_Caja, dbo.Tb_Producto_Marca.Prec_Venta, dbo.Tb_Producto_Marca.Prec_VentaCaja, dbo.Tb_Producto_Marca.Stock_Cajas, \n" +
                        "dbo.Tb_Producto_Marca.Stock_Unidades, dbo.Tb_Producto_Marca.Estado_ProductoMarca\n" +
                        "FROM            dbo.Tb_Categoria INNER JOIN\n" +
                        "dbo.Tb_Producto ON dbo.Tb_Categoria.CodCategoria = dbo.Tb_Producto.CodCategoria INNER JOIN\n" +
                        "dbo.Tb_Producto_Marca ON dbo.Tb_Producto.CodProducto = dbo.Tb_Producto_Marca.CodProducto INNER JOIN\n" +
                        "dbo.Tb_Marca ON dbo.Tb_Producto_Marca.CodMarca = dbo.Tb_Marca.CodMarca";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            mdl.addColumn("Codigo de Registro");
            mdl.addColumn("Categoria");
            mdl.addColumn("Producto");
            mdl.addColumn("Marca");
            mdl.addColumn("Descripción");
            mdl.addColumn("Presentación");
            mdl.addColumn("Unidad de Medida");
            mdl.addColumn("Precio Unitario");
            mdl.addColumn("Precio por Caja");
            mdl.addColumn("Precio de venta Unitario");
            mdl.addColumn("Precio de venta por caja");
            mdl.addColumn("Stock por Cajas");
            mdl.addColumn("Stock por Unidades");
            mdl.addColumn("Estado");
            while(rs.next()){
                Object data[] = {
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getDouble(8),
                    rs.getDouble(9),
                    rs.getDouble(10),
                    rs.getDouble(11),
                    rs.getInt(12),
                    rs.getInt(13),
                    rs.getString(14)
                    
                };
                mdl.addRow(data);
            }
            
        } catch (Exception e) {
            System.out.println("Error en crer modelo producto" + e.getMessage());
        }
        
        return mdl;
    }
    
    public Producto crearProducto(String codReg){
        Producto prod = null;
        try {
            String sql = "SELECT        dbo.Tb_Producto_Marca.CodRegistro, dbo.Tb_Categoria.Categoria, dbo.Tb_Producto.Producto, dbo.Tb_Marca.Marca, dbo.Tb_Producto_Marca.Descripcion_Producto, dbo.Tb_Producto_Marca.Presentacion, \n" +
"                         dbo.Tb_Producto_Marca.UniMed, dbo.Tb_Producto_Marca.Prec_Caja, dbo.Tb_Producto_Marca.Prec_Unitario, dbo.Tb_Producto_Marca.Prec_Venta, dbo.Tb_Producto_Marca.Prec_VentaCaja, dbo.Tb_Producto_Marca.Stock_Cajas, \n" +
"                         dbo.Tb_Producto_Marca.Stock_Unidades, dbo.Tb_Producto_Marca.Estado_ProductoMarca, dbo.Tb_Producto_Marca.Foto\n" +
"FROM            dbo.Tb_Categoria INNER JOIN\n" +
"                         dbo.Tb_Producto ON dbo.Tb_Categoria.CodCategoria = dbo.Tb_Producto.CodCategoria INNER JOIN\n" +
"                         dbo.Tb_Producto_Marca ON dbo.Tb_Producto.CodProducto = dbo.Tb_Producto_Marca.CodProducto INNER JOIN\n" +
"                         dbo.Tb_Marca ON dbo.Tb_Producto_Marca.CodMarca = dbo.Tb_Marca.CodMarca\n" + 
                    "where Tb_Producto_Marca.CodRegistro = "+codReg;
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                prod = new Producto(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getDouble(8),
                    rs.getDouble(9),
                    rs.getDouble(10),
                    rs.getDouble(11),
                    rs.getInt(12),
                    rs.getInt(13),
                    rs.getString(14),
                    rs.getBytes(15)
                
                );
            }
        } catch (SQLException e) {
            System.out.println("Error en crear clase poducto" + e.getMessage());
        }
        return prod;
    }
    
    public boolean agregarProducto(Producto prod){
        boolean band = false;
        try {
            CallableStatement cs = cn.prepareCall("{call usp_agregarProducto(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            cs.setInt(1, prod.getCod());
            cs.setString(2, prod.getProducto());
            cs.setString(3, prod.getMarca());
            cs.setString(4, prod.getDescripcion());
            cs.setString(5, prod.getPresentacion());
            cs.setString(6, prod.getUniMed());
            cs.setDouble(7,prod.getPrecCaja());
            cs.setDouble(8,prod.getPrecUnit());
            cs.setDouble(9,prod.getPrecVentaCaja());
            cs.setDouble(10,prod.getPrecVentaUnit());
            cs.setInt(11,prod.getStockCaja());
            cs.setInt(12, prod.getStockUnid());
            cs.setBytes(13, prod.getFoto());
            cs.setString(14,prod.getEstado());
            
            if(cs.executeUpdate() > 0){
                band = true;
            }
        } catch (SQLException e) {
           System.out.println("Error en guardar datos de productos agregarproductos metodo" + e.getMessage()); 
        }
        return band;
    }
    
    public boolean actualizarProducto(Producto prod){
        boolean band = false;
        try {
            CallableStatement cs = cn.prepareCall("{call usp_actualizarProducto(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            cs.setInt(1, prod.getCod());
            cs.setString(2, prod.getProducto());
            cs.setString(3, prod.getMarca());
            cs.setString(4, prod.getDescripcion());
            cs.setString(5, prod.getPresentacion());
            cs.setString(6, prod.getUniMed());
            cs.setDouble(7,prod.getPrecCaja());
            cs.setDouble(8,prod.getPrecUnit());
            cs.setDouble(9,prod.getPrecVentaCaja());
            cs.setDouble(10,prod.getPrecVentaUnit());
            cs.setInt(11,prod.getStockCaja());
            cs.setInt(12, prod.getStockUnid());
            cs.setBytes(13, prod.getFoto());
            cs.setString(14,prod.getEstado());
            
            if(cs.executeUpdate() > 0){
                band = true;
            }
        } catch (SQLException e) {
           System.out.println("Error en guardar datos de productos agregarproductos metodo" + e.getMessage()); 
        }
        return band;
    }
    
    public String generarCodReg(){
        String codReg = "";
        try {
               String sql = "select COUNT (*) from Tb_Producto_Marca";
               Statement st= cn.createStatement();
               ResultSet rs = st.executeQuery(sql);
               
               int tableRegCount = 0;
               while(rs.next()){
                   tableRegCount = rs.getInt(1);
               }
               
               codReg = String.valueOf(tableRegCount + 1);
               
        } catch (SQLException e) {
            System.out.println("Error en genera cod reg" + e.getMessage());
        }
        return codReg;
    }
    
     public Boolean eliminarProducto(String codReg){
        Boolean band = false;
        try {
            String sql = "delete  from Tb_Producto_Marca where codRegistro = '" + codReg +"'";
            Statement st = cn.createStatement();
            if( st.executeUpdate(sql) > 0){
                band = true;
            }
        } catch (Exception e) {
            System.out.println("Error en eliminar Producto" + e.getMessage());
        }
        return band;
    }
    
    
}
