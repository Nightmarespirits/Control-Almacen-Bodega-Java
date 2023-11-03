/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author clide
 */
public class AlmacenDao {
    Conexion cnx = new Conexion();
    Connection cn = cnx.getCn();
    
    public DefaultTableModel crearMdlAlmacen(){
        DefaultTableModel mdl = new DefaultTableModel();
        try {
            String sql = "SELECT  dbo.Tb_Sucursal.Sucursal, dbo.Tb_Producto.Producto, dbo.Tb_Producto_Marca.Descripcion_Producto, dbo.Tb_Marca.Marca, dbo.Tb_Categoria.Categoria, dbo.Tb_Almacen.Stock_Cajas, dbo.Tb_Almacen.Stock_Unidades\n" +
                        "FROM dbo.Tb_Producto INNER JOIN\n" +
                        "dbo.Tb_Categoria ON dbo.Tb_Producto.CodCategoria = dbo.Tb_Categoria.CodCategoria INNER JOIN\n" +
                        "dbo.Tb_Producto_Marca ON dbo.Tb_Producto.CodProducto = dbo.Tb_Producto_Marca.CodProducto INNER JOIN\n" +
                        "dbo.Tb_Marca ON dbo.Tb_Producto_Marca.CodMarca = dbo.Tb_Marca.CodMarca INNER JOIN\n" +
                        "dbo.Tb_Almacen ON dbo.Tb_Producto_Marca.CodRegistro = dbo.Tb_Almacen.CodRegistro INNER JOIN\n" +
                        "dbo.Tb_Sucursal ON dbo.Tb_Almacen.CodSucursal = dbo.Tb_Sucursal.CodSucursal";
            
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            mdl.addColumn("Sucursal");
            mdl.addColumn("Producto");
            mdl.addColumn("Descripcion de Producto");
            mdl.addColumn("Marca");
            mdl.addColumn("Categoria");
            mdl.addColumn("Stock Cajas");
            mdl.addColumn("Stock Unidades");
            while(rs.next()){
                Object data[] = {
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getInt(6),
                    rs.getInt(7),
                    
                    
                };
                mdl.addRow(data);
            }
        } catch (Exception e) {
        }
        return mdl;
    }
}
