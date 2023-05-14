package Ejercitacion_ProI;

import java.util.Scanner;

//3. Eleborar un algoritmo para ordenar alfabéticamente el arreglo del
//ejercicio 1
public class Ejercicio_3 {

    private static final int MAX = 10;
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String ArregloNombres[];
        ArregloNombres = new String[MAX];
        CargarNombres(ArregloNombres);
        OrdenarAlfabeticamente(ArregloNombres);

    }

    public static void CargarNombres(String Arreglo[]){
        int i;
        String Nombre;
        for (i = 0; i < MAX; i++){
            System.out.print("Ingrese el nombre en la posicion "+ i +" : ");
            Nombre = sc.nextLine();
            Arreglo[i] = Nombre;
            if (Nombre.length() > 30){
                System.out.println("El nombre ingresado excede los 30 caracteres, ingreselo nuevamente");
                i--;
            }
        }
    }
    public static void MostrarNombres(String Arreglo[]) {
        int i;
        for (i = 0; i < MAX; i++) {
            System.out.println("El nombre en la posicion " + i + " es : " + Arreglo[i]);
        }
    }
    public static void OrdenarAlfabeticamente(String Arreglo[]){
        int i, n = MAX-1;
        boolean Desordenado = true;
        do/*(Desordenado)*/ {
            Desordenado = false;
            for (i = 0; i < n; i++) {
                if (Arreglo[i].compareTo(Arreglo[i + 1]) > 0) {
                    String aux = Arreglo[i];
                    Arreglo[i] = Arreglo[i + 1];
                    Arreglo[i + 1] = aux;
                    Desordenado = true;
                }
            }
            n--; //evita comparar Archivos que ya fueron Ordenados (Metodo Burbuja)
        }while(Desordenado == true);
        System.out.println("\n El Arreglo ordenado alfabeticamente quedo de la siguiente manera: ");
        MostrarNombres(Arreglo);
    }
}
