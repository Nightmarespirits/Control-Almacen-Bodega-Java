/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.sun.glass.events.KeyEvent;
import gui.FrmMain;
import gui.Empleados;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author clide
 */
public class Utilitarios {
    
    //Este metodo cuando es llamado abre un nuevo JFile Chooser, y retorna una ruta del archivo que se ha seleccionado
    public String rutaArchivo(JFrame frm){
        String ruta = "";
        
        //FileNameExtensionFilter filtro = new FileNameExtensionFilter("jpg","png");
        
        JFileChooser Cuadro_Dialogo = new JFileChooser();
        Cuadro_Dialogo.setDialogTitle("Seleccione una Imagen");
        
        //Cuadro_Dialogo.setFileFilter(filtro);
        
        int cdroDialogo = Cuadro_Dialogo.showOpenDialog(frm);
        
        if(cdroDialogo == JFileChooser.APPROVE_OPTION){
            ruta = Cuadro_Dialogo.getSelectedFile().getPath();
            
        }
        return ruta;
        
    }
    
    //Este metodo evalua que se aya ingresado solo letras no numeros en una caja de texto, recibe como parametro un evento del tipo KeyEvent
    public void Solo_letras(java.awt.event.KeyEvent evt){
        
        if (!Character.isLetter(evt.getKeyChar() )&& !Character.isSpaceChar(evt.getKeyChar() ) ){  
            //DESABILITAR TECLADO
            evt.consume();
        }  
    }
    
    //Este metodo evalua que solo se ingresen numeros no letras,  que la entrada de numeros no sea mayor a 18 cifras
    public void Solo_numeros(java.awt.event.KeyEvent evt,javax.swing.JTextField cajaTexto){
        //evaluar que solo se haya ingresado numero y no letras si es mayor a dos ....
        if(!Character.isDigit(evt.getKeyChar())||cajaTexto.getText().length()>=18)
        {
            //desavilitar :teclado
            evt.consume();
        }
    } 
    

    //Metodo para evaluar si se ha presionado enter
    public  void Cambiar_Cursor(java.awt.event.KeyEvent evt, javax.swing.JTextField CajaTexto){       
            // evaluar si se ha precionado la tecla enter O TAB
        if(evt.getKeyCode()==KeyEvent.VK_ENTER || evt.getKeyCode()==KeyEvent.VK_TAB){
            //ubicar el cursos en el control :jtexfield
            CajaTexto.requestFocus();
        }
    }
     
    public void Limitar_Entrada(int num , java.awt.event.KeyEvent e,javax.swing.JTextField cajaTexto ){

        if(cajaTexto.getText().length()>= num){
          e.consume();
        }
    }
     
    public void Comprobar_Email(javax.swing.JTextField cajaTexto){

        if(!cajaTexto.getText().contains("@")){

            JOptionPane.showMessageDialog(null, "Ingrese un email valido","Mensaje al usuario",
                                       JOptionPane.ERROR_MESSAGE);

            cajaTexto.requestFocus();
         
        }
  
    }
    
    public boolean Evaluar_FecNac( Date fecha){
        Calendar c = Calendar.getInstance();
        c.setTime(fecha);
        
        int anio = c.get(Calendar.YEAR);
        
        if(anio >= 2009){
            JOptionPane.showMessageDialog(null, "Las fechas son incorrectas, verifique e intente de nuevo","Mensaje al usuario",JOptionPane.ERROR_MESSAGE);
            return false;
        }else{
            
            return true;
        }  
    }
    
    public void Salir(JFrame frm){
        //declarar variable de tipo entero
        int Rpta;
        
        //mostrar mensaje de confirmacion
        Rpta = JOptionPane.showConfirmDialog(null,"¿DESEA SALIR DE LA VENTANA?","Mensaje al usuario",
                               JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        //evaluar si se ha pulsado el boton si
        if(Rpta==0){
            
            frm.setVisible(false);
            FrmMain main = new FrmMain();
            
            main.setVisible(true);
        }
    }
    
    
    
}
