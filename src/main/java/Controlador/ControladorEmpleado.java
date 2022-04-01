/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Moto;

/**
 *
 * @author USER
 */
public class ControladorEmpleado {
    
    ControladorParqueadero cp = new ControladorParqueadero();
    public ControladorEmpleado(){}
    
    /**
     * Metodo para registrar la entrada de una moto en el parqueadero
     * @param moto
     * @param documento
     * @return true si tuvo éxito, de lo contrario false
     */
    public boolean registrarEntradaMoto(Moto moto){
        Moto auxMo = cp.buscarMoto(moto.getPlaca());
        
        if( auxMo == null ){
            for( int i=0; i<cp.motos.length ;i++ ){
                if( cp.motos[i] == null ){
                    cp.motos[i] = moto;
                   return true;
                }
            }  
        }
        
        return false;
    }
    
    /**
     * Metodo para registrar la salida de una moto del parqueadero
     * @param moto
     * @return true si tuvo éxito, de lo contrario false
     */
    public boolean registrarSalidaMoto(String placa){
        Moto auxMo = cp.buscarMoto(placa);
        
        if( auxMo != null ){
            for( int i=0; i<cp.motos.length ;i++ ){
                if( cp.motos[i]!= null && cp.motos[i].getPlaca().equals(placa)){
                    cp.motos[i] = null;
                    return true;
                }
            }
        }
        
        return false;
    }
    
}