import java.util.Scanner;
// solicite por consola un numero
// y que por medio de un ciclo while haga la suma desde 1
// consecutivamente hasta el numero digitado por el usuario,
// al final mostrar mensaje indicando la sumatoria total.
public class UsoWhile1 {
    public static void main(String[] args) {
        int suma = 0, i = 0, numeroFinal = 0;

        Scanner consola = new Scanner(System.in);
        System.out.print("Indique un numero: ");
        numeroFinal = consola.nextInt();
        consola.close();

        while (i <= numeroFinal) {
            suma += i;
            i++;
        }

        System.out.println("La suma es: " + suma);
    }
}
