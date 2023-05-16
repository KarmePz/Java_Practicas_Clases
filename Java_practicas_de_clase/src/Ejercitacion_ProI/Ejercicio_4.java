package Ejercitacion_ProI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*4. Elaborar un algoritmo para cargar 50 Nombres en una lista dinámica,
manteniendo en la misma un orden alfabético.*/
public class Ejercicio_4 {
    private static Scanner sc = new Scanner(System.in);
    public static void  main(String[] args) {

        List<String> lista = new ArrayList();

        CargarNombresLD(lista);
        MostrarNombresLD(lista);
        OrdenarAlfabeticamenteLD(lista);

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
}
