import java.util.ArrayList;
import java.util.Scanner;

public class AppPokemon {
    private static ArrayList<Pokemon> pokemons = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Insertar 4 Pokemons
        insertarPokemon(new Pokemon("Pika", "Ash", 100));
        insertarPokemon(new Pokemon("Char", "Misty", 150));
        insertarPokemon(new Pokemon("Bulb", "Ash", 120));
        insertarPokemon(new Pokemon("Squirt", "Brock", 110));

        // Mostrar Pokemons de un dueño
        System.out.print("Introduce el nombre del dueño para ver sus Pokemons: ");
        String dueno = scanner.nextLine();
        mostrarPokemonsDueno(dueno);

        // Modificar datos de un Pokemon
        System.out.print("Introduce el nombre del Pokemon a modificar: ");
        String nombreModificar = scanner.nextLine();
        System.out.print("Nuevo dueño: ");
        String nuevoDueno = scanner.nextLine();
        System.out.print("Nuevo poder: ");
        int nuevoPoder = Integer.parseInt(scanner.nextLine());
        modificarPokemon(nombreModificar, nuevoDueno, nuevoPoder);

        // Eliminar un Pokemon
        System.out.print("Introduce el nombre del Pokemon a eliminar: ");
        String nombreEliminar = scanner.nextLine();
        eliminarPokemon(nombreEliminar);
    }

    public static void insertarPokemon(Pokemon pokemon) {
        if (pokemons.size() < 10 && pokemons.stream().noneMatch(p -> p.getNombre().equalsIgnoreCase(pokemon.getNombre()))) {
            pokemons.add(pokemon);
            System.out.println("Pokemon " + pokemon.getNombre() + " agregado correctamente.");
        } else {
            System.out.println("No se pudo agregar el Pokemon. Ya existe uno con ese nombre o se alcanzó el máximo permitido.");
        }
    }

    public static void mostrarPokemonsDueno(String dueno) {
        pokemons.stream()
                .filter(p -> p.getDueno().equalsIgnoreCase(dueno))
                .forEach(System.out::println);
    }
    //simplificado
    // public static void mostrarPokemonsDueno(String dueno) {
    //     for (Pokemon pokemon : pokemons) {
    //         if (pokemon.getDueno().equalsIgnoreCase(dueno)) {
    //             System.out.println(pokemon);
    //         }
    //     }
    // }
    

    public static void modificarPokemon(String nombre, String nuevoDueno, int nuevoPoder) {
        Pokemon pokemon = pokemons.stream()
                .filter(p -> p.getNombre().equalsIgnoreCase(nombre))
                .findFirst()
                .orElse(null);

        if (pokemon != null) {
            pokemon.setDueno(nuevoDueno);
            pokemon.setPoder(nuevoPoder);
            System.out.println("Pokemon " + nombre + " modificado correctamente.");
        } else {
            System.out.println("No se encontró el Pokemon con nombre " + nombre);
        }
    }

    public static void eliminarPokemon(String nombre) {
        if (pokemons.removeIf(p -> p.getNombre().equalsIgnoreCase(nombre))) {
            System.out.println("Pokemon " + nombre + " eliminado correctamente.");
        } else {
            System.out.println("No se encontró el Pokemon con nombre " + nombre);
        }
    }
}
