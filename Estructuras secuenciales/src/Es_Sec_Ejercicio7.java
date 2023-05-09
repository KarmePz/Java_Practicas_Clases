import java.util.Scanner;

public class Es_Sec_Ejercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese mujeres:");
        double m = sc.nextDouble();
        System.out.println("Ingrese Hombres:");
        double h = sc.nextDouble();
        double promedio = h * (100.0 / (h + m));
        System.out.println("promedio Hombres: %" + promedio);
        double promedio2 = m * (100.0 / (h + m));
        System.out.println("promedio Hombres: %" + promedio2);
        sc.close();
    }
}