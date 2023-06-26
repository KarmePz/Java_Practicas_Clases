package Ejercicio3;

public class Fraccion {
    private int dividendo;
    private int divisor;


    public Fraccion(){

    }
    public Fraccion(int dividendo, int divisor){
        this.dividendo = dividendo;
        if (divisor != 0){
            this.divisor = divisor;
        }
    }

    public int getDivisor() {
        return divisor;
    }

    public int getDividendo() {
        return dividendo;
    }

    public void setDividendo(int dividendo) {
        this.dividendo = dividendo;
    }

    public void setDivisor(int divisor) {
        if (divisor != 0) {
            this.divisor = divisor;
        }
    }

    private int MCD(int a, int b){
        if(b == 0){
            return a;
        }else{
            return MCD(b, a % b);
        }
    }
    public Fraccion Simplificacion(Fraccion fraccion){
        int divisor1, dividendo1;
        if (fraccion.dividendo % fraccion.divisor == 0){
            dividendo1 = fraccion.dividendo/ fraccion.divisor;
            divisor1 = 1;
        }else {
             dividendo1 = dividendo / MCD(fraccion.dividendo, fraccion.divisor);
             divisor1 = divisor / MCD(fraccion.dividendo, fraccion.divisor);
        }
        Fraccion fraccion1 = new Fraccion(dividendo1, divisor1);
        return fraccion1;
    }

    public Fraccion Sumar(Fraccion fraccion2){
        int dividendo3 = this.dividendo* fraccion2.divisor + fraccion2.dividendo * this.divisor;
        int divisor3 = this.divisor*fraccion2.divisor;
        Fraccion fraccion3 = new Fraccion(dividendo3, divisor3);
        fraccion3 = fraccion3.Simplificacion(fraccion3);
        return fraccion3;
    }
    public Fraccion Multiplicar( Fraccion fraccion2){
        int dividendo3 = fraccion2.dividendo * this.dividendo;
        int divisor3 = this.divisor*fraccion2.divisor;
        Fraccion fraccion3 = new Fraccion(dividendo3, divisor3);
        fraccion3 = fraccion3.Simplificacion(fraccion3);
        return fraccion3;
    }

    @Override
    public String toString(){
        String datos ="Divisor = 0, operacion no posible.";
        if (divisor != 0 && divisor != 1 ) {
            datos = dividendo + "/" + divisor;
        } else if (divisor == 1){
           datos = String.valueOf(dividendo);
        }
        return datos;
    }
}
