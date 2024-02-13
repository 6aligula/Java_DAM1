import java.util.*;
import daw.com.*;

public class AppVideoClub {

    private static Scanner scanner = new Scanner(System.in);

    /*El buen metodo */
    // private static Map<Integer, Cliente> clientes = new HashMap<>();
    // private static Map<String, ProductoVC> productos = new HashMap<>();

    /*El metodo de tu profe */
    // Suponiendo que sabes cuántos clientes y productos vas a tener
    private static Cliente[] arrayClientes = new Cliente[10]; // para almacenar hasta 10 clientes
    private static ProductoVC[] arrayProductos = new ProductoVC[10]; // para almacenar hasta 10 productos


    public static void main(String[] args) {
        boolean salir = false;
        while (!salir) {
            mostrarMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consume el final de línea que no lee nextInt()
            switch (opcion) {
                case 1:
                    listarProductosSinAlquilar();
                    break;
                case 2:
                    añadirProducto();
                    break;
                case 3:
                    mostrarFichaProducto();
                    break;
                case 4:
                    listarClientes();
                    break;
                case 5:
                    añadirCliente();
                    break;
                case 6:
                    mostrarFichaCliente();
                    break;
                case 7:
                    alquilarProducto();
                    break;
                case 8:
                    devolverProducto();
                    break;
                case 9:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no reconocida. Intente de nuevo.");
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("1. Listar productos sin alquilar");
        System.out.println("2. Añadir producto");
        System.out.println("3. Mostrar ficha de producto");
        System.out.println("4. Listar clientes");
        System.out.println("5. Añadir cliente");
        System.out.println("6. Mostrar ficha de cliente");
        System.out.println("7. Alquilar producto");
        System.out.println("8. Devolver producto");
        System.out.println("9. Salir");
    }

    private static void listarProductosSinAlquilar() {
        // ... tu lógica para listar los productos sin alquilar
    }

    private static void añadirProducto( ) {
        for (int i = 0; i < arrayProductos.length; i++) {
            if (arrayProductos[i] == null) { // Encontrar el primer espacio vacío en el array
                // Suponiendo que quieres capturar los datos del producto desde la consola:
                System.out.println("Introduzca el título del producto:");
                String titulo = scanner.nextLine(); // Leer el título
    
                System.out.println("Es una película o videojuego? (P/V):");
                boolean tipo = scanner.nextLine().equalsIgnoreCase("P") ? ProductoVC.PELICULA : ProductoVC.VIDEOJUEGO;
    
                System.out.println("Introduzca el PVP del producto:");
                float pvp = scanner.nextFloat();
    
                System.out.println("Introduzca el plazo del alquiler del producto:");
                int plazo = scanner.nextInt();
    
                // Crear el nuevo producto y añadirlo al array
                arrayProductos[i] = new ProductoVC(titulo, tipo, pvp, plazo, false);
                scanner.nextLine(); // Limpiar el buffer del scanner
                break; // Salir del bucle una vez que el producto ha sido añadido
            }
        }
    }
    

    private static void mostrarFichaProducto() {
        System.out.println("Lista de todos los productos:");
        for (ProductoVC producto : arrayProductos) {
            if (producto != null) { // Si hay un producto en la posición del array
                producto.mostrarDatos(); // Mostrar los datos del producto
            }
        }
        System.out.println("\n");
    }
    

    private static void listarClientes() {
        // ... tu lógica para listar los clientes
    }

    private static void añadirCliente() {
        // ... tu lógica para añadir un cliente
    }

    private static void mostrarFichaCliente() {
        // ... tu lógica para mostrar la ficha de un cliente
    }

    private static void alquilarProducto() {
        // ... tu lógica para alquilar un producto
    }

    private static void devolverProducto() {
        // ... tu lógica para devolver un producto
    }
}
