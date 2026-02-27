import java.util.Scanner;

public class Ejercicio5 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean acertado = false;
        int intentos = 3;
        int contador = 0;
        String contrasenia = "Hola!";

        /*
        for (int i = 1; i <= intentos; i++) {
            System.out.println("Escribe la contraseña");
            String respuesta = sc.nextLine();
            if (respuesta.equals(contrasenia)) {
                System.out.println("Contraseña correcta");
                i = 4;
            } else {
                System.out.println("Contraseña incorrecta");
                if (intentos - i != 0){
                    System.out.println("Te quedan " + (intentos-i) + " intentos");
                } else {
                    System.out.println("No te quedan intentos");
                }
            }
        }*/

        while ((contador < intentos) && (!acertado)) {
            System.out.println("Escribe la contraseña");
            String respuesta = sc.nextLine();
            if (respuesta.equals(contrasenia)) {
                System.out.println("Contraseña correcta");
                acertado = true;
            } else {
                System.out.println("Contraseña incorrecta");
                contador++;
                if (intentos - contador != 0){
                    System.out.println("Te quedan " + (intentos-contador) + " intentos");
                } else {
                    System.out.println("No te quedan intentos");
                }
            }
        }
        System.out.println("Has acertado en " + contador + " intentos");
    }
}
