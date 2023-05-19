public class BAEZCARMELO_PARCIAL1TUP_Ejercicio1 {
//Alumno: BAEZ CARMELO JOSE JULIAN
//Dado los estados iniciales y finales, escribir las acciones:
//estados iniciales: a = 3; b = 10; P = ?
//estados finales: a = 7; b = 10; P = 21
        public static void main(String[] args){
            int a = 3,b = 10, P;//Iniciamos P sin "igual" ya que no sabemos cuanto vale en su estao inicial
            //se muestran los valores por pantalla
            System.out.println("Los valores iniciales son: A= "+a+ " B = "+ b+" P = ?");

            //acciones:
            P = b-a;
            P = P*a;
            a = b - a;

            //Se muestran resultados por pantalla
            System.out.println("Los valores finales son: A= "+a+ " B = "+ b+" P = "+P);
        }
    }


