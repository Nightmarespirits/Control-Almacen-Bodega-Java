/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Model.Empleado;
import Model.Kardex;
import Model.Producto;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author clide
 */
public class KardexDao {
    Conexion cnx = new Conexion();
    Connection cn = cnx.getCn();
    
     public boolean AgregarKardex(Kardex operacion){
         
         boolean band = false;
         try {
             CallableStatement cs = cn.prepareCall("{call usp_agregarKardex(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
             
             Date sqlDateFecOp = new Date(operacion.getFecOp().getTime());
             Date sqlFecElab = new Date(operacion.getFecElab().getTime());
             Date sqlFecVen = new Date(operacion.getFecVenc().getTime());
                cs.setString(1, operacion.getNumOp());
                cs.setString(2, operacion.getEmp());
                cs.setDate(3,  sqlDateFecOp );
                cs.setString(4, operacion.getTipoComp());
                cs.setString(5, operacion.getNumSerieCom());
                cs.setString(6, operacion.getTipoOp());
                cs.setString(7, operacion.getSuc());
                cs.setString(8, operacion.getcodBarra());
                cs.setString(9, operacion.getNombreProd());
                cs.setDate(10, sqlFecElab);
                cs.setDate(11, sqlFecVen);
                cs.setInt(12, Integer.parseInt(operacion.getCant()) );
                cs.setDouble(13, Double.parseDouble(operacion.getCostoUnit()));
                cs.setDouble(14, Double.parseDouble(operacion.getCostoTotal()));
                cs.setString(15, operacion.getObs());
                
                
                
            if(cs.executeUpdate() >0){
                band = true;
            }
             
         } catch (NumberFormatException | SQLException e) {
             
             System.out.println("Error en agregar kardex" +  e.getMessage() + e.getCause());
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
     
     public String generarNumOperacion(){
         String numOp = "";
         try {
             CallableStatement cs = cn.prepareCall("{call USP_GenerarNumOp(?)}");
             cs.registerOutParameter(1, Types.VARCHAR);
             cs.executeUpdate();
             numOp = cs.getString(1);
         } catch (SQLException e) {
             System.out.println("Error en generarNUmOperacion");
         }
         return numOp;
     }
       
}
