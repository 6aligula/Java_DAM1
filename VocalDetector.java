import java.util.Scanner;

public class VocalDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arreglo de vocales
        char[] vocales = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        int i = 3;
        char letraExtraida = vocales[i];
        System.out.println(letraExtraida);


        System.out.print("Ingrese una letra: ");
        String input = scanner.nextLine();

        // Comprueba si la entrada es una sola letra
        if (input.length() == 1) {
            char letra = input.charAt(0);
            boolean esVocal = false;

            // Recorre el arreglo de vocales usando un bucle while
            //int i = 0;
            while (i < vocales.length && !esVocal) {
                if (letra == vocales[i]) {
                    esVocal = true;
                }
                i++;
            }   

            if (esVocal) {
                System.out.println(letra + " es una vocal.");
            } else {
                System.out.println(letra + " no es una vocal.");
            }
        } else {
            System.out.println("Por favor, ingrese solo una letra.");
        }

        scanner.close();
    }
}
