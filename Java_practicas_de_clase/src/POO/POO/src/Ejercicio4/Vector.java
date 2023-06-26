package Ejercicio4;

public class Vector {
    private double[] coordenadas;


    //Constructores
    public Vector(){}
    public Vector(double[] coordenadas){
        this.coordenadas = coordenadas;
    }
    //Getters y Setters
    public double[] getCoordenadas() {
        return coordenadas;
    }
    public void setCoordenadas(double[] coordenadas) {
        this.coordenadas = coordenadas;
    }


    public Vector MultiplicacionPorEscalar(int j){
        int i;
        double[] coordenadas2 = new double[coordenadas.length];
        for (i=0; i<coordenadas.length; i++){
            coordenadas2[i] = coordenadas[i] * j;
        }
        return new Vector(coordenadas2);
    }

    public Vector Sumar(Vector vector2){
        int i;
        if (coordenadas.length != vector2.coordenadas.length ){
            System.out.println("ERROR. Los vectores tienen que tener las mismas dimensiones.");
            return vector2;
        }
        double[] coordenadasSum = new double[coordenadas.length];
        for(i = 0; i < coordenadas.length; i++){
            coordenadasSum[i] = coordenadas[i] + vector2.coordenadas[i];
        }
        return new Vector(coordenadasSum);
    }



    @Override
    public String toString(){
        String dato = "[";
        for (int i = 0; i < coordenadas.length; i++) {
            dato += coordenadas[i];
            if (i != coordenadas.length - 1) {
                dato += ",";
            }
        }
        dato += "]";
        return dato.toString();
    }


}
