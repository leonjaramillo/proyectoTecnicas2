package co.edu.udea.proyectotecnicas2.vehiculos;

public class Automovil extends Vehiculo {
    private double velocidad;
    
    public double getVelocidad() {
        return velocidad;
    }

    @Override
    public void frenar(double intensidad) {
        velocidad -= intensidad*2;
    }
    
}
