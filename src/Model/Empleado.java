/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author clide
 */
public class Empleado {
    //Propiedades o atributos de clase
    private int id;
    private String nombre;
    private String apellidos;
    
    //Constructor
    public void Empleado(){
        
    }
    public void Empleado(int id, String nom, String ape){
        this.id = id;
        this.nombre = nom;
        this.apellidos = ape;
    }
    public void Empleado(String nom, String ape){
        this.nombre = nom;
        this.apellidos = ape;
    }
    
    //Metodos de acceso
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nom){
        this.nombre = nom;
    }
    public String getApellidos(){
        return apellidos;
    }
    public void setApellidos(String ape){
        this.apellidos = ape;
    }
    
}
