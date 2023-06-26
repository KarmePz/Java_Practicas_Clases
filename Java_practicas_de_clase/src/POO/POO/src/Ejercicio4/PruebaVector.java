package Ejercicio4;


//REALIZAR MENU-----------------------------------------------------------------------------------------------


public class PruebaVector {
    public static void main(String[] args) {
        double[] coordinates1 = {1, 2, 3};
        Vector vector1 = new Vector(coordinates1);
        System.out.println("Vector 1: " + vector1.toString());

        int scalar = 2;
        Vector multipliedVector = vector1.MultiplicacionPorEscalar(scalar);
        System.out.println("Vector multiplicado por " + scalar + ": " + multipliedVector.toString());

        double[] coordinates2 = {4, 5, 6};
        Vector vector2 = new Vector(coordinates2);
        System.out.println("Vector 2: " + vector2.toString());

        Vector summedVector = vector1.Sumar(vector2);
        System.out.println("Vector suma: " + summedVector.toString());
    }
}
