/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author USER
 */
public class Moto {
    private String placa;
    private boolean casco;
    private String fechaLLegada;
    private int horaLLegada;
    private Empleado empleadoResponsable;
    
    public Moto( String placa , boolean casco , String fechaLLegada , int horaLLegada , Empleado empleadoResponsable){
        this.placa = placa;
        this.casco = casco;
        this.fechaLLegada = fechaLLegada;
        this.horaLLegada = horaLLegada;
        this.empleadoResponsable = empleadoResponsable;
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
    public String getFechaLLegada() {
        return fechaLLegada;
    }

    /**
     * @param fechaLLegada the fechaLLegada to set
     */
    public void setFechaLLegada(String fechaLLegada) {
        this.fechaLLegada = fechaLLegada;
    }

    /**
     * @return the horaLLegada
     */
    public int getHoraLLegada() {
        return horaLLegada;
    }

    /**
     * @param horaLLegada the horaLLegada to set
     */
    public void setHoraLLegada(int horaLLegada) {
        this.horaLLegada = horaLLegada;
    }

    /**
     * @return the empleadoResponsable
     */
    public Empleado getEmpleadoResponsable() {
        return empleadoResponsable;
    }

    /**
     * @param empleadoResponsable the empleadoResponsable to set
     */
    public void setEmpleadoResponsable(Empleado empleadoResponsable) {
        this.empleadoResponsable = empleadoResponsable;
    }
    
    
}
