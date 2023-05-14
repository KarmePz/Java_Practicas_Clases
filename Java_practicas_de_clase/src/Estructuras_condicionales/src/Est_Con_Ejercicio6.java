package Estructuras_condicionales.src;
import java.util.Scanner;
public class Est_Con_Ejercicio6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 10: ");
        int a;
        a = sc.nextInt();
        switch (a){
            case 1: System.out.println("Número 1 en romano: I");break;
            case 2: System.out.println("Número 2 en romano: II");break;
            case 3: System.out.println("Número 3 en romano: III");break;
            case 4: System.out.println("Número 4 en romano: IV");break;
            case 5: System.out.println("Número 5 en romano: V");break;
            case 6: System.out.println("Número 6 en romano: VI");break;
            case 7: System.out.println("Número 7 en romano: VII");break;
            case 8: System.out.println("Número 8 en romano: VIII");break;
            case 9: System.out.println("Número 9 en romano: IX");break;
            case 10: System.out.println("Número 10 en romano: X");break;
            default: System.out.println("Número fuera de rango");break;
        }
    }
}
