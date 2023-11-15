import java.util.Scanner;

public class UsoFor {
    // solicite por consola un número y
    // que imprima ese numero multiplicado desde 1 hasta 12 en forma de lista
    // y donde se vea de forma explicita la multiplicación impresa con su resultado
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Indique un numero: ");
        int numero = consola.nextInt();
        consola.close();

        for (int i = 1; i <= 12; i++) {
            System.out.println(numero + " x " + i + " =\t " + numero * i);
        }
        System.out.println("-- FIN DEL PROGRAMA --");
    }
}
