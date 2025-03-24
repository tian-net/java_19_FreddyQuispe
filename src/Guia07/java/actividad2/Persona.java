package actividad2;

public class Persona {
    // Atributos
    public String nombre;
    public int edad;


    // Métodos sin retorno
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public void saludar() {
        System.out.println("¡Hola! Soy " + nombre);
    }
}