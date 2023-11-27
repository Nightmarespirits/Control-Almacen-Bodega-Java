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
    private String categoria;
    private String producto;
    private String marca;
    private String descripcion;
    private String presentacion;
    private String uniMed;
    private Double precUnit;
    private Double precCaja;
    private Double precVentaUnit;
    private Double precVentaCaja;
    private int stockCaja;
    private int stockUnid;
    private String estado;
    private byte[] foto;

    public Producto(int cod, String categoria, String producto, String marca, String descripcion, String presentacion, String uniMed, Double precUnit, Double precCaja, Double precVentaUnit, Double precVentaCaja, int stockCaja, int stockUnid, String estado, byte[] foto) {
        this.cod = cod;
        this.categoria = categoria;
        this.producto = producto;
        this.marca = marca;
        this.descripcion = descripcion;
        this.presentacion = presentacion;
        this.uniMed = uniMed;
        this.precUnit = precUnit;
        this.precCaja = precCaja;
        this.precVentaUnit = precVentaUnit;
        this.precVentaCaja = precVentaCaja;
        this.stockCaja = stockCaja;
        this.stockUnid = stockUnid;
        this.estado = estado;
        this.foto = foto;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getUniMed() {
        return uniMed;
    }

    public void setUniMed(String uniMed) {
        this.uniMed = uniMed;
    }

    public Double getPrecUnit() {
        return precUnit;
    }

    public void setPrecUnit(Double precUnit) {
        this.precUnit = precUnit;
    }

    public Double getPrecCaja() {
        return precCaja;
    }

    public void setPrecCaja(Double precCaja) {
        this.precCaja = precCaja;
    }

    public Double getPrecVentaUnit() {
        return precVentaUnit;
    }

    public void setPrecVentaUnit(Double precVentaUnit) {
        this.precVentaUnit = precVentaUnit;
    }

    public Double getPrecVentaCaja() {
        return precVentaCaja;
    }

    public void setPrecVentaCaja(Double precVentaCaja) {
        this.precVentaCaja = precVentaCaja;
    }

    public int getStockCaja() {
        return stockCaja;
    }

    public void setStockCaja(int stockCaja) {
        this.stockCaja = stockCaja;
    }

    public int getStockUnid() {
        return stockUnid;
    }

    public void setStockUnid(int stockUnid) {
        this.stockUnid = stockUnid;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
    
    
    
    
}
