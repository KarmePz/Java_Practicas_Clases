package Ejercicio2_38_BaezCarmelo;

/*import Ejercicio2_38_BaezCarmelo.Libro;*/

import java.util.Scanner;

public class pruebaLibro {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\n************Prueba de Instancia con y sin parametros especificados*********************");

                                        //Metodo constructor por parametros:
        Libro libro1 = new Libro("La ballena roja", "Mariano Schecopar", 8, 3);
        System.out.println("\nEl libro 1 tiene los siguientes datos: \n"+libro1.toString());

                                        //Metodo constructor por defecto
        Libro libro2 = new Libro();
        System.out.println("\nEl libro 2 tiene los siguientes datos: \n " + libro2.toString());

                                        //Prueba de Setters
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


        System.out.println("\n*****************Prueba de metodo PRESTAMO ********************************************");
                                        //Prueba de metodo prestamo y getters
        System.out.println("Ingrese la cantidad de ejemplares a prestar del libro "+libro1.getTitulo()+" :");
        int ejemplaresP2 = sc.nextInt();

        boolean prestamo_libro1 = libro1.prestamo(ejemplaresP2);
        if (prestamo_libro1) {
            System.out.println("\nSe prestaron unos  " + libro1.getNumejemplaresprestados() + " libros de titulo '"+libro1.getTitulo()+"' en total");
        } else {
            System.out.println("\nNo se efectuo prestamo");
        }

        System.out.println("\n*****************Prueba de metodo DEVOLUCION*******************************************");
                                        //Prueba de metodo devolucion y getters
        //ingreso de datos
        System.out.println("Ingrese la cantidad de ejemplares a devolver del libro "+libro1.getTitulo()+" :");
        int ejemplaresD = sc.nextInt();

        boolean devolucion_libro1 = libro1.devolucion(ejemplaresD);
        if (devolucion_libro1) {
            System.out.println("\nSe devolvieron libros. El total de ejemplares prestados es ahora de  " + libro1.getNumejemplaresprestados() + " libros de titulo '"+libro1.getTitulo()+".");
        } else {
            System.out.println("\nNo se efectuo la devolucion correctamente");
        }

        System.out.println("\n*****************Prueba de metodo heredado toString()**********************************");
        System.out.println("\nEl libro 1 tiene los siguientes datos: \n"+libro1.toString());
        System.out.println("\nEl libro 2 tiene los siguientes datos: \n "+libro2.toString());


    }
}

