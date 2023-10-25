/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logger;

import dao.EmpleadoDao;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author clide
 */
public class EmpleadoLog {
    EmpleadoDao emp = new EmpleadoDao();
    public DefaultTableModel crearMdlEmpleado(){
        return emp.crearMdlEmpleado();
    }
}
