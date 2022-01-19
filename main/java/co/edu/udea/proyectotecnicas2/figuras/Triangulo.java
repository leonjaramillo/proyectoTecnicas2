package co.edu.udea.proyectotecnicas2.figuras;

public abstract class Triangulo extends Figura {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }
    
    @Override
    public double perimetro() {
        return ladoA + ladoB + ladoC;
    }
}
