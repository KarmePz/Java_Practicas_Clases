package Estructuras_condicionales.src;
import java.util.Scanner;
public class Est_Con_Ejercicio5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese tres lados enteros(a, b, c): ");
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a<=0 || b<=0 ||c<=0){
            System.out.println("El Triangulo ingresado es invalido");
        }else {
            if (b == c && a == c && a == b) {
                System.out.println("El Triangulo ingresado es equilatero");
            } else if (a != b && b != c && a != c) {
                System.out.println("El triangulo ingresado es  escaleno");
            } else {
                System.out.println("El triangulo ingresado es isosceles");
            }
        }
    }
}
