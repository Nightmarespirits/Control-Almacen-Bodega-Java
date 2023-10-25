/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author clide
 */
public class Producto {
    
    //Propiedades o Atributos de clase
    private int cod;
    private String producto;
    private String marca;
    private String categoria;
    private String nombre;
    
    
    //Constructor: 
    public Producto() {
        //no args constructor - sin argumentos
        
    }
    //Constructor para un nuevo producto
    public Producto(int cod, String nombre, String prod, String marca, String categ) {
        this.cod = cod;
        this.nombre = nombre;
        this.producto = prod;
        this.marca = marca;
        this.categoria = categ;
    }
    //Constructor para actualizar un producto
    public Producto(String nombre, String prod, String marca, String categ) {
        this.nombre = nombre;
        this.producto = prod;
        this.marca = marca;
        this.categoria = categ;
    }

 
     
    
    
    //Metodos de acceso
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
    
    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categ) {
        this.categoria = categ;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nom){
        this.nombre = nom;
    }
}
