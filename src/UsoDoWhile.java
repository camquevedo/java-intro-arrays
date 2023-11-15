import java.util.Scanner;

public class UsoDoWhile {
    // solicite por consola un número y que imprima los números pares
    // con un límite hasta el numero ingresado por el usuario,
    // haciendo uso de un ciclo do - while
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Indique un numero: ");
        int numero = consola.nextInt();
        consola.close();

        int i = 1  ;
        do {
            if (i % 2 == 0)
                System.out.println(i);
            i++;
        } while (i <= numero);
        System.out.println("-- FIN DEL PROGRAMA --");
    }
}
