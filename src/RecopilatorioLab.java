import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class RecopilatorioLab {

    static int fruits_quantity;
    static String[] fruit_box;
    static Scanner consola;
    public static void main(String[] args) {
        consola = new Scanner(System.in);
        System.out.print("Indique cantidad de frutas a guardar: ");
        fruits_quantity = consola.nextInt();
        fruit_box = new String[fruits_quantity];

        int menuOption = 0;
        do {
            System.out.println(
                    """
                        
                        
                        \t1. Listar frutas.
                        \t2. Registrar fruta.
                        \t3. Remplazar fruta.
                        \t4. Eiminar fruta.
                        \t5. Buscar fruta.
                        \t6. ¡Quieres una fruta!
                        \t7. Salir
                    """
            );
            System.out.print("Indique opcion: ");
            menuOption = consola.nextInt();

            switch (menuOption) {
                case 1 -> ListFruits();
                case 2 -> RegisterFruit();
                case 3 -> ReplaceFruit();
                case 4 -> DeleteFruit();
                case 5 -> SearchFruit();
                case 6 -> WannaFruits();
                case 7 -> ExitMenu();
                default -> System.out.println("Opción no valida");
            }

        } while (menuOption != 7);
        //
        System.out.println();
        consola.close();
    }

    private static void ListFruits() {
        System.out.println("LISTADO de frutas: ");
        for ( int i = 0; i < fruit_box.length; i++ ) {
            System.out.println( "\t" + (i+1) + ". " + fruit_box[i]);
        }
    }

    private static void RegisterFruit() {
        System.out.print("Indique posicion de caja a REGISTRAR: ");
        int position = consola.nextInt();

        if ( fruit_box[position-1] == null) {
            System.out.print("Indique fruta a REGISTRAR: ");
            fruit_box[position-1] = consola.next();
        } else
            System.out.println("Ups... Ya habia una " + fruit_box[position] + " REGISTRADA.");
    }

    private static void ReplaceFruit() {
        System.out.print("Indique posicion de caja a REEMPLAZAR: ");
        int position = consola.nextInt();

        if ( fruit_box[position-1] != null) {
            System.out.print("Indique fruta a REEMPLAZAR: ");
            fruit_box[position-1] = consola.next();
        } else
            System.out.println("Ups... Nada por REEMPLAZAR.");
    }

    private static void DeleteFruit() {
        System.out.print("Indique posicion de caja a BORRAR: ");
        int position = consola.nextInt();

        if ( fruit_box[position] != null) {
            System.out.println("La fruta " + fruit_box[position] + " ha sido BORRADA");
            fruit_box[position] = null;
        } else
            System.out.println("Ups... Quizá se te adelantaron, ya estaba vacio. No ha sido BORRADO.");
    }

    private static void SearchFruit() {
        System.out.print("Indique fruta a BUSCAR: ");
        String searchedFruit = consola.next();
        for ( int i = 0; i < fruit_box.length; i++) {
            if (Objects.equals(fruit_box[i], searchedFruit)) {
                System.out.println("La fruta " + searchedFruit + " la encontramos en la posición " + (i+1));
                return;
            }
        }
        System.out.println("La fruta " + searchedFruit + " no apareción en nuestros registros. Pero se le consigue.");
    }

    private static void WannaFruits() {
        int randomIndex = 0;
        do {
            randomIndex = new Random().nextInt(fruits_quantity);
        } while (fruit_box[randomIndex] != null);
        System.out.println("Te regalo una " + fruit_box[randomIndex]);
    }

    private static void ExitMenu() {
        System.out.println("Te vas con una canasta de frutas con: ");
        for ( int i = 0; i < fruit_box.length; i++ ) {
            System.out.println( "\t" + (i+1) + ". " + fruit_box[i]);
        }
        System.out.println("-- ADIOS --");
    }
}
