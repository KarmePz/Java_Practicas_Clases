import java.util.Scanner;

public class Es_Sec_Ejercicio4 {
    public Es_Sec_Ejercicio4() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de horas trabajadas en la semana: ");
        double horas = sc.nextDouble();
        System.out.println("Ingrese el sueldo por hora: ");
        double sueldophora = sc.nextDouble();
        double total;
        if (horas <= 40.0) {
            total = horas * sueldophora;
        } else {
            horas -= 40.0;
            total = horas * sueldophora * 2.0;
            total += 40.0 * sueldophora;
        }

        System.out.println(String.format("Total de sueldo: $%.2f", total));
        sc.close();
    }
}