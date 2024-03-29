package Ejercitacion_ProI;

import java.util.ArrayList;
import java.util.List;

//Elaborar un algoritmo que dadas dos listas concatene las mismasen
//una tercera. Haga una versión para una lista con enlaces implícitos
//(arreglo) y otra con enlaces explícitos.
public class Ejercicio_6 {
    public static void main(String[] args){

        //enlaces implicitos(Arreglos)
        int[] lista1 = {104,25,36,7,8,9,10};
        int[] lista2 = {34,82,78,26};
        int[] lista3 = {11,111,1111};
        int[] ArregloConcatenado = Concatenacion(lista1,lista2,lista3);
        MostrarArreglo(ArregloConcatenado);
        //enlaces Explicitos
        List<Integer> Lista1 = new ArrayList<>();
        Lista1.add(104);Lista1.add(36);  Lista1.add(25);  Lista1.add(7);  Lista1.add(12);  Lista1.add(9);
        List<Integer> Lista2 = new ArrayList<>();
        Lista2.add(82);Lista2.add(34);  Lista2.add(78);  Lista2.add(26);
        List<Integer> Lista3 = new ArrayList<>();
        Lista3.add(1000);Lista3.add(100);  Lista3.add(0);  Lista3.add(100);  Lista3.add(1000);

        List<Integer> Listaconcatenada = ConcatenacionLD(Lista1,Lista2,Lista3);
        MostrarLista(Listaconcatenada);
    }
    //Metodos para Enlaces Implicitos(Arreglos)
    public static void MostrarArreglo(int[] Array){
        for(int datos: Array){
            System.out.print(" "+datos);
        }
    }

    public static int [] Concatenacion(int[] List1, int[] List2, int[] List3){
        int i;
        int[] Concatenacion = new int[List1.length+List2.length+ List3.length];
        for (i=0; i<List3.length;i++){
            Concatenacion[i] = List3[i];
        }
        for (i=0; i<List2.length;i++){
                Concatenacion[i+List3.length] = List2[i];
        }
        for (i=0; i<List1.length;i++){
            Concatenacion[i+List3.length+List2.length] = List1[i];
        }
        return Concatenacion;
    }

    //Metodos para Enlaces Explicitos
    public static List<Integer> ConcatenacionLD(List<Integer> List1,List<Integer> List2,List<Integer> List3){
        int i;
        List<Integer> Concatenacion = new ArrayList<>();

        for (i=0; i<List3.size();i++){
            Concatenacion.add(List3.get(i));
        }
        for (i=0; i<List2.size();i++){
            Concatenacion.add(List2.get(i));
        }
        for (i=0; i<List1.size();i++){
            Concatenacion.add(List1.get(i));
        }
        return Concatenacion;
    }


    public static void MostrarLista(List<Integer> Lista){

        System.out.println(" \nEnlaces Explicitos Con distintas Listas ");
        for(int datos: Lista){
            System.out.print(" " + datos);
        }
    }
}

