import java.text.MessageFormat;
import java.util.Objects;
import java.util.Scanner;
public class Ejercicio1 {
    // De los siguientes array decir el índice correspondiente para
    // encontrar el valor según lo dicho en las indicaciones

    public static String foundValue(int value, int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == value) return i + "";
        }
        return " no está";
    }
    public static String foundString(char value, char[][][] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                for (int k = 0; k < arreglo[i][j].length; k++) {
                    if (arreglo[i][j][k] == value) {
                        return i + "," + j + "," + k;
                    }
                }
            }
        }
        return "no está";
    }
    public static void main(String[] args) {
        int[] numeros = {55, 72, 37, -6, 84, -91, 159, 0, 15};
        char[][][] caracteres = {
                {{'J','*'},{'9','2'},{'/','z'}},
                {{'#','Z'},{'3','v'},{'h','M'}}
        };

        // Diga el índice para encontrar a -91
        System.out.println("El numero -91\t esta en el index: " + foundValue(-91, numeros));
        // Diga el índice para encontrar a 15
        System.out.println("El numero 15\t esta en el index: " + foundValue(15, numeros));
        // Diga el índice para encontrar a 37
        System.out.println("El numero 37\t esta en el index: " + foundValue(37, numeros));

        // ---------------------------------------------------------
        System.out.println();
        // Diga el índice para encontrar a #
        System.out.println("El numero '#'\t esta en el index: " + foundString('#', caracteres));
        // Diga el índice para encontrar a 9
        System.out.println("El numero '9'\t esta en el index: " + foundString('9', caracteres));
        // Diga el índice para encontrar a z
        System.out.println("El numero 'z'\t esta en el index: " + foundString('z', caracteres));
        // Diga el índice para encontrar a Z
        System.out.println("El numero 'Z'\t esta en el index: " + foundString('Z', caracteres));
        // Diga el índice para encontrar a M
        System.out.println("El numero 'M'\t esta en el index: " + foundString('M', caracteres));
    }
}
