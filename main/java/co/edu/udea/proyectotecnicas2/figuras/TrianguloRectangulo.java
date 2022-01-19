package co.edu.udea.proyectotecnicas2.figuras;

public class TrianguloRectangulo extends Triangulo {
    private double base;
    private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double area() {
        return (base*altura)/2;
    }
    
    
    
}
