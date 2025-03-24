package actividad5;

public class main5 {
    public static void main(String[] args) {
        Libro libro = new Libro("Romeo y Julieta", "William Shakespeare");

        System.out.println(libro.obtenerInfo());
        System.out.println("¿Es un clásico? " + libro.esClasico());
    }
}
