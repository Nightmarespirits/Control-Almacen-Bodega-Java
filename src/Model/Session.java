/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author clide
 */
public class Session {
    private static String session = "";
    private static String title1 = "Bodega Elmer - Control de Almacén | Sistema de control de Almácen";
    private static String title2 = "Bodega Elmer - Control de Almacén | ADMINISTRADOR";
    
    public static String getSession() {
        return session;
    }

    public static void setSession(String session) {
        Session.session = session;
    }

    public static String getTitle1() {
        return title1;
    }

    public static String getTitle2() {
        return title2;
    }

   
   
    
}
