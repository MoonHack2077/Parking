/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author USER
 */
public class Empleado {
    private String nombre;
    private int documento;
    private String tipo;
    private boolean puedeRegistrar;

    public Empleado(String nombre , int documento, String tipo , boolean puedeRegistrar){
        this.nombre = nombre;
        this.documento = documento;
        this.tipo = tipo;
        this.puedeRegistrar = puedeRegistrar;
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the documento
     */
    public int getDocumento() {
        return documento;
    }

    /**
     * @param documento the documento to set
     */
    public void setDocumento(int documento) {
        this.documento = documento;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the puedeRegistrar
     */
    public boolean getPuedeRegistrar() {
        return puedeRegistrar;
    }

    /**
     * @param puedeRegistrar the puedeRegistrar to set
     */
    public void setPuedeRegistrar(boolean puedeRegistrar) {
        this.puedeRegistrar = puedeRegistrar;
    }
}
