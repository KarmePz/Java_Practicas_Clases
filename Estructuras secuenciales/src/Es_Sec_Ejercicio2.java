import java.io.PrintStream;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Es_Sec_Ejercicio2 {
    public Es_Sec_Ejercicio2() {
    }

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Ingrese el número de Km a recorrer : ");
        float boleto = (float)sca.nextInt();
        float precio = boleto * 10.5F;
        DecimalFormat df = new DecimalFormat("0.00");
        PrintStream var10000 = System.out;
        String var10001 = df.format((double)precio);
        var10000.println("El precio del boleto es : $" + var10001);
        sca.close();
    }
}