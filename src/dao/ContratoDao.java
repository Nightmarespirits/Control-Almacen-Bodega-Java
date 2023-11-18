/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Model.Contrato;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author clide
 */
public class ContratoDao {
    Conexion cnx = new Conexion();
    Connection cn = cnx.getCn();
    public DefaultTableModel crearMdlContrato(){
        DefaultTableModel mdl = new DefaultTableModel();
        try {
            String sql = "SELECT        dbo.Tb_Contratacion_Empleado.CodEmpleado, dbo.Tb_Contratacion_Empleado.NumContrato, dbo.Tb_Empleado.Nombres, dbo.Tb_Empleado.Apellidos, dbo.Tb_Contratacion_Empleado.Fec_Inicio_Contrato, \n" +
                        "dbo.Tb_Contratacion_Empleado.Fec_Term_Contrato, dbo.Tb_Area.Area, dbo.Tb_Cargo.Cargo, dbo.Tb_Sucursal.Sucursal, dbo.Tb_Contratacion_Empleado.Estado_Contrato, dbo.Tb_Contratacion_Empleado.Sueldo, \n" +
                        "dbo.Tb_Contratacion_Empleado.ObsEstado_Contrato\n" +
                        "FROM            dbo.Tb_Contratacion_Empleado INNER JOIN\n" +
                        "dbo.Tb_Area ON dbo.Tb_Contratacion_Empleado.CodArea = dbo.Tb_Area.CodArea INNER JOIN\n" +
                        "dbo.Tb_Cargo ON dbo.Tb_Contratacion_Empleado.CodCargo = dbo.Tb_Cargo.CodCargo INNER JOIN\n" +
                        "dbo.Tb_Empleado ON dbo.Tb_Contratacion_Empleado.CodEmpleado = dbo.Tb_Empleado.CodEmpleado INNER JOIN\n" +
                        "dbo.Tb_Sucursal ON dbo.Tb_Contratacion_Empleado.CodSucursal = dbo.Tb_Sucursal.CodSucursal";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            mdl.addColumn("Codigo de Empleado");
            mdl.addColumn("Número de Contrato");
            mdl.addColumn("Nombres");
            mdl.addColumn("Apellidos");
            mdl.addColumn("Fecha de Inicio");
            mdl.addColumn("Fecha de Termino");
            mdl.addColumn("Área");
            mdl.addColumn("Cargo");
            mdl.addColumn("Sucursal");
            mdl.addColumn("Estado de Contrato");
            mdl.addColumn("Sueldo");
            mdl.addColumn("Observaciones");
            
            while(rs.next()){
                Object data[] = {
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getDate(5),
                    rs.getDate(6),
                    rs.getString(7),
                    rs.getString(8),
                    rs.getString(9),
                    rs.getString(10),
                    rs.getInt(11),
                    rs.getString(12),
                };
                mdl.addRow(data);
            }
            
            
        } catch (SQLException e) {
            System.out.println("Error en cargar modelo de tabla contrato" + e.getMessage());
        }
        
        return mdl;
    }
    
    public Contrato crearContrato( String codEmp){
        Contrato contrat = null;
        try {
            String sql = "SELECT dbo.Tb_Contratacion_Empleado.CodEmpleado, dbo.Tb_Contratacion_Empleado.NumContrato, dbo.Tb_Empleado.Nombres, dbo.Tb_Empleado.Apellidos, dbo.Tb_Contratacion_Empleado.Fec_Inicio_Contrato, \n" +
                        "dbo.Tb_Contratacion_Empleado.Fec_Term_Contrato, dbo.Tb_Area.Area, dbo.Tb_Cargo.Cargo, dbo.Tb_Sucursal.Sucursal, dbo.Tb_Contratacion_Empleado.Estado_Contrato, dbo.Tb_Contratacion_Empleado.Sueldo, \n" +
                        "dbo.Tb_Contratacion_Empleado.ObsEstado_Contrato, dbo.Tb_Empleado.Foto\n" +
                        "FROM dbo.Tb_Contratacion_Empleado INNER JOIN\n" +
                        "dbo.Tb_Area ON dbo.Tb_Contratacion_Empleado.CodArea = dbo.Tb_Area.CodArea INNER JOIN\n" +
                        "dbo.Tb_Cargo ON dbo.Tb_Contratacion_Empleado.CodCargo = dbo.Tb_Cargo.CodCargo INNER JOIN\n" +
                        "dbo.Tb_Empleado ON dbo.Tb_Contratacion_Empleado.CodEmpleado = dbo.Tb_Empleado.CodEmpleado INNER JOIN\n" +
                        "dbo.Tb_Sucursal ON dbo.Tb_Contratacion_Empleado.CodSucursal = dbo.Tb_Sucursal.CodSucursal\n" +
                        "where dbo.Tb_Contratacion_Empleado.CodEmpleado = '" + codEmp +"'";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                contrat = new Contrato(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getDate(5),
                        rs.getDate(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getInt(11),
                        rs.getString(12),
                        rs.getBytes(13)
                
                );
            }
        } catch (SQLException e) {
            System.out.println("Error en crear contrato dao " +e.getMessage() + e.getStackTrace() + e.getCause());
        }
        
        return contrat;
    }
    
    public Boolean agregarContrato(String numContrato, String codEmp,Date fecInic, Date fecFin, String sucursal,String area,String cargo, int sueldo,String estado,String obs ){
        Boolean band = false;
        try {
            CallableStatement cs = cn.prepareCall("{call usp_agregarContrato(?,?,?,?,?,?,?,?,?,?)}");
            java.sql.Date sqlFecInic = new java.sql.Date(fecInic.getTime());
            java.sql.Date sqlFecFin = new java.sql.Date(fecFin.getTime());
            cs.setString(1,numContrato );
            cs.setString(2,codEmp );
            cs.setDate(3,sqlFecInic );
            cs.setDate(4,sqlFecFin );
            cs.setString(5,sucursal );
            cs.setString(6,area );
            cs.setString(7,cargo );
            cs.setInt(8,sueldo );
            cs.setString(9,estado );
            cs.setString(10,obs );
            
            
            if(cs.executeUpdate() > 0 ){
                band = true;
            }
            
            
        } catch (SQLException e) {
            System.out.println("Error en agregar contrato: " +  e.getMessage());
        }
        
        return band;
    }
    
    public String generarNumContrato(){
        String numContrat = "";
        try {
            CallableStatement cs = cn.prepareCall("{call usp_generarNumContrato(?)}");
            cs.registerOutParameter(1, Types.VARCHAR);
            cs.executeUpdate();
            numContrat = cs.getString(1);
        } catch (SQLException e) {
            System.out.println("error en generador de codigos" + e.getMessage());
        }
        
        return numContrat;
    }
}
