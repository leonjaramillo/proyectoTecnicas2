package co.edu.udea.proyectotecnicas2.vehiculos;

public class Automovil extends Vehiculo {
    private double velocidad;
    private Bicicleta miBici;

    public Bicicleta getMiBici() {
        return miBici;
    }

    public void setMiBici(Bicicleta miBici) {
        this.miBici = miBici;
    }
    
    public Automovil() {
        this.velocidad = 0;
    }
    
    public double getVelocidad() {
        return velocidad;
    }

    @Override
    public void frenar(double intensidad) {
        velocidad -= intensidad*2;
    }
    
}
