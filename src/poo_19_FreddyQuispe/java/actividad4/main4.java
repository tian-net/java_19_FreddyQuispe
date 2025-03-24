package actividad4;

public class main4 {
    public static void main(String[] args) {
        coche coche = new coche();
        coche.marca = "Toyota";
        coche.velocidad = 60;

        coche.actualizarMarca("Honda");
        coche.frenar(20);
        coche.mostrarEstado();
    }
}
