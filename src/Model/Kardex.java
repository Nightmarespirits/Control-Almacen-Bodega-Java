package Model;

import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author clide
 */
public class Kardex {
    private String numOp;
    private String emp;
    private Date fecOp;
    private String tipoComp;
    private String numSerieCom;
    private String tipoOp;
    private String suc;
    private String codBarra;
    private String nombreProd;
    private Date fecElab;
    private Date fecVenc;
    private String cant;
    private String costoUnit;
    private String costoTotal;
    private String obs;

    public Kardex(String numOp, String emp, Date fecOp, String tipoComp, String numSerieCom, String tipoOp, String suc, String numSerie, String nombreProd, Date fecElab, Date fecVenc, String cant, String costoUnit, String costoTotal, String obs) {
        this.numOp = numOp;
        this.emp = emp;
        this.fecOp = fecOp;
        this.tipoComp = tipoComp;
        this.numSerieCom = numSerieCom;
        this.tipoOp = tipoOp;
        this.suc = suc;
        this.codBarra = numSerie;
        this.nombreProd = nombreProd;
        this.fecElab = fecElab;
        this.fecVenc = fecVenc;
        this.cant = cant;
        this.costoUnit = costoUnit;
        this.costoTotal = costoTotal;
        this.obs = obs;
    }

    public String getNumOp() {
        return numOp;
    }

    public void setNumOp(String numOp) {
        this.numOp = numOp;
    }

    public String getEmp() {
        return emp;
    }

    public void setEmp(String emp) {
        this.emp = emp;
    }

    public Date getFecOp() {
        return fecOp;
    }

    public void setFecOp(Date fecOp) {
        this.fecOp = fecOp;
    }

    public String getTipoComp() {
        return tipoComp;
    }

    public void setTipoComp(String tipoComp) {
        this.tipoComp = tipoComp;
    }

    public String getNumSerieCom() {
        return numSerieCom;
    }

    public void setNumSerieCom(String numSerieCom) {
        this.numSerieCom = numSerieCom;
    }

    public String getTipoOp() {
        return tipoOp;
    }

    public void setTipoOp(String tipoOp) {
        this.tipoOp = tipoOp;
    }

    public String getSuc() {
        return suc;
    }

    public void setSuc(String suc) {
        this.suc = suc;
    }

    public String getcodBarra() {
        return codBarra;
    }

    public void setcodBarra(String codBarra) {
        this.codBarra = codBarra;
    }

    public String getNombreProd() {
        return nombreProd;
    }

    public void setNombreProd(String nombreProd) {
        this.nombreProd = nombreProd;
    }

    public Date getFecElab() {
        return fecElab;
    }

    public void setFecElab(Date fecElab) {
        this.fecElab = fecElab;
    }

    public Date getFecVenc() {
        return fecVenc;
    }

    public void setFecVenc(Date fecVenc) {
        this.fecVenc = fecVenc;
    }

    public String getCant() {
        return cant;
    }

    public void setCant(String cant) {
        this.cant = cant;
    }

    public String getCostoUnit() {
        return costoUnit;
    }

    public void setCostoUnit(String costoUnit) {
        this.costoUnit = costoUnit;
    }

    public String getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(String costoTotal) {
        this.costoTotal = costoTotal;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
    
    
    
    
}
