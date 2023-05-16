package Ejercitacion_ProI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ejercicio_5 {
    private static Scanner sc = new Scanner(System.in);
    public static void  main(String[] args) {

        List<String> lista = new ArrayList();

        CargarNombresLD(lista);
        MostrarNombresLD(lista);
        System.out.println("\nPresione Enter para continuar...");
        sc.nextLine();
        OrdenarAlfabeticamenteLD(lista);
        System.out.println("\nPresione Enter para continuar...");
        sc.nextLine();
        EliminarNombreLD(lista);
    }
    public static void CargarNombresLD(List<String> listaf) {
        int i = 0;
        String aux, opcion;
        //for (i = 0; i <MAX; i++){
        do{
            System.out.print(" Ingrese el elemento numero " + i + " de la lista: " );
            i++;
            String nombre = sc.nextLine();
            listaf.add(nombre);
            aux = nombre;
            if (aux.length() == 0){
                System.out.print(" Desea continuar S/N: " );
                opcion = sc.nextLine();
                if(opcion.equals("S")||opcion.equals("s")) aux=" ";
                else {listaf.remove(i-1);};
            }
        }while(aux.length()!= 0 &&  i<50);
    }
    public static void  MostrarNombresLD(List<String> listaf){
        System.out.println("\nLista Dinamica ingresada de tamaño : "+ listaf.size());
        for(String nombres: listaf){
            System.out.print(" (" + nombres+ ")");
        }
    }
    public static void  OrdenarAlfabeticamenteLD(List<String> listaf){
        Collections.sort(listaf);
        System.out.println("\n\nLista Dinamica Alfabeticamente ordenada");
        MostrarNombresLD(listaf);

    }
    public static void EliminarNombreLD(List<String> listaf){
        int i;
        String aux;
        System.out.print("Ingrese el nombre a eliminar: ");
        aux = sc.nextLine();
        for (i=0; i<listaf.size(); i++){
            if (aux.equals(listaf.get(i))){
                listaf.remove(i);
                i--;
            }
        } if (listaf.size() == 0) {
            System.out.print("El Arreglo quedo vacio");
        } else {
            MostrarNombresLD(listaf);
        }
    }
}
