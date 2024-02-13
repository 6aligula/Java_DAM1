import daw.com.Pantalla;

public class Ejercicios {
    public static void main(String[] args) {
        // Ejemplo de coeficientes del polinomio y punto x
        int[] coeficientes = { 5, 3, 2, 1 }; // Representa 5x^3 + 3x^2 + 2x + 1
        int x = 2; // El punto en el que queremos evaluar el polinomio

        int resultado = evaluarPolinomio(coeficientes, x);
        //System.out.println("El resultado del polinomio en x = " + x + " es: " + resultado);
        // Imprime el saludo en la consola
        Pantalla.escribirString("el loko");
    }

    public static String saludar(String nombre) {
        return "Hola " + nombre;
    }

    // Método para evaluar un polinomio dado sus coeficientes y un valor de x.
    public static int evaluarPolinomio(int[] coef, int x) {

        // Inicializa la suma total del polinomio a 0.
        int total = 0;

        // Calcula el grado del polinomio, que es la longitud del arreglo menos uno.
        int grado = coef.length - 1;

        // Bucle que recorre todos los coeficientes del polinomio.
        for (int i = 0; i <= grado; i++) {

            // Suma al total el coeficiente actual multiplicado por x elevado a la potencia
            // adecuada.
            total += coef[i] * Math.pow(x, grado - i);
        }

        // Retorna el valor total calculado del polinomio.
        return total;
    }

    
  
}