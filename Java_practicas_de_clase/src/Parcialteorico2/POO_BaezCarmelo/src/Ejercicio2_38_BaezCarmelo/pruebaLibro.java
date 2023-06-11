package Ejercicio2_38_BaezCarmelo;

import Ejercicio2_38_BaezCarmelo.Libro;

import java.util.Scanner;

public class pruebaLibro {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        Libro libro1 = new Libro("La ballena roja", "Mariano Schecopar", 8, 0);
        System.out.println("\nEl libro 1 tiene los siguientes datos: \n"+libro1.toString());

        Libro libro2 = new Libro();
        System.out.println("\nEl libro 2 tiene los siguientes datos: \n " + libro2.toString());

        System.out.println("\nIngrese los datos del libro2 (titulo)(autor)(ejemplares totales)(ejemplares prestados): ");
        String nombre = sc.nextLine();String autor = sc.nextLine();int ejemplares = sc.nextInt();int ejemplaresP = sc.nextInt();
        libro2.setTitulo(nombre);
        libro2.setAutor(autor);
        libro2.setNumejemplares(ejemplares);
        if(ejemplaresP>ejemplares){
            libro2.setNumejemplaresprestados(ejemplares);
        }else{
            libro2.setNumejemplaresprestados(ejemplaresP);
        }

        boolean prestamo_libro1 = libro1.prestamo(4);
        if (prestamo_libro1 == true) {
            System.out.println("\nSe prestaron de unos  " + libro1.getNumejemplaresprestados() + " libros de titulo '"+libro1.getTitulo()+"' en total");
        } else {
            System.out.println("\nNo se puede prestar nada");
        }

        boolean devolucion_libro1 = libro1.devolucion(3);
        if (devolucion_libro1 == true) {
            System.out.println("\nSe devolvieron libros. El total de ejemplares prestados es ahora de  " + libro1.getNumejemplaresprestados() + " libros de titulo '"+libro1.getTitulo()+"' en total");
        } else {
            System.out.println("\nNo se efectuo la devolucion correctamente");
        }

        System.out.println("\nEl libro 1 tiene los siguientes datos: \n"+libro1.toString());
        System.out.println("\nEl libro 2 tiene los siguientes datos: \n "+libro2.toString());


    }
}

