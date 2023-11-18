/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Model.Usuario;
import dao.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class UsuarioDao {
    //declaramos una variable que instancia a la clase conexion
    Conexion cnx = new Conexion();
    
    //declaramos a una varible del tipo conection que instancia al metoo getCn de la clase conexion()
    Connection cn = cnx.getCn();
    
    public DefaultTableModel crearMdlUsuario(){
        DefaultTableModel mdl = new DefaultTableModel();
        try {
            String sql = "SELECT        dbo.Tb_Usuario.CodEmpleado, dbo.Tb_Empleado.Apellidos, dbo.Tb_Empleado.Nombres, dbo.Tb_Usuario.CodUsuario, dbo.Tb_Area.Area, dbo.Tb_Cargo.Cargo, dbo.Tb_Perfil.Perfil, dbo.Tb_Usuario.Fec_Registro, \n" +
                        "dbo.Tb_Usuario.EstadoUsuario, dbo.Tb_Empleado.Foto\n" +
                        "FROM            dbo.Tb_Area INNER JOIN\n" +
                        "dbo.Tb_Contratacion_Empleado ON dbo.Tb_Area.CodArea = dbo.Tb_Contratacion_Empleado.CodArea INNER JOIN\n" +
                        "dbo.Tb_Cargo ON dbo.Tb_Contratacion_Empleado.CodCargo = dbo.Tb_Cargo.CodCargo INNER JOIN\n" +
                        "dbo.Tb_Empleado ON dbo.Tb_Contratacion_Empleado.CodEmpleado = dbo.Tb_Empleado.CodEmpleado INNER JOIN\n" +
                        "dbo.Tb_Usuario ON dbo.Tb_Empleado.CodEmpleado = dbo.Tb_Usuario.CodEmpleado INNER JOIN\n" +
                        "dbo.Tb_Perfil ON dbo.Tb_Usuario.CodPerfil = dbo.Tb_Perfil.CodPerfil";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            mdl.addColumn("Codigo de Empleado");
            mdl.addColumn("Apellidos");
            mdl.addColumn("Nombres");
            mdl.addColumn("Codigo de Usuario");
            mdl.addColumn("Área");
            mdl.addColumn("Cargo");
            mdl.addColumn("Perfil");
            mdl.addColumn("Fecha de registro");
            mdl.addColumn("Estado de usuario");
            mdl.addColumn("Foto");
            
            while(rs.next()){
                Object data[] = {
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getDate(8),
                    rs.getString(9),
                    rs.getBytes(10)
                        
                };
                mdl.addRow(data);
            }
            
        } catch (Exception e) {
            System.out.println("Error en agragar mdl usuario");
        }
        return mdl;
    }
    
    public Usuario crearUsuario(String codEmp){
        Usuario usr = null;
        try {
            String sql = "SELECT        dbo.Tb_Usuario.CodEmpleado, dbo.Tb_Empleado.Apellidos, dbo.Tb_Empleado.Nombres, dbo.Tb_Empleado.NumDoc_Identidad, dbo.Tb_Usuario.CodUsuario, dbo.Tb_Usuario.Clave, dbo.Tb_Perfil.Perfil, dbo.Tb_Area.Area, \n" +
                        "dbo.Tb_Cargo.Cargo, dbo.Tb_Usuario.Fec_Registro, dbo.Tb_Usuario.EstadoUsuario, dbo.Tb_Empleado.Foto\n" +
                        "FROM            dbo.Tb_Area INNER JOIN\n" +
                        "dbo.Tb_Contratacion_Empleado ON dbo.Tb_Area.CodArea = dbo.Tb_Contratacion_Empleado.CodArea INNER JOIN\n" +
                        "dbo.Tb_Cargo ON dbo.Tb_Contratacion_Empleado.CodCargo = dbo.Tb_Cargo.CodCargo INNER JOIN\n" +
                        "dbo.Tb_Empleado ON dbo.Tb_Contratacion_Empleado.CodEmpleado = dbo.Tb_Empleado.CodEmpleado INNER JOIN\n" +
                        "dbo.Tb_Usuario ON dbo.Tb_Empleado.CodEmpleado = dbo.Tb_Usuario.CodEmpleado INNER JOIN\n" +
                        "dbo.Tb_Perfil ON dbo.Tb_Usuario.CodPerfil = dbo.Tb_Perfil.CodPerfil\n"+ "where dbo.Tb_Usuario.CodEmpleado='" +codEmp + "'" ;
            Statement st = cn.createStatement();
            
            ResultSet rs = st.executeQuery(sql);    
            
            while(rs.next()){
                usr = new Usuario(
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8),
                    rs.getString(9),
                    rs.getDate(10),
                        rs.getString(11),
                        rs.getBytes(12)
                        
                        
                );
            }

        } catch (SQLException e) {
            System.out.println("Error en buscarUsuarioMetodo" + e.getMessage() + e.getCause());
        }
        return usr;
    }
    
    public String validarLogin(String usu, String pas){
        try {
            CallableStatement cs = cn.prepareCall("{ call usp_validarLogin( ?, ?, ?) }");
            cs.setString(1,usu);
            cs.setString(2,pas);
            cs.setString(3, "#PATTERN#");
            
            ResultSet rs = cs.executeQuery();
            if(rs.next()){
                return rs.getString(1);
            }
        } catch (Exception e) {
            
            System.out.printf("Error:", e.getMessage());
            
        }
        
        return "Error en validar login volver a intentar";
    }

    public Boolean agregarUsr(String codEmp, String codUsr, String password,String codPerfil,Date fecReg, String estadoUsr){
        Boolean band = false;
        try {
            CallableStatement cs = cn.prepareCall("{call usp_RegistrarUsuario(?,?,?,?,?,?,?)}");
            java.sql.Date fecha = new java.sql.Date(fecReg.getTime());
            cs.setString(1, codEmp);
            cs.setString(2, codUsr);
            cs.setString(3, password);
            cs.setString(4, "#PATTERN#");
            cs.setString(5, codPerfil);
            cs.setDate(6,fecha);
            cs.setString(7, estadoUsr);
            if(cs.executeUpdate() > 0){
                band = true;
            }
        } catch (SQLException e) {
            System.out.println("Ha ocurrido un error al agragar usuario: " + e.getMessage() + e.getCause());
        }
        return band;
    }
    
    public Boolean actualizarUsuario(String codEmp, String codUser,String clave, String rol,String estadoUsr){
        Boolean band = false;
        try {
            CallableStatement cs = cn.prepareCall("{call usp_actualizarUsuario(?,?,?,?,?,?)}");
            cs.setString(1, codEmp);
            cs.setString(2, codUser);
            cs.setString(3, clave);
            cs.setString(4, "#PATTERN#");
            cs.setString(5, rol);
            cs.setString(6, estadoUsr);
            if(cs.executeUpdate() > 0){
                band = true;
            }
        } catch (SQLException e) {
            System.out.println("Error en Actualizar Rol" + e.getMessage() + e.getCause());
        }
        return band;
    }
    
    public Boolean eliminarUsuario(String codEmp){
        Boolean band = false;
        try {
            String sql = "delete  from Tb_Usuario where CodEmpleado = '" + codEmp +"'";
            Statement st = cn.createStatement();
            if( st.executeUpdate(sql) > 0){
                band = true;
            }
        } catch (Exception e) {
            System.out.println("Error en eliminar Usuario" + e.getMessage());
        }
        return band;
    }
    
    public byte[] extraerFoto(String codUsr){
        byte[] img = null;
        try {
            CallableStatement cs = cn.prepareCall("{call usp_extraerFotoEmp(?)}");
            cs.setString(1, codUsr);
            
            ResultSet rs = cs.executeQuery();
            if(rs.next()){
                img =  rs.getBytes(1);
            }
        } catch (Exception e) {
        }
        return img;
    }
    
    public String codEmp(String codUsr){
        try {
            String sql = "select CodEmpleado from Tb_Usuario where CodUsuario = '"+ codUsr+ "'";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                return rs.getString(1);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "Error al parsear Codigo de Usuario";
    }
    
}
