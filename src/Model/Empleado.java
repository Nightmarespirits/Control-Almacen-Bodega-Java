/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Date;

/**
 *
 * @author clide
 */
public class Empleado {
    //Propiedades o atributos de clase
    private String cod;
    private String nombre;
    private String apellidos;
    private Date fecNac;
    private String sexo;
    private String estCivil;
    private String nacionalidad;
    private String tipoDoc;
    private String numDoc;
    private int numHijos;
    private String distrito;
    private String provincia;
    private String departamento;
    private String direccion;
    private String email;
    private String telefono;
    private Date fecReg;
    private String foto;
    private String estado;

    public Empleado(String cod, String nombre, String apellidos, Date fecNac, String sexo, String estCivil, String nacionalidad, String tipoDoc, String numDoc, int numHijos, String distrito, String provincia, String departamento, String direccion, String email, String telefono, Date fecReg, String foto, String estado) {
        this.cod = cod;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fecNac = fecNac;
        this.sexo = sexo;
        this.estCivil = estCivil;
        this.nacionalidad = nacionalidad;
        this.tipoDoc = tipoDoc;
        this.numDoc = numDoc;
        this.numHijos = numHijos;
        this.distrito = distrito;
        this.provincia = provincia;
        this.departamento = departamento;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
        this.fecReg = fecReg;
        this.foto = foto;
        this.estado = estado;
    }
   

    //Metodos de acceso
    public String getCod(){
        return cod;
    }
    public void setCod(String cod){
        this.cod = cod;
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
    public Date getFecNac(){
        return fecNac;
    }
    public void setFecNac(Date fecNac){
        this.fecNac = fecNac;
    }
    public String getSexo(){
        return sexo;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public String getEstCivil(){
        return estCivil;
    }
    public void setEstCivil(String estCivil){
        this.estCivil = estCivil;
    }
    public String getNacionalidad(){
        return nacionalidad;
    }
    public void setNacionalidad(String nac){
        this.nacionalidad = nac;
    }
    public String getTipoDoc(){
        return tipoDoc;
    }
    public void setTipoDoc(String tipoDoc){
        this.tipoDoc = tipoDoc;
    }

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }

    public int getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFecReg() {
        return fecReg;
    }

    public void setFecReg(Date fecReg) {
        this.fecReg = fecReg;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
