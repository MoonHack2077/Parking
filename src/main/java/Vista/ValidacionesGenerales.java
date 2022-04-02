/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class ValidacionesGenerales {
    
    public ValidacionesGenerales(){}
    
    /**
     * Metodo para evitar que el usuario digite caracteres especiales
     * @param evt 
     */
    public void validarCaracteresEspeciales( java.awt.event.KeyEvent evt ){
        int caracter = evt.getKeyChar();
        if( caracter==127 ){ 
            return;
        }
        
        if( (caracter>=33 && caracter<=47) 
                || (caracter>=58 && caracter<=64)
                || (caracter>=91 && caracter<=96)
                || (caracter>=123 && caracter<=126)
                || (caracter>=128 && caracter<=208)
                || (caracter>=210 && caracter<=240)
                || (caracter>=242 && caracter<=255)){
            
            JOptionPane.showMessageDialog(null, "Caracter no valido");
            evt.consume();
        }
    }
    
    /**
     * Metodo para que los textField Documento y año unicamente acepten numeros
     * @param evt 
     */
    public void soloNumeros( java.awt.event.KeyEvent evt  ){
        char caracter = evt.getKeyChar();
        if( caracter<'0' || caracter>'9' ){
            JOptionPane.showMessageDialog(null, "Solo se admiten números");
            evt.consume();
        }
    }
}
