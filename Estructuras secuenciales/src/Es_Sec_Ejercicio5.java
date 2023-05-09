import java.util.Scanner;

public class Es_Sec_Ejercicio5 {
    public Es_Sec_Ejercicio5() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese sus dos numeros: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        System.out.println("Suma del doble del primero y el cuadrado del segundo :" + (num1 * 2.0 + Math.pow(num2, 2.0)));
        System.out.println(String.format("promedio cubos: %.2f", (Math.pow(num1, 3.0) + Math.pow(num2, 3.0)) / 2.0));
        sc.close();
    }
}
