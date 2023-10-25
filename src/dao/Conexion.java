/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author clide
 */
public class Conexion {
    private String url = "jdbc:sqlserver://localhost:1433;" 
            + "database=BD_BodegaElmer_Almacen;" + "user=sa;" + "password=masterdatabase31;" +"trustServerCertificate=true;";
    private String user = "root";
    private String password = "321";
    private String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    
    public Connection getCn(){
        
        //Declaramos como nula una variable del tipo connection
        Connection cn = null;
        try{
            //registramos la tecnologia con la que vamos a conectarnos a la base de datos
            Class.forName(driver);
            
            //Realizamos la conexion usando el driver manager y su propiedad tomar conexion
            cn = DriverManager.getConnection(url);
            
            //Imprimimos por consola para ve que todo vaya bien
            System.out.println("Conexion establecida...");
            
            
        }catch(Exception e){
            
            //En caso suceda un error que imprima el tipo de error
            System.out.println("Error: " + e.toString());
        }
        
        
        return cn;
    }
    
    
}
