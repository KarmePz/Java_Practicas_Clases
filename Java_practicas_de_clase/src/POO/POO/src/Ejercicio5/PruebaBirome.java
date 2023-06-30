package Ejercicio5;

import java.util.Scanner;

public class PruebaBirome {
    public static void main(String[] args){
        Birome birome = new Birome(20);
        Papel papel = new Papel("hola soy: ");

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese sus nombres a escribir en el papel:");
        String texto = sc.nextLine();

        birome.Escribir(texto, papel);

        System.out.println("\nPapel: "+papel.toString());


    }
}
