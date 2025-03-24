package actividad3;

public class Producto {
    // Atributos
    public String nombre;
    public double precio;

    // Métodos con valor de retorno
    public double calcularPrecioTotal(int cantidad) {
        return precio * cantidad;
    }

    public double aplicarDescuento(double porcentajeDescuento) {
        return precio * (1 - porcentajeDescuento / 100);
    }

}
