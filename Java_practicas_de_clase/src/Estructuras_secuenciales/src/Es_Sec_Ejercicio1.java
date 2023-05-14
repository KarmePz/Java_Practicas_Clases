package Estructuras_secuenciales.src;

import java.util.Scanner;

public class Es_Sec_Ejercicio1 {
    public Es_Sec_Ejercicio1() {
    }
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Ingrese el número de Km a recorrer : ");
        int boleto = sca.nextInt();
        int precio = boleto * 45;
        System.out.println("el precio total es de : $" + precio);
        sca.close();
    }
}