/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete2.Prestamo;
import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo {

    private String nivelEstudio;
    private String nombreCentroEducativo;
    private double valorCarrera;
    private double valorMensual;

    public PrestamoEducativo(Persona persona, int mesesPrestamo, String ciudad, String nivelEstudio, String nombreCentroEducativo,
            double valorCarrera, double valorMensual) {
        super(persona, mesesPrestamo, ciudad.toLowerCase());
        this.nivelEstudio = nivelEstudio;
        this.nombreCentroEducativo = nombreCentroEducativo;
        this.valorCarrera = valorCarrera;
        this.valorMensual = valorMensual;
    }

    public String getNivelEstudio() {
        return nivelEstudio;
    }

    public void setNivelEstudio(String nivelEstudio) {
        this.nivelEstudio = nivelEstudio;
    }

    public String getNombreCentroEducativo() {
        return nombreCentroEducativo;
    }

    public void setNombreCentroEducativo(String nombreCentroEducativo) {
        this.nombreCentroEducativo = nombreCentroEducativo;
    }

    public double getValorCarrera() {
        return valorCarrera;
    }

    public void setValorCarrera(double valorCarrera) {
        this.valorCarrera = valorCarrera;
    }

    public double getValorMensual() {
        return valorMensual;
    }

    public void calcularValorMensual() {
        this.valorMensual = (valorCarrera / super.mesesPrestamo) - ((valorCarrera / super.mesesPrestamo) * 0.10);
    }

    @Override
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad.toUpperCase();
    }

    @Override
    public String toString() {
        return String.format("%s\nNivel Estudio: %s\nNombre Centro Educativo: %s\n"
                + "Valor carrera: %s\nValor mensual: ", super.toString(), nivelEstudio,
                nombreCentroEducativo, valorCarrera, valorMensual);
    }
    
}
