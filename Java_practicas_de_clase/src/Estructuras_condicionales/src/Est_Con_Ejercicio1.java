package Estructuras_condicionales.src;
import java.text.DecimalFormat;
import java.util.Scanner;

//1) Determinar si un alumno aprueba o desaprueba un curso, sabiendo que
// aprueba si su promedio de tres calificaciones
// es mayor o igual a 60; desaprueba en caso contrario.
public class Est_Con_Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese las tres calificaciones del 1 al 100: ");
        int calificacion1 = sc.nextInt();
        int calificacion2 = sc.nextInt();
        int calificacion3 = sc.nextInt();
        DecimalFormat df = new DecimalFormat("#.00");
        float promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
        System.out.println("La calificacion total es : " + df.format(promedio)+ " de 100" );
        if (promedio>60){
            System.out.println("\nEl alumno aprobo");
        }else{
            System.out.println("\nEl alumno desaprobo");
        }
    }
}
