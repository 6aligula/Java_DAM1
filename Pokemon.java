public class Pokemon {
    private String nombre;
    private String dueno;
    private int poder;

    // Constructor
    public Pokemon(String nombre, String dueno, int poder) {
        this.nombre = nombre;
        this.dueno = dueno;
        this.poder = poder;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    @Override
    public String toString() {
        return "Pockemon{" +
                "nombre='" + nombre + '\'' +
                ", dueno='" + dueno + '\'' +
                ", poder=" + poder +
                '}';
    }
}
