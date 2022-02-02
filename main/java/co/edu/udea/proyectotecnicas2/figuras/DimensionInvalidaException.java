package co.edu.udea.proyectotecnicas2.figuras;

public class DimensionInvalidaException extends Exception {
    public DimensionInvalidaException() {
        super("La dimensión o longitud que quiere ingresar es inválida");
    }
}
