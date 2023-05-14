package Ejercitacion_ProI;
import java.util.Scanner;

//1. Elaborar un algoritmo para cargar un arreglo de 50 Nombres de 30
//caracteres.
public class Ejercicio_1 {
    private static final int MAX = 10;
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String ArregloNombres[];
        ArregloNombres = new String[MAX];
        CargarNombres(ArregloNombres);
        MostrarNombres(ArregloNombres);
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
}
