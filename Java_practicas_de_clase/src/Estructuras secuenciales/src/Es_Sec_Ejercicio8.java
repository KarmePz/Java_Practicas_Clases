import java.io.PrintStream;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Es_Sec_Ejercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cm");
        double cm = sc.nextDouble();
        double pul = cm * 0.39737;
        DecimalFormat df = new DecimalFormat("#0.000");
        PrintStream var10000 = System.out;
        String var10001 = df.format(pul);
        var10000.println("Resultado en pulgadas: " + var10001);
        sc.close();
    }
}