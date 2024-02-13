import java.util.Scanner;
public class Buscar {

    public static void main(String[] args) {

        int[][] buscar = {
            {12, 22, 34, 77, 93},
            {10, 5, 1, 43, 60, 70, 65, 80},
            // Puedes agregar más filas aquí
        };
        int num;
        String respuesta;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime un número");
        num = scanner.nextInt();

        respuesta = buscarNumero(buscar, num);
        System.out.println(respuesta);
        scanner.close();

    }

    private static String buscarNumero(int[][] buscar, int num) {
        for (int i = 0; i < buscar.length; i++) {
            for (int j = 0; j < buscar[i].length; j++) {
                System.out.println("\n i = " + i + " j = " + j);
                System.out.println("\n longitud buscar[i] = " + buscar[i].length);
                //System.out.println("\n longitud buscar[j]= " + buscar[j].length);
                if (buscar[i][j] == num) {
                    return "Numero encontrado en la posición: [" + i + "][" + j + "]";
                }
            }
        }
        return "Error numero no encontrado";
    }
}