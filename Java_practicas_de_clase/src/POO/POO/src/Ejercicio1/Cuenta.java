package Ejercicio1;

public class Cuenta {
    private String titular;
    private float cantidad;

    public Cuenta(){}
    public Cuenta(String titular, float cantidad){
        this.cantidad = cantidad;
        this.titular = titular;
    }
    public float getCantidad(){
        return cantidad;
    }
    public String getTitular(){
        return titular;
    }
    public void setTitular(String titular){
        this.titular= titular;
    }
    public void setCantidad(float cantidad){
        this.cantidad = cantidad;
    }
    public void ingresar(double cantidad){
        if (cantidad>=0){
            this.cantidad += cantidad;
            System.out.println("Se Ingreso correctamente. La cantidad restante es : $"+this.cantidad);
        }else{
            System.out.println("No se pudo ingresar");
        }
    }
    public void retirar(double cantidad){
        if(this.cantidad >= cantidad && cantidad >= 0){
            this.cantidad -= cantidad;
            System.out.println("Se retiro correctamente. La cantidad restante es : $"+this.cantidad);
        }else{
            this.cantidad = 0;
            System.out.println("Se retiro correctamente. La cantidad restante es : $"+this.cantidad);
        }
    }
    @Override
    public String toString(){
        String datos = "\nDatos de la cuenta\n " +
                "TITULAR: "+this.titular+
                "\nCANTIDAD: $"+this.cantidad+"\n";
        return datos;
    }
}
