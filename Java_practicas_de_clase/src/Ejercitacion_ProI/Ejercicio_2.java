package Ejercitacion_ProI;
import java.util.Scanner;
//2. Elaborar un algoritmo para eliminar un nombre dado en un
// arreglo de 50 Nombres de 30 caracteres.
public class Ejercicio_2 {
    private static int MAX = 50;
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String ArregloNombres[];
        ArregloNombres = new String[MAX];
        CargarNombres(ArregloNombres);
        EliminarNombre(ArregloNombres);
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
        MostrarNombres(Arreglo, MAX);
    }
    public static void MostrarNombres(String Arreglo[],int NUM) {
        int i;
        for (i = 0; i < NUM; i++) {
            System.out.println("El nombre en la posicion " + i + " es : " + Arreglo[i]);
        }
    }
    public static void EliminarNombre(String Arreglo[]) {
        int i, nuevoTamaño = MAX;
        String Nombre;
        System.out.print("Ingrese el nombre a eliminar: ");
        Nombre = sc.nextLine();
        for (i = 0; i < nuevoTamaño; i++) {
            if (Arreglo[i].equals(Nombre)) {
                Arreglo[i] = Arreglo[nuevoTamaño - 1];
                nuevoTamaño--;
                i--;
            }
        }
        if (nuevoTamaño == 0) {
            System.out.print("El Arreglo quedo vacio");
        } else {
            MostrarNombres(Arreglo, nuevoTamaño);
        }
    }
}


