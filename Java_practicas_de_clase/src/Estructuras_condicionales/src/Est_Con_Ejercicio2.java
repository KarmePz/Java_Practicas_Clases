package Estructuras_condicionales.src;
import java.text.DecimalFormat;
import java.util.Scanner;

//2) En un almacén se hace un 20% de descuento a los clientes cuya compra supere
// los $1000. Mostrar por pantalla cuál será la cantidad que
// pagará una persona por su compra.
public class Est_Con_Ejercicio2 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#0.00");
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor total de su compra: $");
        float compra = sc.nextFloat();

        if(compra > 1000){
            float descuento=  (compra * (20f/100));
            float total = compra - descuento;
            System.out.println("\nel valor total de su compra es : $"+ df.format(compra));
            System.out.println("El descuento es de : $"+df.format(descuento));
            System.out.println("El precio total de su compra aplicado el descuento es : $"+ df.format(total));
        }else{
            System.out.println("\nEl valor total de su compra es : $"+ df.format(compra));
            System.out.println("Su compra no supera los $1000, no hay descuento" );
        }


    }
}
