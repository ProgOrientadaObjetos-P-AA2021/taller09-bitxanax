/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class Prestamo {
    protected Persona persona;
    protected int mesesPrestamo;
    protected String ciudad;

    public Prestamo(Persona persona, int mesesPrestamo, String ciudad) {
        this.persona = persona;
        this.mesesPrestamo = mesesPrestamo;
        this.ciudad = ciudad;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int getMesesPrestamo() {
        return mesesPrestamo;
    }

    public void setMesesPrestamo(int mesesPrestamo) {
        this.mesesPrestamo = mesesPrestamo;
    }

    public String getCiudad() {
        return ciudad;
    }

    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad.toLowerCase();
    }

    @Override
    public String toString() {
        return String.format("%s\nCiudad: %s \nMeses Prestamo: %s", persona, ciudad,
                mesesPrestamo);
    }

    public void calcularValorMensual() {
        throw new UnsupportedOperationException("Should be overrided"); //To change body of generated methods, choose Tools | Templates.
    }
}
