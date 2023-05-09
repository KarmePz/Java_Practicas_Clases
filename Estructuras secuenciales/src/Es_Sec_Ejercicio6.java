import java.util.Scanner;

public class Es_Sec_Ejercicio6 {
    public Es_Sec_Ejercicio6() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los tres numeros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = a * 100 + b * 10 + c;
        System.out.println("Sus numeros son: x=" + x);
    }
}
