import java.util.Scanner;

public class Es_Sec_Ejercicio3 {
    public Es_Sec_Ejercicio3() {
    }

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de presupuesto anual: ");
        double total_anual = sca.nextDouble();
        double urg = total_anual * 0.37;
        double ped = total_anual * 0.42;
        double trau = total_anual * 0.21;
        System.out.println(String.format("Presupuesto urgencias: $%.2f", urg));
        System.out.println("Presupuesto pediatría: $" + ped);
        System.out.println("Presupuesto traumatologia: $" + trau);
        sca.close();
    }
}