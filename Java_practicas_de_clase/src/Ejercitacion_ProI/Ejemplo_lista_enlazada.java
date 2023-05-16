package Ejercitacion_ProI;

public class Ejemplo_lista_enlazada {
    public static void main(String[] args){
        ListaEnlazada lista = new ListaEnlazada();
        lista.AnadirInicio("Felix");
        lista.AnadirFinal("Foca");
        lista.AnadirFinal("Frlix");
        lista.AnadirFinal("Foca");
        lista.AnadirFinal("Fr");
        lista.Mostrar();

        lista.BorrarValor( "Foca");
        lista.Mostrar();
    }
}
class Nodo{
    String valor;
    Nodo siguiente;
    Nodo(String valor){
        this.valor = valor;
    }
}
class ListaEnlazada{
    Nodo cabeza;
    public void AnadirFinal(String valor){
        //verificar si nuestra lista esta vacia
        if(vacia()){
            cabeza = new Nodo(valor);
            return;
        }
        //se itera en toda la lista hasta encontrar el nodo que tiene como puntero o siguiente nulo;
        Nodo mensajero = cabeza;
        while (mensajero.siguiente != null){
            mensajero = mensajero.siguiente;
        }
        mensajero.siguiente = new Nodo(valor);
    }
    public  void AnadirInicio(String valor){
        //verificar si nuestra lista esta vacia
        if(vacia()){
            cabeza = new Nodo(valor);
            return;
        }
        //1er paso crear nodo
        Nodo nuevo =  new Nodo(valor);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
    }

    public void BorrarValor(String valor){
        if(vacia()) return;

        //si cabeza es el nodo que queremos eliminar
        if (cabeza.valor.equals(valor))/*Verificar equals o ==*/{
            cabeza = cabeza.siguiente;
        }
        //iterar hasta encontrar un nodo antes del que queremos eliminar
        Nodo mensajero = cabeza;
        while (mensajero.siguiente != null){
            if (mensajero.siguiente.valor.equals(valor)){
                mensajero.siguiente = mensajero.siguiente.siguiente;
                return;
            }
            mensajero= mensajero.siguiente;
        }
    }

    public void Mostrar(){
        if (vacia()){
            System.out.println("Lista vacia");
            return;
        }
        Nodo mensajero = cabeza;
        while (mensajero != null){
            System.out.println("Valor: " + mensajero.valor);
            mensajero = mensajero.siguiente;
        }
    }

    private boolean vacia(){
        if(cabeza == null) return true;
        else return false;
    }
}