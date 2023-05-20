
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Alumno: BAEZ CARMELO JOSE JULIAN

/*Elaborar un algoritmo que dadas dos
listas haga la union de las mismas en una tercera.Enlaces Explicitos*/


public class ParcialTUP_Ejercicio2b {

    public static Scanner sc = new Scanner(System.in);

    public static void main (String[]args){
        // definir listas
        List<String> Lista1 = new ArrayList <>();
        List<String> Lista2 = new ArrayList <>();
        List<String> Lista3 = new ArrayList <>();

        //Usamos funciones para hacer mas sencillo y legible el codigo
        CargarListas (Lista1, 1);//cargar lista 1 (lista, numero de lista)
        CargarListas(Lista2, 2);//cargar lista 2 (lista, numero de lista)
       Lista3 = union(Lista1,Lista2);//lista 3 va a ser igual a la union de las otras listas
       MostrarLista(Lista3, 3);//Se muestra lista tres

    }
    public static void CargarListas(List<String> lista, int numlista){
            //inicio de contador, auxiliar y opcion
            int i = 0;
            String aux, opcion;

            //inicio de bucle repetitivo
            do{
                System.out.print(" Ingrese el elemento numero " + i + " de la lista "+ numlista +": " );
                i++;
                //Se ingresan los datos a la lista
                String nombre = sc.nextLine();
                lista.add(nombre);
                aux = nombre;//Se guarda el nombre en una variable auxiliar
                if (aux.length() == 0){ //Se comprueba si se ingresaron datos, de no ser asi se pregunta:
                    System.out.print(" Desea continuar S/N: " );
                    opcion = sc.nextLine();//si opcion es igual a s se sigue con el ingreso de elementos a la lista
                    if(opcion.equals("S")||opcion.equals("s")) aux=" ";
                    else {lista.remove(i-1);};//Se remueve la lista guardada en memoria
                }
            }while(aux.length()!= 0);// Se finaliza el bucle cuando la cantidad de aux sea 0
        }

    public static List<String> union(List<String> List1,List<String> List2){
        int i;
        List<String> union = new ArrayList<>();
        //Se ejecuta un con tantas iteraciones como elementos tenga lista 2
        for (i=0; i < List2.size();i++){
            union.add(List2.get(i));//se añade a lista union
        }
        //Se ejecuta un con tantas iteraciones como elementos tenga lista 1
        for (i=0; i < List1.size();i++){
            union.add(List1.get(i));
        }
        return union;//Se returna union como lista 3
    }

    public static void MostrarLista(List<String> lista, int numlista){
        //Para cada lista se imprimen la cantidad de valores
        System.out.println("Para la lista "+ numlista+ " Se unio la lista 2 y 1 y se cargaron los siguientes datos: ");
        for(String valor : lista){
            System.out.print(" "+ valor);
        }
    }
}
