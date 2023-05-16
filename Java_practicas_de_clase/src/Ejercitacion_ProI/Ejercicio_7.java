package Ejercitacion_ProI;

import java.util.ArrayList;
import java.util.List;

//7. Elaborar un algoritmo que dadas dos listas haga la unión de las
//mismas en una tercera.Haga una versión para una lista con enlaces
//implícitos (arreglo) y otra con enlaces explícitos.
public class Ejercicio_7 {

    public static void main(String[] args){

        //enlaces implicitos(Arreglos)
        int[] lista1 = {104,25,36,7,8,9,10};
        int[] lista2 = {34,82,78,26};
        int[] lista3;
        lista3 = union(lista1,lista2);
        MostrarArreglo(lista3);
        //enlaces Explicitos
        List<Integer> Lista1 = new ArrayList<>();
        Lista1.add(104);Lista1.add(36);  Lista1.add(25);  Lista1.add(7);  Lista1.add(12);  Lista1.add(9);//Lista1 = 104,36,25,7,12,9
        List<Integer> Lista2 = new ArrayList<>();
        Lista2.add(82);Lista2.add(34);  Lista2.add(78);  Lista2.add(26);Lista2.add(12);//Lista 2 = 82,34,78,26
        List<Integer> Lista3 = UnionLD(Lista1,Lista2);
        MostrarLista(Lista3);
    }
    //Metodos para Enlaces Implicitos(Arreglos)
    public static void MostrarArreglo(int[] Array){
        for(int datos: Array){
            System.out.print(" "+datos);
        }
    }

    public static int [] union(int[] List1, int[] List2){
        int i,j;
        int[] union = new int[List1.length+List2.length];
        for (i=0; i<List1.length;i++){
            union[i] = List1[i];
        }
        for (j=0; j<List2.length;j++){
            union[j+i] = List2[j];
        }
        return union;
    }
    public static List<Integer> UnionLD(List<Integer> List1, List<Integer> List2){
        int i,j;
        List<Integer> union = new ArrayList<>();
        for (i=0; i<List1.size();i++){

            union.add(List1.get(i));
        }
        for (j=0; j<List2.size();j++){
            union.add(List2.get(j));
        }
        return union;
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
