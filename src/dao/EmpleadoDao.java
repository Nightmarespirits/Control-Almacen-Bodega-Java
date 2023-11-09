/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Model.Empleado;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author clide
 */
public class EmpleadoDao {
    Conexion cnx = new Conexion();
    Connection cn = cnx.getCn();
    
    public DefaultTableModel crearMdlEmpleado(){
        DefaultTableModel mdl = new DefaultTableModel();
        try {
           String sql = "SELECT dbo.Tb_Empleado.CodEmpleado, dbo.Tb_Empleado.Apellidos, dbo.Tb_Empleado.Nombres, dbo.Tb_Empleado.Fec_Nac, dbo.Tb_Empleado.Sexo, dbo.Tb_Empleado.Estado_Civil, dbo.Tb_Nacionalidad.Nacionalidad, \n" +
                        " dbo.Tb_Doc_Identidad.Documento_Identidad, dbo.Tb_Empleado.NumDoc_Identidad, dbo.Tb_Empleado.Nro_Hijos, dbo.Tb_Distrito.Distrito, dbo.Tb_Provincia.Provincia, dbo.Tb_Departamento.Departamento, \n" +
                        " dbo.Tb_Empleado.Direccion, dbo.Tb_Empleado.Email, dbo.Tb_Empleado.Telefono, dbo.Tb_Empleado.Fec_Registro, dbo.Tb_Empleado.Foto, dbo.Tb_Empleado.Estado_Empleado\n" +
                        "FROM  dbo.Tb_Empleado INNER JOIN\n" +
                        " dbo.Tb_Distrito ON dbo.Tb_Empleado.CodDistrito = dbo.Tb_Distrito.CodDistrito INNER JOIN\n" +
                        " dbo.Tb_Doc_Identidad ON dbo.Tb_Empleado.CodTipo_Doc = dbo.Tb_Doc_Identidad.CodTipo_Doc INNER JOIN\n" +
                        " dbo.Tb_Nacionalidad ON dbo.Tb_Empleado.CodNacionalidad = dbo.Tb_Nacionalidad.CodNacionalidad INNER JOIN\n" +
                        " dbo.Tb_Provincia ON dbo.Tb_Distrito.CodProvincia = dbo.Tb_Provincia.CodProvincia INNER JOIN\n" +
                        " dbo.Tb_Departamento ON dbo.Tb_Provincia.CodDepartamento = dbo.Tb_Departamento.CodDepartamento";
           
           
           Statement st = cn.createStatement();
           ResultSet rs = st.executeQuery(sql);
           mdl.addColumn("Cod Empleado");
           mdl.addColumn("Apellidos");
           mdl.addColumn("Nombres");
           mdl.addColumn("Fecha Nacimiento");
           mdl.addColumn("Sexo");
           mdl.addColumn("Estado Civil");
           mdl.addColumn("Nacionalidad");
           mdl.addColumn("Tipo de Documento");
           mdl.addColumn("Numero de Documento");
           mdl.addColumn("Numero de Hijos");
           mdl.addColumn("Distrito");
           mdl.addColumn("Provincia");
           mdl.addColumn("Departamento");
           mdl.addColumn("Direccion");
           mdl.addColumn("Email");
           mdl.addColumn("Telefono");
           mdl.addColumn("Fecha Registro");
           mdl.addColumn("Foto");
           mdl.addColumn("Estado Empleado");
           
           while(rs.next()){
               Object data[] = {
                   rs.getString(1),
                   rs.getString(2),
                   rs.getString(3),
                   rs.getDate(4),
                   rs.getString(5),
                   rs.getString(6),
                   rs.getString(7),
                   rs.getString(8),
                   rs.getString(9),
                   rs.getInt(10),
                   rs.getString(11),
                   rs.getString(12),
                   rs.getString(13),
                   rs.getString(14),
                   rs.getString(15),
                   rs.getString(16),
                   rs.getDate(17),
                   rs.getString(18),
                   rs.getString(19)
                   
               };
               mdl.addRow(data);
           }
            
        } catch (Exception e) {
            System.out.println("Error en crearEmpleadoMdl " + e.getMessage());
        }
        return mdl;
    }
    
    //Buscar Empleado por codigo
    public Empleado buscarEmp(String codigo){
        Empleado emp = null;
        try {
           String sql = "SELECT dbo.Tb_Empleado.CodEmpleado, dbo.Tb_Empleado.Apellidos, dbo.Tb_Empleado.Nombres, dbo.Tb_Empleado.Fec_Nac, dbo.Tb_Empleado.Sexo, dbo.Tb_Empleado.Estado_Civil, dbo.Tb_Nacionalidad.Nacionalidad, \n" +
                        " dbo.Tb_Doc_Identidad.Documento_Identidad, dbo.Tb_Empleado.NumDoc_Identidad, dbo.Tb_Empleado.Nro_Hijos, dbo.Tb_Distrito.Distrito, dbo.Tb_Provincia.Provincia, dbo.Tb_Departamento.Departamento, \n" +
                        " dbo.Tb_Empleado.Direccion, dbo.Tb_Empleado.Email, dbo.Tb_Empleado.Telefono, dbo.Tb_Empleado.Fec_Registro, dbo.Tb_Empleado.Foto, dbo.Tb_Empleado.Estado_Empleado\n" +
                        "FROM  dbo.Tb_Empleado INNER JOIN\n" +
                        " dbo.Tb_Distrito ON dbo.Tb_Empleado.CodDistrito = dbo.Tb_Distrito.CodDistrito INNER JOIN\n" +
                        " dbo.Tb_Doc_Identidad ON dbo.Tb_Empleado.CodTipo_Doc = dbo.Tb_Doc_Identidad.CodTipo_Doc INNER JOIN\n" +
                        " dbo.Tb_Nacionalidad ON dbo.Tb_Empleado.CodNacionalidad = dbo.Tb_Nacionalidad.CodNacionalidad INNER JOIN\n" +
                        " dbo.Tb_Provincia ON dbo.Tb_Distrito.CodProvincia = dbo.Tb_Provincia.CodProvincia INNER JOIN\n" +
                        " dbo.Tb_Departamento ON dbo.Tb_Provincia.CodDepartamento = dbo.Tb_Departamento.CodDepartamento\n" + 
                        "where dbo.Tb_Empleado.CodEmpleado ='" + codigo + "'";
            
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                //env.setId(rs.getInt(1));
                //env.setNombre(rs.getString(2));
                //env.setTelefono(rs.getString(3));
                
                emp = new Empleado(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDate(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getInt(10),
                        rs.getString(11),
                        rs.getString(12),
                        rs.getString(13),
                        rs.getString(14),
                        rs.getString(15),
                        rs.getString(16),
                        rs.getDate(17),
                        rs.getBytes(18),
                        rs.getString(19)                                  
                );
            }
            
        } catch (Exception e) {
            System.out.print(" Error en buscar empleado empDao" +e.getMessage());
        }
        return emp;
    }
    
    public Boolean agregarEmp(Empleado emp){
        boolean band = false;
        try {
            CallableStatement cs = cn.prepareCall("{call usp_agregarEmpleado(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            
            //Conversion de java.util.Date a java.sql.Date
            java.sql.Date fecNacSql = new java.sql.Date(emp.getFecNac().getTime());
            java.sql.Date fecRegSql = new java.sql.Date(emp.getFecReg().getTime());
        
            //Es una forma de enviar parametros desde el objeto env de los getter y setter
            cs.setString(1, emp.getCod());
            cs.setString(2, emp.getApellidos());
            cs.setString(3, emp.getNombre());
            cs.setDate(4,fecNacSql );
            cs.setString(5, emp.getSexo());
            cs.setString(6, emp.getEstCivil());
            cs.setString(7, emp.getNacionalidad());
            cs.setString(8, emp.getTipoDoc());
            cs.setString(9, emp.getNumDoc());
            cs.setInt((10),emp.getNumHijos() );
            cs.setString(11, emp.getDistrito());
            cs.setString(12, emp.getDireccion());
            cs.setString(13, emp.getEmail());
            cs.setString(14, emp.getTelefono());
            cs.setDate((15), fecRegSql );
            cs.setBytes(16, emp.getFoto());
            cs.setString(17, emp.getEstado());
            

            if(cs.executeUpdate()>0){
                band = true;
            }
        } catch (Exception e) {
            System.out.print("Error en agregar empleado:" + e.getMessage());
        }
        return band;
    }
    
    public String generarCodEmp(){
        String cod = "";
        try {
            CallableStatement cs = cn.prepareCall("{call usp_GenerarCodEmpleado(?)}");
            cs.registerOutParameter(1, Types.VARCHAR);
            cs.executeUpdate();
            cod = cs.getString(1);
            return cod;
        } catch (SQLException e) {
            e.printStackTrace(); // Imprime la información de la excepción
            return cod;
        }
        
    }
    
    public Boolean eliminarEmp( String cod){
        boolean band = false;
        try {
            PreparedStatement ps = cn.prepareCall("delete from Tb_Empleado where CodEmpleado=?");
            ps.setString(1,cod);
            if(ps.executeUpdate() > 0){
                band = true;
            }
        } catch (Exception e) {
            System.out.print( e.getMessage() );
        }
        
        return band;
    }
    
    public Boolean actualizarEmp(Empleado emp){
        Boolean band = false;
        try {
            CallableStatement cs = cn.prepareCall("{call usp_actualizarEmpleado(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            
            //Conversion de java.util.Date a java.sql.Date
            java.sql.Date fecNacSql = new java.sql.Date(emp.getFecNac().getTime());
            java.sql.Date fecRegSql = new java.sql.Date(emp.getFecReg().getTime());
        
            //Es una forma de enviar parametros desde el objeto env de los getter y setter
            cs.setString(1, emp.getCod());
            cs.setString(2, emp.getApellidos());
            cs.setString(3, emp.getNombre());
            cs.setDate(4,fecNacSql );
            cs.setString(5, emp.getSexo());
            cs.setString(6, emp.getEstCivil());
            cs.setString(7, emp.getNacionalidad());
            cs.setString(8, emp.getTipoDoc());
            cs.setString(9, emp.getNumDoc());
            cs.setInt((10),emp.getNumHijos() );
            cs.setString(11, emp.getDistrito());
            cs.setString(12, emp.getDireccion());
            cs.setString(13, emp.getEmail());
            cs.setString(14, emp.getTelefono());
            cs.setDate((15), fecRegSql );
            cs.setBytes(16, emp.getFoto());
            cs.setString(17, emp.getEstado());
            

            if(cs.executeUpdate()>0){
                band = true;
            }
            
        } catch (SQLException e) {
            System.out.println("Ha ocurrido un error al actualizar empleado" + e.getMessage());
        }
        return band;
    }
    
    public Boolean contratoVigenteEmp(String codEmp){
        Boolean band = false;
        try {
            String sql = "select Estado_Contrato from Tb_Contratacion_Empleado where CodEmpleado = '" + codEmp + "'";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                if("Vigente".equals(rs.getString(1))){
                    band = true;
                }
            }
            
        } catch (SQLException e) {
            System.out.println("Error en el buscar Contrarto de empleado" + e.getMessage());
        }
        return band;
    }
    
}
