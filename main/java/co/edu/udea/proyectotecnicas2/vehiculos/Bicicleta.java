package co.edu.udea.proyectotecnicas2.vehiculos;

public class Bicicleta extends Vehiculo implements Pedaleable {
    
    private double velocidad;

    public double getVelocidad() {
        return velocidad;
    }

    @Override
    public void frenar(double intensidad) {
        velocidad -= intensidad;
    }

    @Override
    public void pedalear() {
        velocidad += 3;
    }
    
}
