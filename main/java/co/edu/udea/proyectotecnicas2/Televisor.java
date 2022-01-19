package co.edu.udea.proyectotecnicas2;

public class Televisor {
    
    public Televisor() {
        this(false,"Toshiba","café",1,4,48,0);
    }
    
    public Televisor(String marcaInicial, String colorInicial) {
        this(false,marcaInicial,colorInicial,5,0,28,1);
    }

    public Televisor(boolean encendido, String marca, String color, int volumen, int canalActual, double pulgadas, int volumenPrevio) {
        this.encendido = encendido;
        this.marca = marca;
        this.color = color;
        this.volumen = volumen;
        this.canalActual = canalActual;
        this.pulgadas = pulgadas;
        this.volumenPrevio = volumenPrevio;
        existencias++;
    }
    
    public static final int CANAL_MAYOR = 1000;
    
    private boolean encendido;
    private String marca;
    private String color;
    private int volumen;
    private int canalActual;
    private double pulgadas;
    
    public static int existencias = 0;
    
    private int volumenPrevio;
    
    public void encender() {
        System.out.println("Se prendió el televisor");
        this.encendido = true;
    }
    
    public void apagar() {
        encendido = false;
    }
    
    public boolean isEncendido() {
        return encendido;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public void setColor(String color, int intensidad) {
        this.color = color + " " + intensidad;
    }

    public int getVolumen() {
        return volumen;
    }
    
    public void subirVolumen() {
        volumen++;
    }
    
    public void bajarVolumen() {
        volumen--;
    }
    
    public void mute() {
        if(volumen == 0) {
            volumen = volumenPrevio;
        } else {
            volumenPrevio = volumen;
            volumen = 0;
        }
        
    }
    
    public double getPulgadas() {
        return pulgadas;
    }
    
    public void canalSiguiente() {
        if(canalActual+1 < 100) {
            canalActual++;
        }
    }
    
    public void canalAnterior() {
        if(canalActual-1 > 0) {
            canalActual--;
        }
    }
    
    public void cambiarCanal(int canalNuevo) {
        if(canalNuevo > 0 && canalNuevo <= CANAL_MAYOR) {
            canalActual = canalNuevo;
        }
    }
    
    public void cambiarCanal(short canalNuevo) {
        if(canalNuevo > 0 && canalNuevo <= CANAL_MAYOR) {
            canalActual = canalNuevo;
        }
    }

    public int getCanalActual() {
        return canalActual;
    }
    
    public static String getDerechos() {
        return "Todos los derechos reservados";
    }
    
    
    
}
