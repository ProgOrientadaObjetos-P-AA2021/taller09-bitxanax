/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.Prestamo;
import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Prestamo {

    private String tipoAutomovil;
    private String marcaAutomovil;
    private Persona garante;
    private double valorAutomovil;
    private double valorMensual;

    public PrestamoAutomovil(Persona persona, int mesesPrestamo, String ciudad,
            String tipoAutomovil, String marcaAutomovil, Persona garante,
            double valorAutomovil, double valorMensual) {
        super(persona, mesesPrestamo, ciudad.toUpperCase());
        this.tipoAutomovil = tipoAutomovil;
        this.marcaAutomovil = marcaAutomovil;
        this.garante = garante;
        this.valorAutomovil = valorAutomovil;
        this.valorMensual = valorMensual;
    }

    public String getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(String tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public String getMarcaAutomovil() {
        return marcaAutomovil;
    }

    public void setMarcaAutomovil(String marcaAutomovil) {
        this.marcaAutomovil = marcaAutomovil;
    }

    public Persona getGarante() {
        return garante;
    }

    public void setGarante(Persona garante) {
        this.garante = garante;
    }

    public double getValorAutomovil() {
        return valorAutomovil;
    }

    public void setValorAutomovil(double valorAutomovil) {
        this.valorAutomovil = valorAutomovil;
    }

    public double getValorMensual() {
        return valorMensual;
    }

    public void calcularValorMensual() {
        this.valorMensual = valorAutomovil / super.mesesPrestamo;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad.toLowerCase();
    }

    @Override
    public String toString() {
        return String.format("%s\nTipo Automovil: %s\nMarca Automovil: %s\n"
                + "Datos garante\n -Nombres: %s \n -Apellidos: %s\nValor automovil: %s\nValor mensual: %s",
                super.toString(), tipoAutomovil,
                marcaAutomovil, garante.getNombres(), garante.getApellidos(),
                valorAutomovil, valorMensual);
    }
}
