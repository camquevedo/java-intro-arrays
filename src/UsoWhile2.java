import java.util.Scanner;
// solicite por consola un número
// y que siga solicitando números
// hasta que digite un numero negativo
// y que al final indique que se acaba el program
public class UsoWhile2 {
    public static void main(String[] args) {
        int numero = 0;
        Scanner consola = new Scanner(System.in);
        while (numero >= 0) {
            System.out.print("Indique un numero: ");
            numero = consola.nextInt();
        }
        consola.close();
        System.out.println("-- FIN DEL PROGRAMA --");
    }
}
