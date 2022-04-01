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
     * Metodo para registrar una moto en el parqueadero
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
     * 
     * @param moto
     * @return 
     */
    public boolean registrarSalidaMoto(Moto moto){
         Moto auxMo = cp.buscarMoto(moto.getPlaca());
        
        if( auxMo != null ){
            for( int i=0; i<cp.motos.length ;i++ ){
                if( cp.motos[i]!= null && cp.motos[i].getPlaca().equals(moto.getPlaca())){
                    cp.motos[i] = null;
                     return true;
                }
            }
            //Maybe add joptionpane to advise that he can´t add a moto
        }
        
        return false;
    }
    
}
