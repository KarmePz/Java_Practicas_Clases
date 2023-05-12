import java.util.Scanner;

public class Es_Sec_Ejercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total_h = 0;
        int total_m = 0;

        for(int i = 1; i <= 3; ++i) {
            System.out.println("Ingrese cantidad de hombres de la comision " + i + " : ");
            int h = sc.nextInt();
            total_h += h;
            System.out.println("Ingrese cantidad de mujeres de la comision " + i + " : ");
            int m = sc.nextInt();
            total_m += m;
        }

        System.out.println("La cantidad total de alumnos es " + (total_h + total_m));
        sc.close();
    }
}