import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int divisores = 0;

        System.out.println("Escribe un número entero");
        int num = sc.nextInt();
        sc.nextLine();

        if (num == 0){
            System.out.println("ERROR. El número no puede ser 0.");
        }else {
            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <= num; j++) {
                    if (i%j==0) {
                        divisores++;
                    }
                }
                if (divisores == 2) {
                    System.out.print(i + " ");
                }
                divisores = 0;
            }
        }
    }
}
