import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Ejercicio6 ejercicio6 = new Ejercicio6();
        Scanner sc = new Scanner(System.in);
        int respuesta;

        do {
            System.out.println("MENU");
            System.out.println("1. Mostrar números del 1 al 10");
            System.out.println("2. Mostrar números pares del 1 al 20");
            System.out.println("0. Salir");
            respuesta = sc.nextInt();
            sc.nextLine();

            switch (respuesta){
                case 1:
                    System.out.println();
                    System.out.println("Mostrar numeros del 1 al 10");
                    for (int i = 1; i <= 10; i++){
                        System.out.print(i + " ");
                    }
                    System.out.println();
                    System.out.println();
                    ejercicio6.mostrarNumeros();
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Mostrar numeros pares del 1 al 20");
                    for (int i = 1; i <= 20; i++){
                        if (i % 2 == 0){
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                    System.out.println();
                    break;
            }
        }while(respuesta != 0);


    }

    public void mostrarNumeros(){
        for (int i = 1; i <= 10; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
