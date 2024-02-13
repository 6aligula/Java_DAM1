import java.util.ArrayList;
import java.util.List;

public class Videoclub {
    private List<Producto> productos;

    // Constructor
    public Videoclub() {
        this.productos = new ArrayList<>();
    }

    // Método para agregar un producto al inventario
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // Método para alquilar un producto
    public void alquilarProducto(String titulo) {
        for (Producto producto : productos) {
            if (producto.getTitulo().equalsIgnoreCase(titulo) && !producto.isAlquilado()) {
                producto.setAlquilado(true);
                System.out.println("Producto alquilado con éxito: " + titulo);
                return;
            }
        }
        System.out.println("Producto no disponible para alquiler: " + titulo);
    }

    // Método para devolver un producto
    public void devolverProducto(String titulo) {
        for (Producto producto : productos) {
            if (producto.getTitulo().equalsIgnoreCase(titulo) && producto.isAlquilado()) {
                producto.setAlquilado(false);
                System.out.println("Producto devuelto con éxito: " + titulo);
                return;
            }
        }
        System.out.println("Error al intentar devolver el producto: " + titulo);
    }

    // Método para listar los productos disponibles para alquiler
    public void listarProductosDisponibles() {
        System.out.println("Productos disponibles para alquiler:");
        for (Producto producto : productos) {
            if (!producto.isAlquilado()) {
                producto.imprimirInfo();
            }
        }
    }
}

