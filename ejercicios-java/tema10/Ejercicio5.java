import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        ArrayList<Disco> album = new ArrayList<Disco>();

        Scanner s = new Scanner(System.in);

        int opcion;
        int opcionListado1;

        album.add(new Disco("GASA41", "Wim Mertens", "Maximazing the Audience", "instrumental", 50));
        album.add(new Disco("FGHQ64", "Metallica", "Black album", "hard rock", 46));
        album.add(new Disco("TYUI89", "Supersubmarina", "Viento de cara", "pop rock", 42));
        do {
            System.out.println("\n\nCOLECCIÓN DE DISCOS");
            System.out.println("===================");
            System.out.println("1. Listado");
            System.out.println("2. Nuevo disco");
            System.out.println("3. Modificar");
            System.out.println("4. Borrar");
            System.out.println("5. Salir");
            System.out.print("Introduzca una opción: ");
            opcion = Integer.parseInt(s.nextLine());
            
            switch (opcion) {
                case 1:
                        System.out.println("\nLISTADO\n=======");
                        System.out.println("1. Completo");
                        System.out.println("2. Por autor");
                        System.out.println("3. Por género");
                        System.out.println("4. En un rango de duración");
                        System.out.println("5. Menú principal");
                        System.out.print("Introduzca una opción: ");
                        opcionListado1 = Integer.parseInt(s.nextLine());
                        System.out.println(album);
               
                    break;
                case 2:
                        System.out.println("\nNUEVO DISCO\n===========");
                    
                break;
            }

        } while (opcion != 5);
    }
}