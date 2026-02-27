import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int otraSuma;

        System.out.println("Escribe un número entero");
        int num = sc.nextInt();
        sc.nextLine();

        if (num == 0){
            System.out.println("ERROR. El número no puede ser 0");
        } else {
            for (int i = 1; i <= num; i++) {
                suma += i;
            }

            otraSuma = num*(num+1)/2;

            System.out.println("La suma es: " + suma);
            System.out.println("La otra suma es: " + otraSuma);
        }
    }
}
