/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logger;

import Model.Empleado;
import dao.EmpleadoDao;
import java.sql.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author clide
 */
public class EmpleadoLog {
    EmpleadoDao objDao = new EmpleadoDao();
    
    public DefaultTableModel crearMdlEmpleado(){
        return objDao.crearMdlEmpleado();
    }
    public Empleado buscarEmp(String codigo){
       return objDao.buscarEmp(codigo);
    }
    public Boolean agregarEmp(Empleado emp){
        
        return objDao.agregarEmp(emp);
    }
    public String generarCodEmp(){
        return objDao.generarCodEmp();
    }
     public Boolean eliminarEmp( String cod){
         return objDao.eliminarEmp(cod);
     }
    public Boolean actualizarEmp(Empleado emp){
        return objDao.actualizarEmp(emp);
    }
}
