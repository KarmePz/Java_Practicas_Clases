package Ejercicio5;

public class Birome{

    private int tinta;

    public Birome (){
        this.tinta = 100;
    }
    public Birome (int tinta){
        this.tinta = tinta;
    }

    public void Escribir (String texto, Papel papel){
        int i;



        if (tinta != 0 && tinta>texto.length()){
           for(i = 0; i < texto.length(); i++){
               String dato = String.valueOf(texto.charAt(i));
               papel.Escribir(dato);
            }
        }

        else{
            for(i = 0; i < texto.length()-tinta; i++){
                String dato = ""+texto.charAt(i);
                papel.Escribir(dato);
            }
            System.out.println("No se puede escribir. No queda tinta en birome");
        }

    }


}
