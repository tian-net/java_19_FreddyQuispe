package actividad4;

public class coche {
    // Atributos
    public String marca;
    public int velocidad;

    // Métodos con parámetros
    public void frenar(int decremento) {

        velocidad -= decremento;
    }

    public void actualizarMarca(String nuevaMarca) {

        marca = nuevaMarca;
    }

    public void mostrarEstado() {

        System.out.println("Marca: " + marca + " | Velocidad: " + velocidad + " km/h");
    }

}
