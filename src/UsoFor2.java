import java.util.Scanner;

public class UsoFor2 {
    // solicite por consola:
    // - numero de notas a capturar (n),
    // - n cantidad de notas
    // al final de digitar, se debe imprimir en consola
    // - la lista de notas digitadas
    // - y el promedio de las mismas
    // (las notas pueden ser valores enteros o decimales).
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Indique cantidad de notas: ");
        int notesQuantity = consola.nextInt();
        while (notesQuantity > 20) {
            System.out.println("Nah, eso son muchas notas por calificar...");
            System.out.print("Indique otro numero (menor a 20): ");
            notesQuantity = consola.nextInt();
        }
        double[] notes = new double[20];
        double promedio = 0;

        for (int i = 0; i <notesQuantity ; i++) {
            System.out.print("Indique nota " + (i+1) + ": ");
            notes[i] = consola.nextInt();
        }
        consola.close();

        for (int i = 0; i <notesQuantity ; i++) {
            System.out.println("Nota " + i + ":\t " + notes[i]);
            promedio += notes[i];
        }
        promedio /= notesQuantity;
        promedio = (double) Math.round(promedio * 100) / 100;

        System.out.print("-- Promedio: " + promedio + " --");
        System.out.println("-- FIN DEL PROGRAMA --");
    }
}
