/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Calendar;

/**
 *
 * @author USER
 */
public class Moto {
    private String placa;
    private boolean casco;
    private Calendar fechaLLegada;
    private Calendar fechaSalida;
    //private int horaLLegada;
    private Empleado empleadoEntrada;
    private Empleado empleadoSalida;
    
    public Moto( String placa , boolean casco , Calendar fechaLLegada , Empleado empleadoEntrada){
        this.placa = placa;
        this.casco = casco;
        this.fechaLLegada = fechaLLegada;
        //this.horaLLegada = horaLLegada;
        this.empleadoEntrada = empleadoEntrada;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the casco
     */
    public boolean isCasco() {
        return casco;
    }

    /**
     * @param casco the casco to set
     */
    public void setCasco(boolean casco) {
        this.casco = casco;
    }

    /**
     * @return the fechaLLegada
     */
    public Calendar getFechaLLegada() {
        return fechaLLegada;
    }

    /**
     * @param fechaLLegada the fechaLLegada to set
     */
    public void setFechaLLegada(Calendar fechaLLegada) {
        this.fechaLLegada = fechaLLegada;
    }

    /**
     * @return the horaLLegada
     
    public int getHoraLLegada() {
        return horaLLegada;
    }

    /**
     * @param horaLLegada the horaLLegada to set
     
    public void setHoraLLegada(int horaLLegada) {
        this.horaLLegada = horaLLegada;
    }
*/
    /**
     * @return the empleadoResponsable
     */
    public Empleado getEmpleadoResponsable() {
        return empleadoEntrada;
    }

    /**
     * @param empleadoResponsable the empleadoResponsable to set
     */
    public void setEmpleadoResponsable(Empleado empleadoResponsable) {
        this.empleadoEntrada = empleadoResponsable;
    }

    /**
     * @return the fechaSalida
     */
    public Calendar getFechaSalida() {
        return fechaSalida;
    }

    /**
     * @param fechaSalida the fechaSalida to set
     */
    public void setFechaSalida(Calendar fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    /**
     * @return the empleadoSalida
     */
    public Empleado getEmpleadoSalida() {
        return empleadoSalida;
    }

    /**
     * @param empleadoSalida the empleadoSalida to set
     */
    public void setEmpleadoSalida(Empleado empleadoSalida) {
        this.empleadoSalida = empleadoSalida;
    }
    
    
}
