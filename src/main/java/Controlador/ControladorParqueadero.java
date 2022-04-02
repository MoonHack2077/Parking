/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Empleado;
import Modelo.Moto;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author USER
 */
public class ControladorParqueadero {
    private Moto[] motos;
    private Empleado[] empleados;
    
    public ControladorParqueadero(){
        empleados = new Empleado[4];
        motos = new Moto[15];
    }
    
    /**
     * Metodo para saber si una moto ya está registrada en el parqueadero
     * @param placa
     * @return empleado si la encuentra, de lo contrario null
     */
    public Moto buscarMoto(String placa){
        for(int i=0 ; i<getMotos().length ; i++){
            if( getMotos()[i] != null && getMotos()[i].getPlaca().equals(placa)){
                return getMotos()[i];
            }
        }
        
        return null;
    }
    
    /**
     * Metodo para registrar la entrada de una moto en el parqueadero
     * @param moto
     * @return true si tuvo éxito, de lo contrario false
     */
    public boolean registrarEntradaMoto(Moto moto){
        Moto auxMo = buscarMoto(moto.getPlaca());
        
        if( auxMo == null ){
            for( int i=0; i<getMotos().length ;i++ ){
                if( getMotos()[i] == null ){
                    getMotos()[i] = moto;
                   return true;
                }
            }  
        }
        
        return false;
    }
    
    /**
     * Metodo para registrar la salida de una moto del parqueadero
     * @param placa
     * @return true si tuvo éxito, de lo contrario false
     */
    public boolean registrarSalidaMoto(String placa){
        Moto auxMo = buscarMoto(placa);
        
        if( auxMo != null ){
            for( int i=0; i<getMotos().length ;i++ ){
                if( getMotos()[i]!= null && getMotos()[i].getPlaca().equals(placa)){
                    getMotos()[i] = null;
                    return true;
                }
            }
        }
        
        return false;
    }
    
    
    /**
     * Metodo para obtener las horas que permaneció una moto
     * @param moto
     * @return 
     */
    public long horasPermanecidas(Moto moto){
        
        long horaLLegada = moto.getFechaLLegada().getTime();
        long horaSalida = moto.getFechaSalida().getTime();
        
        long diferenciaHoras = Math.abs( horaLLegada - horaSalida );
        long horasTotales = TimeUnit.MILLISECONDS.toHours(diferenciaHoras);
        
        return horasTotales;
    }
    
    /**
     * Metodo para saber si un empleado ya está registrado en el arreglo
     * @param documento
     * @return empleado si lo encuentra, de lo contrario null
     */
    public Empleado buscarEmpleado(int documento){
        for(int i=0 ; i<getEmpleados().length ; i++){
            if(getEmpleados()[i]!= null && getEmpleados()[i].getDocumento() == documento){
                return getEmpleados()[i];
            }
        }
        
        return null;
    }
    
    /**
     * Metodo para añadir un empleado al arreglo
     * @param empleado
     * @return true si se pudo añadir, de lo contrario false
     */
    public boolean añadirEmpleado(Empleado empleado){
        Empleado aux = buscarEmpleado(empleado.getDocumento());
        
        if( aux == null ){
            for(int i=0 ; i<getEmpleados().length ; i++){
                if(getEmpleados()[i] == null){
                    getEmpleados()[i] = empleado;
                    return true;
                }
            }
        }
        
        return false;
    }
    
    /**
     * Metodo para eliminar un empleado del arreglo
     * @param documento
     * @return true si pudo eliminarlo, de lo contrario false
     */
    public boolean eliminarEmpleado(int documento){
        Empleado aux = buscarEmpleado(documento);
        
        if( aux != null ){
            for(int i=0 ; i<getEmpleados().length ; i++){
                if(getEmpleados()[i].getDocumento() == documento){
                    getEmpleados()[i] = null;
                    return true;
                }
            }
        }
        
        return false;
    }
    
    /**
     * Metodo para editar la información de un empleado
     * @param empleado
     * @return true si se pudo editar, de lo contrario false
     */
    public boolean editarEmpleado(Empleado empleado){
        Empleado aux = buscarEmpleado(empleado.getDocumento());
        
        if( aux != null ){
            for(int i=0 ; i<getEmpleados().length ; i++){
                if(getEmpleados()[i].getDocumento() == empleado.getDocumento()){
                    getEmpleados()[i].setNombre(empleado.getNombre());
                    getEmpleados()[i].setCargo(empleado.getCargo());
                    if( empleado.getCargo().equals("Responsable de patio") ){
                        getEmpleados()[i].setPuedeRegistrar(true);
                    }else{
                        getEmpleados()[i].setPuedeRegistrar(false);
                    }
                    return true;
                }
            }
        }
        
        return false;
    }
    
    /**
     * Metodo para saber si hay un responsable de patio
     * @return true si hay un empleado que pueda realizar la accion, de lo contrario false 
     */
    public boolean hayAlgunEmpleado(){
        for( int i=0 ; i<getEmpleados().length ;i++ ){
            if( getEmpleados()[i] != null && getEmpleados()[i].getPuedeRegistrar() ){
                return true;
            }
        }       
        return false;
    }

    /**
     * @return the motos
     */
    public Moto[] getMotos() {
        return motos;
    }

    /**
     * @return the empleados
     */
    public Empleado[] getEmpleados() {
        return empleados;
    }

  
}
