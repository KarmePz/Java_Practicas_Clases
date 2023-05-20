

//Alumno: BAEZ CARMELO JOSE JULIAN


/*Elaborar un algoritmo que dadas dos
listas haga la union de las mismas en una tercera.Enlaces Explicitos*/

public class ParcialTUP_Ejercicio2a {

    public static void main(String[] args){

        //Primero definimos las 3 listas con elementos, en este caso Enteros
        int[] Lista1 = {1,2,3,4,5,6};// Lista 1 tiene 6 elementos
        int[] Lista2 = {10,20,30,45,55,65,70,80};//Lista 2 tiene 8 elementos

        // la lista tres al ser un arreglo requiere un tamaño
        // el cual sera la suma de los elementos anteriores: 8+6 = 14
        int[] Lista3 = new int[Lista1.length+Lista2.length];

        //iniciamos los bucles para cargar los elementos a la lista 3
        int i,j;

        //En este bucle for se introducen todos los elementos de la lista 1 a la lista 3
        for(i = 0; i< Lista1.length; i++){
            Lista3[i] = Lista1[i];
        }


        //En este bucle for se introducen todos los elementos de la lista 2 a la lista 3
        for(j = 0; j < Lista2.length; j++){
            Lista3[j+Lista1.length] = Lista2[j];
            //se tiene en cuenta el estado anterior para la iteracion
            //(j+Lista1.length)= (iteracion + Cantidad elementos Lista1)
        }


        System.out.println("\n La Lista 1 unida con la lista 2 en la lista 3 es : \n");
        //Se imprimen por pantalla todos los valores presentes en la lista 3
        for (int valores: Lista3){
            System.out.print(" ("+valores+")");
        }
    }
}
