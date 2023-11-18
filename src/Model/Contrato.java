/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author clide
 */
public class Contrato {
    private String codEmp;
    private String numContrato;
    private String nombres;
    private String apellidos;
    private Date fecInicio;
    private Date fecFin;
    private String area;
    private String cargo;
    private String sucursal;
    private String estadoContrato;
    private int sueldo;
    private String obs;
    private byte[] foto;

    public Contrato(String codEmp, String numContrato, String nombres, String apellidos, Date fecInicio, Date fecFin, String area, String cargo, String sucursal, String estadoContrato, int sueldo, String obs, byte[] foto) {
        this.codEmp = codEmp;
        this.numContrato = numContrato;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fecInicio = fecInicio;
        this.fecFin = fecFin;
        this.area = area;
        this.cargo = cargo;
        this.sucursal = sucursal;
        this.estadoContrato = estadoContrato;
        this.sueldo = sueldo;
        this.obs = obs;
        this.foto = foto;
    }

    public String getCodEmp() {
        return codEmp;
    }

    public void setCodEmp(String codEmp) {
        this.codEmp = codEmp;
    }

    public String getNumContrato() {
        return numContrato;
    }

    public void setNumContrato(String numContrato) {
        this.numContrato = numContrato;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFecInicio() {
        return fecInicio;
    }

    public void setFecInicio(Date fecInicio) {
        this.fecInicio = fecInicio;
    }

    public Date getFecFin() {
        return fecFin;
    }

    public void setFecFin(Date fecFin) {
        this.fecFin = fecFin;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getEstadoContrato() {
        return estadoContrato;
    }

    public void setEstadoContrato(String estadoContrato) {
        this.estadoContrato = estadoContrato;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
    
    public byte[] getFoto(){
        return foto;
    }
    
    public void setFoto(byte[] ft){
        this.foto = ft;
    }
    
}
