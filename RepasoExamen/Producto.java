public class Producto {
    private String titulo;
    private String tipo; // "pelicula" o "videojuego"
    private double precioAlquiler;
    private int plazoAlquiler; // en días
    private boolean alquilado;

    // Constructor
    public Producto(String titulo, String tipo, double precioAlquiler, int plazoAlquiler) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.precioAlquiler = precioAlquiler;
        this.plazoAlquiler = plazoAlquiler;
        this.alquilado = false; // Inicialmente, el producto no está alquilado
    }

    // Métodos getters y setters
    public String getTitulo() {
        return titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public int getPlazoAlquiler() {
        return plazoAlquiler;
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }

    // Método para imprimir información del producto
    public void imprimirInfo() {
        System.out.println("Titulo: " + titulo + ", Tipo: " + tipo + ", Precio Alquiler: " + precioAlquiler + ", Plazo Alquiler: " + plazoAlquiler + " días, Alquilado: " + (alquilado ? "Sí" : "No"));
    }
}
