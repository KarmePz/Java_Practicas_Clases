package Ejercitacion_ProI;

import java.util.ArrayList;
import java.util.List;

//9. Elaborar un algoritmo que dadas dos listas ordenadas haga la fusión
//de las mismas en una tercera. Haga una versión para una lista con
//enlaces implícitos (arreglo) y otra con enlaces explícitos.
public class Ejercicio_9 {
    public static void main(String[] args) {
        //enlaces implicitos(Arreglos)
        int[] lista1 = {104, 52, 85, 25, 36, 7, 8, 9, 10};
        int[] lista2 = {36, 82, 78, 26, 7, 85, 104};
        int[] lista3;//85 36 7
        lista3 = Interseccion(lista1, lista2);
        MostrarArreglo(lista3);

        //enlaces Explicitos
        List<Integer> Lista1 = new ArrayList<>();
        Lista1.add(104);Lista1.add(52);Lista1.add(85);Lista1.add(8);Lista1.add(10);Lista1.add(36);Lista1.add(25);Lista1.add(7);Lista1.add(9);//Lista1 = 104,36,25,7,12,9
        List<Integer> Lista2 = new ArrayList<>();
        Lista2.add(85);Lista2.add(36);Lista2.add(7);Lista2.add(26);//Lista 2 = 82,34,78,26
        List<Integer> Lista3 = InterseccionLD(Lista1, Lista2);//104 52 85 8 10 36 25 7 9 26

        MostrarLista(Lista3);
    }


    public static void MostrarLista(List<Integer> Lista) {

        System.out.println(" \nEnlaces Explicitos Con distintas Listas ");
        for (int datos : Lista) {
            System.out.print(" " + datos);
        }
    }

    public static void MostrarArreglo(int[] Array) {
        for (int datos : Array) {
            System.out.print(" " + datos);
        }
    }

    public static List<Integer> InterseccionLD(List<Integer> List1, List<Integer> List2) {//NO SE CAMBIO NOMBRE DE FUNCION PERO SI SE CAMBIO SU CONTENIDO
        int i, j, k = 0;
        List<Integer> Fusion = new ArrayList<>();
        for (int valor: List1) {
                if (!List2.contains(valor)) {
                    Fusion.add(valor);
                }else{
                    Fusion.add(valor);
                }
            }
        for (int valor: List2) {
            if (!List1.contains(valor)) {
                Fusion.add(valor);
            }
        }
        return Fusion;
    }
   /* public static List<Integer> UnionLD(List<Integer> List1, List<Integer> List2){
        int i,j;
        List<Integer> union = new ArrayList<>();
        for (i=0; i<List1.size();i++){

            union.add(List1.get(i));
        }
        for (j=0; j<List2.size();j++){
            union.add(List2.get(j));
        }
        return union;
    }*/

    public static int[] Interseccion(int[] List1, int[] List2) {
        int i, j, k = 0;
        int[] interseccionaux = new int[List1.length + List2.length];
        for (i = 0; i < List1.length; i++) {
            for (j = 0; j < List2.length; j++) {
                if (List1[i] == List2[j]) {
                    interseccionaux[k] = List2[j];
                    k++;
                    break;
                }
            }
        }
        int[] interseccion = new int[k];
        for (i = 0; i < k; i++) {
            interseccion[i] = interseccionaux[i];
        }
        return interseccion;
    }
}