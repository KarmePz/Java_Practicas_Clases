package Estructuras_condicionales.src;

import java.util.Scanner;
//3) Solicitar la edad de dos hermanos, mostrando un mensaje
// que informe la edad del mayor y cuántos años de diferencia
// tiene con el menor.
public class Est_Con_Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la edad de los dos hermanos: ");
        int edad1 = sc.nextInt();
        int edad2 = sc.nextInt();


        if (edad1 == edad2){
            System.out.println("\nLos hermanos tienen la misma edad");
        } else if (edad1 > edad2) {
            System.out.println("\nEl hermano mayor es el que tiene "+ edad1+ " años de edad");
            System.out.println("Su diferencia de edad es de " + (edad1-edad2)+ " años");
        }else{
            System.out.println("\nEl hermano mayor es el que tiene "+edad2+ " años de edad");
            System.out.println("Su diferencia de edad es de " + (edad2-edad1) + " años");
        }
    }
}
