import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un número entero");
        int n = sc.nextInt();
        sc.nextLine();

        // 2. Bucle principal para las filas (desde 1 hasta n)
        for (int i = 1; i <= n; i++) {

            // 3. Primer bucle anidado: imprime los espacios en blanco
            // En cada fila hay (n - i) espacios
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // 4. Segundo bucle anidado: imprime los asteriscos
            // En cada fila hay números impares de asteriscos: (2 * i - 1)
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // 5. Salto de línea al terminar de imprimir los espacios y asteriscos de la fila
            System.out.println();
        }

    }
}
