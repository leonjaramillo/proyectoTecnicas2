package co.edu.udea.proyectotecnicas2;

import co.edu.udea.proyectotecnicas2.figuras.Circulo;
import co.edu.udea.proyectotecnicas2.figuras.Cuadrado;
import co.edu.udea.proyectotecnicas2.figuras.Figura;
import co.edu.udea.proyectotecnicas2.figuras.Rectangulo;
import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        double sumaAreas = 0;
                
        List<Circulo> paintCojo = new ArrayList<>();
        List<Figura> paint = new ArrayList<>();
        
        Circulo c = new Circulo(5);
        Cuadrado x = new Cuadrado(6);
        Rectangulo r = new Rectangulo(7, 4);
        
        paintCojo.add(c);
        //paintCojo.add(x);
        //paintCojo.add(r);
        
        paint.add(c);
        paint.add(x);
        paint.add(r);
        
        for(Figura f: paint) {
            sumaAreas += f.area();
        }
        
        System.out.println(sumaAreas);
        
    } 
}
