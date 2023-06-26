package Ejercicio1;
import java.util.Locale;
import java.util.Scanner;
public class PruebaEjercicio1 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        boolean ejecutar = true;
        Cuenta cuenta1 = new Cuenta();
        System.out.println("Ingrese el nombre del titular de la cuenta:");
        String titular = sc.next();
        cuenta1.setTitular(titular);
        System.out.println("Ingrese la cantidad de la cuenta:");
        float cantidad = sc.nextFloat();
        cuenta1.setCantidad(cantidad);
        do {
            String opcion;
            System.out.println("Ingrese su opcion: ");
            System.out.println("A: Ingresar nueva cuenta:");
            System.out.println("B: Ingresar");
            System.out.println("C: Retirar\n");
            System.out.println("D: Mostrar datos");
            System.out.print("\tSu opcion:");
            opcion = sc.next();
            opcion = opcion.toLowerCase();
            switch (opcion){
                case "a":
                    System.out.println("Ingrese el nombre del titular de la cuenta:");
                    titular = sc.next();
                    cuenta1.setTitular(titular);
                    System.out.println("Ingrese la cantidad de la cuenta:");
                    cantidad = sc.nextFloat();
                    cuenta1.setCantidad(cantidad);
                    break;
                case "b":
                    System.out.print("Digite la cantidad a ingresar en la cuenta:");
                    double ingreso = sc.nextDouble();
                    cuenta1.ingresar(ingreso);
                    break;
                case "c":
                    System.out.print("Digite la cantidad a retirar de la cuenta:");
                    double retiro = sc.nextDouble();
                    cuenta1.retirar(retiro);
                    break;
                case "d":
                    System.out.println(cuenta1.toString());
                    break;
                default:
                    ejecutar = false;
                    break;
            }

        }while(ejecutar);
        System.out.println("PROGRAMA FINALIZADO");
    }
}
