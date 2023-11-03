/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Model.User;
import dao.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ADMIN
 */
public class UsuarioDao {
    //declaramos una variable que instancia a la clase conexion
    Conexion cnx = new Conexion();
    
    //declaramos a una varible del tipo conection que instancia al metoo getCn de la clase conexion()
    Connection cn = cnx.getCn();
    public User buscarUsuario(String codUsr){
        User usr = null;
        try {
            String sql = "SELECT  dbo.Tb_Usuario.CodEmpleado, dbo.Tb_Empleado.Apellidos, dbo.Tb_Empleado.Nombres, dbo.Tb_Usuario.CodUsuario, dbo.Tb_Usuario.Clave, dbo.Tb_Perfil.Perfil, dbo.Tb_Area.Area, dbo.Tb_Cargo.Cargo\n" +
                        "FROM  dbo.Tb_Area INNER JOIN\n" +
                        "dbo.Tb_Contratacion_Empleado ON dbo.Tb_Area.CodArea = dbo.Tb_Contratacion_Empleado.CodArea INNER JOIN\n" +
                        "dbo.Tb_Cargo ON dbo.Tb_Contratacion_Empleado.CodCargo = dbo.Tb_Cargo.CodCargo INNER JOIN\n" +
                        "dbo.Tb_Empleado ON dbo.Tb_Contratacion_Empleado.CodEmpleado = dbo.Tb_Empleado.CodEmpleado INNER JOIN\n" +
                        "dbo.Tb_Usuario ON dbo.Tb_Empleado.CodEmpleado = dbo.Tb_Usuario.CodEmpleado INNER JOIN\n" +
                        "dbo.Tb_Perfil ON dbo.Tb_Usuario.CodPerfil = dbo.Tb_Perfil.CodPerfil\n" + "where CodUsuario='" +codUsr + "'" ;
            
            Statement st = cn.createStatement();
            
            ResultSet rs = st.executeQuery(sql);    
            
            while(rs.next()){
                usr = new User(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8)
                        
                        
                );
            }

        } catch (Exception e) {
        }
        return usr;
    }
    public String validarLogin(String usu, String pas, String patron){
        try {
            CallableStatement cs = cn.prepareCall("{ call usp_validarLogin( ?, ?, ?) }");
            cs.setString(1,usu);
            cs.setString(2,pas);
            cs.setString(3, patron);
            
            ResultSet rs = cs.executeQuery();
            if(rs.next()){
                return rs.getString(1);
            }
        } catch (Exception e) {
            
            System.out.printf("Error:", e.getMessage());
            
        }
        
        return "Error en validar login volver a intentar";
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
    
}
