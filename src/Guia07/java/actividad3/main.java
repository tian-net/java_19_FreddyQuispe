package actividad3;

public class main {
    public static void main(String[] args) {
        Producto producto = new Producto();
        producto.nombre = "Laptop";
        producto.precio = 899.99;

        // Usar métodos con retorno
        double totalCompra = producto.calcularPrecioTotal(3);
        double precioConDescuento = producto.aplicarDescuento(15);

        System.out.println("Producto: " + producto.nombre);
        System.out.println("Precio total por 3 unidades: S/." + totalCompra);
        System.out.println("Precio con 15% de descuento: S/." + precioConDescuento);
    }
}
