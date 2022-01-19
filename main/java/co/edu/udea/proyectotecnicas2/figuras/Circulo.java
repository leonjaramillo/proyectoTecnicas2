package co.edu.udea.proyectotecnicas2.figuras;

public class Circulo extends Figura {
    
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI*radio*radio;
    }

    @Override
    public double perimetro() {
        return 2*Math.PI*radio;
    }
    
    
}
