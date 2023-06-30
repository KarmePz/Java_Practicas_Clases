package Ejercicio5;


public class Papel {
    private String texto;

    public Papel(){}
    public Papel (String texto){
        this.texto= texto;
    }

    //Getters y Setters
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }


    //Metodo Escribir.
    public void Escribir(String Escritura){
        this.texto +=" "+Escritura;
    }

    //Se muestra lo que hay en el papel
    @Override
    public String toString(){
        String datos = texto;

        return datos;
    }



}

