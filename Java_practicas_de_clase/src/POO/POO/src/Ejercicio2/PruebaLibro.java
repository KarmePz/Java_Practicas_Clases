package Ejercicio2;

import Ejercicio1.Cuenta;

import java.util.Scanner;

public class PruebaLibro {
    public static Scanner sc = new Scanner(System.in);
    public static int contadoraux = 0;
    public static void main(String[] args){
        boolean ejecutar = true;//controla la finalización del programa.


        //Instancia de dos libros nuevos.
        Libro libro1 = new Libro();
        Libro libro2 = new Libro();

        //Carga de Valores para los dos libros.
        CargarLibro(libro1);
        CargarLibro(libro2);


        //Menú
        do {
            String opcion;
            System.out.println("\n------------------MENU--------------------");
            System.out.println("Ingrese su opcion: ");
            System.out.println("A: Volver a ingresar libros:");
            System.out.println("B: Mostrar datos de libro 1");
            System.out.println("C: Mostrar datos de libro 2");
            System.out.println("D: Comparar páginas de los libros");



            System.out.print("\tSu opcion:");
            opcion = sc.next();
            opcion = opcion.toLowerCase();





            switch (opcion){
            //CAARGA DE LIBROS
                case "a":
                    contadoraux = 0;
                    sc.nextLine();
                    CargarLibro(libro1);
                    CargarLibro(libro2);
                    break;



            //Muestra de datos
                case "b":
                    System.out.println("\n Datos del libro 1: "+libro1.toString());
                    break;

                case "c":
                    System.out.println("\n Datos del libro 2: "+libro2.toString());
                    break;





            //Comparación de Páginas entre los dos libros.
                case "d":
                    if(libro1.getNumPag()> libro2.getNumPag()){
                        System.out.println("El libro 1 tiene mas paginas que el libro 2: "
                                            +"\n libro 1: "+libro1.getNumPag()+
                                            "\nlibro 2 : "+libro2.getNumPag());
                    }else if(libro1.getNumPag()<libro2.getNumPag()){
                        System.out.println("El libro 2 tiene mas paginas que el libro 1: "
                                +"\n libro 2: "+libro2.getNumPag()+
                                "\nlibro 1 : "+libro1.getNumPag());
                    }else{
                        System.out.println("Los dos libros tienen la misma cantidad de páginas: "
                                +"\n libro 1: "+libro1.getNumPag()+
                                "\nlibro 2 : "+libro2.getNumPag());
                    }
                    break;


            //Control de fin de programa.
                default:
                    ejecutar = false;
                    break;
            }

        }while(ejecutar);
        System.out.println("PROGRAMA FINALIZADO");
    }
    public static void CargarLibro(Libro libro){
        contadoraux++;
        //Ingreso de Valores para los dos libros.
        System.out.println("--------LIBRO "+contadoraux+ "----------------");
        System.out.print("Ingrese el nombre del autor del libro:");
        String Autor = sc.nextLine();
        libro.setAutor(Autor);
        System.out.print("Ingrese el titulo  del libro:");
        String titulo = sc.nextLine();
        libro.setTitulo(titulo);
        System.out.print("Ingrese el ISBN del libro:");
        String ISBN = sc.nextLine();
        libro.setISBN(ISBN);
        System.out.print("Ingrese la cantidad de páginas del libro:");
        int numPag = sc.nextInt();
        libro.setNumPag(numPag);
        sc.nextLine();//consume caracter nueva linea pendiente

    }
}
