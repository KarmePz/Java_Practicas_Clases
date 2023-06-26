package Ejercicio3;

//Realizar menú del ejercicio.------------------------------------------------------------------------------

public class PruebaFraccion {
    public static void main(String[] args){
        Fraccion fraccion1 = new Fraccion(150, 2);
        Fraccion fraccion2 = new Fraccion(55, 1);
        Fraccion fraccion3 = new Fraccion();


        System.out.println("fracion1: "+ fraccion1.toString());
        System.out.println("fracion2: "+ fraccion2.toString());

        fraccion3 = fraccion2.Multiplicar(fraccion1);


        fraccion1 = fraccion1.Simplificacion(fraccion1);

        System.out.println("\nfracion1 SIM: "+ fraccion1.toString());
        System.out.println("fracion3: "+ fraccion3.toString());



    }

}
