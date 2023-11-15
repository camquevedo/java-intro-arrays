import java.util.Arrays;

public class NamessArray {
    //registro de un comentario añadido desde localg

    public static void main(String[] args) {
        // 1. Crear un array de cadenas llamado `nombres` con un tamaño de 5.
        String[] names = new String[8];

        // 2. Inicializar el array con los nombres "Ana", "Carlos", "Laura", "José" y "Sofía".
        // y agregar otros 3 nombres
        names[0] = "Ana";
        names[1] = "Carlos";
        names[2] = "Laura";
        names[3] = "José";
        names[4] = "Sofía";
        names[5] = "Camilo";
        names[6] = "Sofía";
        names[7] = "Sofía";

        // 3. Imprimir los elementos del array.
        System.out.print("Nombres: ");
        for (String name : names) {
            System.out.print(names + " ");
        }
        System.out.println();

        // 4. Imprimir los nombres que empiezan con la letra "A".
        System.out.print("Nombres que empiezan con 'A': ");
        for (String name : names) {
            if (name.startsWith("A")) {
                System.out.print(name + " ");
            }
        }
        System.out.println();

        // 5. Ordenar e imprimir los nombres en orden alfabético.
        Arrays.sort(names);
        System.out.print("Nombres ordenados alfabéticamente: ");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
    }
}

