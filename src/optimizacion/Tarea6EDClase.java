package optimizacion;

/**
 *
 * @author Beatriz
 */
public class Tarea6EDClase {

    public void aplicarDescuento(double precioProducto, int numProductos) {
        double total;
        if (numProductos > 3) {
            precioProducto -= 5;
        }
        if (numProductos != 0) {
            total = precioProducto * DESCUENTO_MENOR;
            mensajeRetorno(total);
        } else {
            total = precioProducto * DESCUENTO_MAYOR;
            mensajeRetorno(total);
        }
    }
    private static final double DESCUENTO_MAYOR = 0.95;
    private static final double DESCUENTO_MENOR = 0.8;

    private void mensajeRetorno(double total) {
        System.out.println("El total a pagar es:" + total);
        System.out.println("Enviado");
    }
}   
