package paquete5;

public class Persona{
    protected String nombres;
    protected String apellidos;

    public Persona(String nombre, String apellido) {
        this.nombres = nombre;
        this.apellidos = apellido;
    }


    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return String.format("Nombres: %s\nApellidos: %s", nombres, apellidos);
    }
    
    

}