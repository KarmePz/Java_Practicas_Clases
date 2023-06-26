package Ejercicio2;

public class Libro {
    //ATRIBUTOS
    private String ISBN;
    private String Titulo;
    private String Autor;
    private int numPag;
    //CONSTRUCTORES
    public Libro(){}
    public Libro(String ISBN, String Titulo, String Autor, int numPag){
        this.Autor = Autor;
        this.Titulo = Titulo;
        this.ISBN = ISBN;
        this.numPag = numPag;
    }
    //SETTERS
    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }
    public void setTitulo(String Titulo){
        this.Titulo = Titulo;
    }
    public void setAutor(String Autor){
        this.Autor = Autor;
    }
    public void setNumPag(int numPag){
        this.numPag = numPag;
    }
    //GETTERS
    public String getISBN(){
        return ISBN;
    }
    public String getTitulo(){
        return Titulo;
    }
    public String getAutor(){
        return Autor;
    }
    public int getNumPag(){
        return numPag;
    }
    //METODOS ESPECIALES
    @Override
    public String toString(){
        String datos = "\nEl libro "+Titulo+" con ISBN: "+ISBN+", creado por el autor "+Autor+" tiene " +numPag+ " páginas";
        return datos;
    }
}
