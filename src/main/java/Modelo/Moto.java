/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author USER
 */
public class Moto {
    private String placa;
    private boolean casco;
    private Date fechaLLegada;
    private Date fechaSalida;
    private Empleado empleadoEntrada;
    private Empleado empleadoSalida;
    private long horasQuePermanecio;
    
    public Moto( String placa , boolean casco , Date fechaLLegada , Empleado empleadoEntrada){
        this.placa = placa;
        this.casco = casco;
        this.fechaLLegada = fechaLLegada;
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
    public Date getFechaLLegada() {
        return fechaLLegada;
    }

    /**
     * @param fechaLLegada the fechaLLegada to set
     */
    public void setFechaLLegada(Date fechaLLegada) {
        this.fechaLLegada = fechaLLegada;
    }

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
    public Date getFechaSalida() {
        return fechaSalida;
    }

    /**
     * @param fechaSalida the fechaSalida to set
     */
    public void setFechaSalida(Date fechaSalida) {
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

    /**
     * @return the horasPermanecidas
     */
    public long getHorasQuePermanecio() {
        return horasQuePermanecio;
    }

    /**
     * @param horasQuePermanecio the horasPermanecidas to set
     */
    public void setHorasQuePermanecio(long horasQuePermanecio) {
        this.horasQuePermanecio = horasQuePermanecio;
    }
    
    
}
