public class Arrays {
    public static void main(String[] args) {
        // Ejemplo de vector T y su tamaño n
        int[] T = {1, 4, 5, 2, 10, 20, 30, 40};
        int n = T.length;

        // Comprobar si el tamaño es par
        if (n % 2 == 0) {
            // Invertir la mitad de los elementos
            System.out.println("El tamaño es par");
            for (int i = 0; i < n / 2; i++) {
                // Intercambiar elemento i con elemento (n/2 + i)
                int temp = T[i];
                System.out.println("temp = " + temp);
                T[i] = T[n / 2 + i];
                System.out.println("T[" + i + "] = " + T[i]);
                T[n / 2  + i] = temp;
            }
        }

        // Imprimir el vector resultante
        for (int i = 0; i < n; i++) {
            System.out.print(T[i] + " ");
        }
    }

}