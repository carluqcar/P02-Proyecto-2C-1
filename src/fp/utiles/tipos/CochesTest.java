package fp.utiles.tipos;
import fp.utiles.Coches;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CochesTest {
    
    

    public static void main(String[] args) {

        //Declaracion de objetos. c1 y c2 son iguales para demostrar el metodo equals
        Coches c1 = new Coches("mazda","2",5500,162000.0,TipoFuel.PETROL,1500.0,TipoSegmento.B,6.3999999999999915,2.0,LocalDate.of(2016,01,5));
        Coches c2 = new Coches("mazda","2",5500,162000.0,TipoFuel.PETROL,1500.0,TipoSegmento.B,6.3999999999999915,2.0,LocalDate.of(2016,01,5));
        Coches c3 = new Coches("mazda","2",7000,61000.0,TipoFuel.PETROL,1500.0,TipoSegmento.B,7.899999999999986,2.1000000000000005,LocalDate.of(2020,01,30));
        Coches c4 = new Coches("opel","vectra",3999,231890.0,TipoFuel.PETROL,2200.0,TipoSegmento.D,4.799999999999997,1.7,LocalDate.of(2015,03,11));

        //Lista de objetos ordenada
        List<Coches> coches = new ArrayList<Coches>();
        coches.add(c1);
        coches.add(c3);
        coches.add(c4);
        System.out.println("Lista sin ordenar: "+ coches);
        Collections.sort(coches);
        System.out.println("Lista ordenada: " + coches);



        //Propiedades derivadas
        System.out.println("EL area del " + c1.marca() + " " + c1.modelo() + "es: " + c1.areaCoche());
        System.out.println("El tipo de mantenimiento del " + c2.marca() + " " + c2.modelo() + "es: " + c2.tipoMantenimiento());
        System.out.println("EL area del " + c3.marca() + " " + c3.modelo() + "es: " + c3.areaCoche());
        
        //Metodos equal y hascode

        //equals
        System.out.println("c1 y c2: " + c1.equals(c2));
        System.out.println("c1 y c3: " + c1.equals(c3));
        System.out.println("c3 y c4: " + c3.equals(c4));

        //hashcode
        System.out.println("Codigo hash de c1: " + c1.hashCode());
        System.out.println("Codigo hash de c2: " + c2.hashCode());
        System.out.println("Codigo hash de c3: " + c3.hashCode());
        System.out.println("Codigo hash de c4: " + c4.hashCode());

        //Metodo compareTo
        System.out.println("c1 y c2: " + c1.compareTo(c2));
        System.out.println("c1 y c3: " + c1.compareTo(c3));
        System.out.println("c3 y c2: " + c3.compareTo(c2));
        System.out.println("c4 y c3: " + c4.compareTo(c3));

        //Metodo toString saca por pantalla las propiedades del objeto
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
        System.out.println(c4.toString());















    }



}
