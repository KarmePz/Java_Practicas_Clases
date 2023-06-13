package Ejercicio2_38_BaezCarmelo;

public class Libro extends Object{
                                        //ATRIBUTOS
    private String titulo;
    private String autor;
    private int numejemplares;
    private int numejemplaresprestados;

                                        //METODOS

                    //Constructor por defecto
    public Libro() {
        this.titulo = "No especificado";
        this.autor = "No especificado";
        this.numejemplares = 1;
        this.numejemplaresprestados = 0;
    }
                    //Constructor con parametros
    public Libro(String titulo, String autor, int numejemplares, int numejemplaresprestados){
        this.titulo = titulo;
        this.autor = autor;
        this.numejemplares = numejemplares;
        if (numejemplares>=numejemplaresprestados){//no puede haber mas ejemplares prestados que existentes;
            this.numejemplaresprestados = numejemplaresprestados;
        }else {
            this.numejemplaresprestados = numejemplares;
        }

    }

                    //metodos getters
    public int getNumejemplares(){
        return numejemplares;
    }
    public int getNumejemplaresprestados(){
        return numejemplaresprestados;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }

                    //metodos setters
    public void setNumejemplares(int numejemplares){
        this.numejemplares = numejemplares;
    }
    public void setNumejemplaresprestados(int numejemplaresprestados){
        this.numejemplaresprestados = numejemplaresprestados;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }

                    //Metodo Prestamo
    public boolean prestamo (int librosaprestar) {
        int numejemplaresdisponibles = numejemplares-numejemplaresprestados;
        if(numejemplaresdisponibles == 0 || librosaprestar>numejemplaresdisponibles || librosaprestar<0){
            return false; //no quedan ejemplares a prestar/no se pueden prestar ejemplares que superen los disponibles /el rango ingresado es invalido
        }else{
            numejemplaresprestados = numejemplaresprestados+librosaprestar;//se modifica la cantidad de ejemplares prestados,
        return true;}
    }
                    //Metodo Devolucion
    public boolean devolucion(int librosdevueltos){
        if(numejemplaresprestados == 0 || librosdevueltos <= 0 || librosdevueltos > numejemplaresprestados){
            return false; //no se pueden devolver ejemplares/No se prestaron/el dato es invalido/ se devolvieron mas ejemplares de los que se prestaron.
        }else{
            numejemplaresprestados = numejemplaresprestados-librosdevueltos;//se modifica la cantidad de ejemplares prestados,
            return true;}
    }

                    //Metodo heredado toString
    @Override
    public String toString(){
        String datos = "El titulo del libro es: " + titulo + "\n" +
                       "El autor del libro es: " + autor +"\n"+
                       "El número de ejemplares total del libro es: " + numejemplares + "\n"+
                       "El número de ejemplares prestados es "+numejemplaresprestados;
        return datos;//Se retorna la cadena "datos" con todos los datos correspondientes.
    }
}
