package Estructuras_condicionales.src;
import java.util.Scanner;

//4) Diseñar una solución que permita ingresar tres
// números enteros, e informe cuál es el mayor.
public class Est_Con_Ejercicio4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese tres numeros enteros(a, b, c): ");
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a>b && a > c){
            System.out.println("A es el mayor");
        }else if (b > a && b > c ){
            System.out.println("B es el mayor");
        } else if (c > a && c > b) {
            System.out.println("C es el mayor");
        }else{
            if (a == b && b==c){System.out.println("TODOS LOS NUMEROS SON IGUALES");}
            else if(a == c ) {System.out.println("LOS NUMEROS A y C SON IGUALES Y MAYORES QUE B");}
            else if(a == b ) {System.out.println("LOS NUMEROS A y B SON IGUALES Y MAYORES QUE C");}
            else{System.out.println("LOS NUMEROS B y C SON IGUALES Y MAYORES QUE A");}
            }
        }
    }
