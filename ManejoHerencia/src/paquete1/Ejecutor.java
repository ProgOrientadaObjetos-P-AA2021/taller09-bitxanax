/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Scanner;
import paquete2.Prestamo;
import paquete5.Persona;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        boolean exit = false;
        boolean wrongOptionInserted = false;
        int mesesPrestamo = 0;
        String nombres;
        String apellidos;
        String ciudad = null;

        Persona persona = null;
        Prestamo prestamo = null;

        //Bucle hasta que se seleccione salir
        do {
            System.out.println("========PRESTAMOS==========");
            System.out.println("1.Prestamo educativo");
            System.out.println("2.Prestamo automovil");
            System.out.println("3.Salir");
            System.out.print(" ==>");
            String option = read.nextLine();

            //Se elimina espacios y mayúsculas
            option.toLowerCase();
            option.trim();
            System.out.println("========================");

            //Evita que se pida el ingreso de datos nuevamente en caso de 
            //una opción incorrecta
            if (wrongOptionInserted != true) {
                System.out.print("Ingrese los nombres: ");
                nombres = read.nextLine();
                System.out.print("Ingrese los apellidos: ");
                apellidos = read.nextLine();
                persona = new Persona(nombres, apellidos);
                System.out.print("Meses prestamo: ");
                mesesPrestamo = Integer.parseInt(read.nextLine());
                System.out.print("Ciudad: ");
                ciudad = read.nextLine();

            }

            switch (option) {
                case "1":

                    System.out.print("Nivel Estudio:");
                    String nivelEstudio = read.nextLine();
                    System.out.print("Nombre centro educativo: ");
                    String nombreCentroEducativo = read.nextLine();
                    System.out.print("Valor Carrera: ");
                    double valorCarrera = read.nextDouble();
                    System.out.print("Valor Mensual: ");
                    double valorMensualCarrera = read.nextDouble();
                    prestamo = new PrestamoEducativo(persona, mesesPrestamo,
                            ciudad, nivelEstudio, nombreCentroEducativo,
                            valorCarrera, valorMensualCarrera);
                    prestamo.calcularValorMensual();

                    break;
                case "2":
                    System.out.print("Tipo Automovil: ");
                    String tipoAutomovil = read.nextLine();
                    System.out.print("Marca Automovil: ");
                    String marcaAutomovil = read.nextLine();
                    System.out.print("Valor Automovil: ");
                    double valorAutomovil = Double.parseDouble(read.nextLine());
                    System.out.print("Valor Mensual: ");
                    double valorMensual = Double.parseDouble(read.nextLine());
                    System.out.print("Datos del garante ->\n");
                    System.out.print(" Nombres: ");
                    String nombresGarante = read.nextLine();
                    System.out.print(" Apelllidos: ");
                    String apellidosGarante = read.nextLine();

                    Persona garante = new Persona(nombresGarante, apellidosGarante);

                    prestamo = new PrestamoAutomovil(persona,
                            mesesPrestamo, ciudad, tipoAutomovil, marcaAutomovil,
                            garante, valorAutomovil, valorMensual);
                    prestamo.calcularValorMensual();

                    break;

                case "3":
                    exit = true;
                    break;
                default:
                    System.out.println("---x Opcion incorrecta---");
                    wrongOptionInserted = true;
                    break;
            }

            System.out.println(prestamo);

        } while (exit == false);

    }

}
