package co.edu.udea.proyectotecnicas2;

import co.edu.udea.proyectotecnicas2.figuras.*;
import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {
        try {
            double area = 0;
            List<Figura> rompecabezas = new ArrayList<>();
            
            Figura f1 = new Circulo(4.7);
            Figura f2 = new Rectangulo(8.9, 2.0);
            Figura f3 = new Cuadrado(10.0);
            Figura f4 = new Circulo(10.8);
            Figura f5 = new Rectangulo(6, 7);
            Figura f6 = new Cuadrado(7.3);
            
            rompecabezas.add(f1);
            rompecabezas.add(f2);
            rompecabezas.add(f3);
            rompecabezas.add(f4);
            rompecabezas.add(f5);
            rompecabezas.add(f6);
            
            for (Figura fig : rompecabezas) {
                area += fig.area();
                if(fig instanceof Circulo) {
                    System.out.println(((Circulo)fig).getRadio());
                }
            }
            
            System.out.println("Área: " + area);
            
        } catch (DimensionInvalidaException e) {
            System.out.println(e.getMessage());
        }

    }

}
