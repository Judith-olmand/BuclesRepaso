public class Ejercicio1 {
    public static void main(String[] args) {
        int contador = 0;

        for (int i = 1; i <= 200; i++) {
            if ((i %3 == 0 ) || (i %5 == 0 )){
                contador++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Hay un total de " + contador + " múltiplos");
    }
}
