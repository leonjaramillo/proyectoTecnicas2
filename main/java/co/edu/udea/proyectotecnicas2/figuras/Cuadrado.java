package co.edu.udea.proyectotecnicas2.figuras;

import java.io.IOException;

public class Cuadrado extends Figura {
    private double lado;
    
    public Cuadrado() {
        this.lado = 0;
    }

    public Cuadrado(double lado) throws DimensionInvalidaException {
        if(lado >= 0) {
            this.lado = lado;
        } else {
            throw new DimensionInvalidaException();
        }
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) throws DimensionInvalidaException {
        if(lado >= 0) {
            this.lado = lado;
        } else {
            throw new DimensionInvalidaException();
        }
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public double perimetro() {
        return 4 * lado;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.lado) ^ (Double.doubleToLongBits(this.lado) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cuadrado other = (Cuadrado) obj;
        if (Double.doubleToLongBits(this.lado) != Double.doubleToLongBits(other.lado)) {
            return false;
        }
        return true;
    }
    
    
}
