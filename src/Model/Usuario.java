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
public class Usuario {
    private String codEmp;
    private String apellidos;
    private String nombres;
    private String numDoc;
    private String codUser;
    private String password;
    private String rol;
    private String area;
    private String cargo;
    private Date fecReg;
    private String estadoUsuario;
    private byte[] foto;

    public Usuario(String codEmp, String apellidos, String nombres, String numDoc, String codUser, String password, String rol, String area, String cargo, Date fecReg, String estadoUsuario, byte[] foto) {
        this.codEmp = codEmp;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.numDoc = numDoc;
        this.codUser = codUser;
        this.password = password;
        this.rol = rol;
        this.area = area;
        this.cargo = cargo;
        this.fecReg = fecReg;
        this.estadoUsuario = estadoUsuario;
        this.foto = foto;
    }
    public String session;
    

    

    public String getCodUser() {
        return codUser;
    }

    public void setCodUser(String codUser) {
        this.codUser = codUser;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getUsername() {
        return codUser;
    }

    public void setUsername(String username) {
        this.codUser = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
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

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }
   public String getCodEmp() {
        return codEmp;
    }

    public void setCodEmp(String codEmp) {
        this.codEmp = codEmp;
    }

    public Date getFecReg() {
        return fecReg;
    }

    public void setFecReg(Date fecReg) {
        this.fecReg = fecReg;
    }

    public String getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(String estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }
    
    
}
