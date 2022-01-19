package co.edu.udea.proyectotecnicas2.figuras;

public abstract class Figura {
    public abstract double area();
    
    public abstract double perimetro();
    
    public String descripcion() {
        return "Esto es una figura geométrica.";
    }
}
