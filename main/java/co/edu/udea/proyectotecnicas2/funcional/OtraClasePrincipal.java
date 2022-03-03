
package co.edu.udea.proyectotecnicas2.funcional;

import co.edu.udea.proyectotecnicas2.Estudiante;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OtraClasePrincipal {
    
    public static void main(String[] args) {
        /*List<String> corredores = new ArrayList<>();
        
        corredores.add("Rigoberto Urán");
        corredores.add("Nairo Quintana");
        corredores.add("Egan Bernal");
        corredores.add("Iván Sosa");
        corredores.add("Miguel Ángel López");
        
        Stream<String> streamCorredores = corredores.stream();
        
        streamCorredores.map(corredor -> corredor.toUpperCase())
                .forEach(c -> System.out.println(c));
        
        List<Integer> edades = new ArrayList<>();
        
        edades.add(17);
        edades.add(20);
        edades.add(18);
        edades.add(19);
        edades.add(35);
        edades.add(29);
        edades.add(18);
        edades.add(16);
        
        Stream<Integer> streamEdades = edades.stream();
        
        streamEdades.sorted(Collections.reverseOrder()).forEach(n -> System.out.println(n));*/
        
        
        /*double resultado = streamEdades
                .filter(e -> e > 20)
                .map(e -> e * 2)
                .mapToInt(v -> v.intValue())
                .average()
                .getAsDouble();
        
        int suma = IntStream.rangeClosed(1, 20)
                .map(n -> n * 2)
                .sum();
        
        new Random().doubles(20, 1, 30).forEach(r -> System.out.println(r));
        
        System.out.println(suma);*/
        
        //1 
        
        /*double x = 2;
        double euler = DoubleStream.of(1, 2, 3, 4,5 ,6 ,7, 8).reduce(1, (i, j) -> (Math.pow(x, i) / factorial(i)) + (Math.pow(x, j) / factorial(j)));
        System.out.println(euler);*/
        
        
        List<Estudiante> estudiantes = new ArrayList<>();
        
        estudiantes.add(new Estudiante(1, "Juan", "Pérez", "uno@hotmail.com", "1234"));
        estudiantes.add(new Estudiante(2, "Pedro", "Pérez", "uno@hotmail.com", "1234"));
        estudiantes.add(new Estudiante(3, "Luis", "Pérez", "uno@hotmail.com", "1234"));
        estudiantes.add(new Estudiante(4, "Stiven", "Pérez", "uno@gmail.com", "1234"));
        estudiantes.add(new Estudiante(5, "Rogelio", "Pérez", "uno@gmail.com", "1234"));
        estudiantes.add(new Estudiante(6, "Daniel", "Pérez", "uno@hotmail.com", "1234"));
        estudiantes.add(new Estudiante(7, "José", "Pérez", "uno@udea.edu.co", "1234"));
        
        Stream<Estudiante> streamEstudiantes = estudiantes.stream();
        
        streamEstudiantes.filter(e -> e.getCedula() > 3).forEach(e -> System.out.println(e));
        
    }
    
    /*static double factorial(double n) {
        return IntStream.rangeClosed(1, (int)n).reduce(1, (i, j) -> i * j);
    }*/
    
    
    
}
