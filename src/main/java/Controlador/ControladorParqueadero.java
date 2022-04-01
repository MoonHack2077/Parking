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
    public Moto[] motos;
    public Empleado[] empleados;
    
    public ControladorParqueadero(){
        empleados = new Empleado[4];
        motos = new Moto[15];
    }
    
    /**
     * Metodo para saber si una moto ya está registrada en el parqueadero
     * @param documento
     * @return empleado si la encuentra, de lo contrario null
     */
    public Moto buscarMoto(String placa){
        for(int i=0 ; i<motos.length ; i++){
            if( motos[i] != null && motos[i].getPlaca().equals(placa)){
                return motos[i];
            }
        }
        
        return null;
    }
    
    /**
     * Metodo para obtener las horas que permaneció una moto
     * @param moto
     * @return 
     */
    public long horasPermanecidas(Moto moto){
        
        long horaLLegada = moto.getFechaLLegada().getTimeInMillis();
        long horaSalida = moto.getFechaSalida().getTimeInMillis();
        
        long diferenciaHoras = Math.abs( horaLLegada - horaSalida );
        long horasTotales = TimeUnit.MILLISECONDS.toHours(diferenciaHoras);
        
        return horasTotales;
    }
    
    public Moto obtenerMotoSalida(String placa){
        Moto moto = motos[0];
        for(int i=0 ; i<motos.length ; i++){
            if( motos[i] != null && motos[i].getPlaca().equals(placa)){
                moto = motos[i];
            }
        }
        return moto;
    }
    
    /**
     * Metodo para saber si un empleado ya está registrado en el arreglo
     * @param documento
     * @return empleado si lo encuentra, de lo contrario null
     */
    public Empleado buscarEmpleado(int documento){
        for(int i=0 ; i<empleados.length ; i++){
            if(empleados[i]!= null && empleados[i].getDocumento() == documento){
                return empleados[i];
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
            for(int i=0 ; i<empleados.length ; i++){
                if(empleados[i] == null){
                    empleados[i] = empleado;
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
            for(int i=0 ; i<empleados.length ; i++){
                if(empleados[i].getDocumento() == documento){
                    empleados[i] = null;
                    return true;
                }
            }
        }
        
        return false;
    }
    
    /**
     * Metodo para editar la información de un empleado
     * @param documento
     * @return true si se pudo editar, de lo contrario false
     */
    public boolean editarEmpleado(Empleado empleado){
        Empleado aux = buscarEmpleado(empleado.getDocumento());
        
        if( aux != null ){
            for(int i=0 ; i<empleados.length ; i++){
                if(empleados[i].getDocumento() == empleado.getDocumento()){
                    empleados[i].setNombre(empleado.getNombre());
                    empleados[i].setCargo(empleado.getCargo());
                    if( empleado.getCargo().equals("Responsable de patio") ){
                        empleados[i].setPuedeRegistrar(true);
                    }else{
                        empleados[i].setPuedeRegistrar(false);
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
        for( int i=0 ; i<empleados.length ;i++ ){
            if( empleados[i] != null && empleados[i].getPuedeRegistrar() ){
                return true;
            }
        }       
        return false;
    }
}
