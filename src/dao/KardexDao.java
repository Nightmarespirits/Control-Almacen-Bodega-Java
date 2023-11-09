/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Model.Empleado;
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
public class KardexDao {
    Conexion cnx = new Conexion();
    Connection cn = cnx.getCn();
    
     public boolean AgregarKardex(Producto prod, Empleado emp){
         
         boolean band = false;
         try {
             CallableStatement cs = cn.prepareCall("{call usp_AgregarKardex(?,?)}");
                cs.setString(1, prod.getNombre());
                cs.setString(2, prod.getProducto());
                cs.setString(3, prod.getMarca());
                cs.setString(4, prod.getCategoria());
                
            if(cs.executeUpdate() >0){
                band = true;
            }
             
         } catch (Exception e) {
             
             System.out.println("Error en agregar kardex");
         }
         return band;
     }
     
     //Metodo para retornar un table model karde FALTA CREAR EL INNER JOIN
     public DefaultTableModel crearKardexMdl(){
         DefaultTableModel mdl = new DefaultTableModel();
         try {
             
             //CREAR INNER JOIN AQUI
             String sql = "SELECT * FROM view_Kardex";
             Statement st = cn.createStatement();
             ResultSet rs = st.executeQuery(sql);
             
             mdl.addColumn("Numero de Operacion");
             mdl.addColumn("Fecha");
             mdl.addColumn("Hora");
             mdl.addColumn("Tipo Operación");
             mdl.addColumn("Cantidad");
             mdl.addColumn("Descripcion de Producto");
             mdl.addColumn("Marca");
             mdl.addColumn("Sucursal");
             mdl.addColumn("Encargado");
             
             while(rs.next()){
                 Object data[] = {
                     rs.getString(1),
                     rs.getString(2),
                     rs.getString(3),
                     rs.getString(4),
                     rs.getString(5),
                     rs.getString(6),
                     rs.getString(7),
                     rs.getString(8),
                     rs.getString(9)
                 };
                 
                 mdl.addRow(data);
             }
             
         } catch (SQLException e) {
             System.out.println("Error en crearKardexMdl" + e.getMessage() + e.getCause());
         }
         
         return mdl;
     }
       
}
