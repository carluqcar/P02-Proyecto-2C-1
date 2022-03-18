package fp.utiles;

import java.time.LocalDate;
import fp.utiles.tipos.TipoFuel;
import fp.utiles.tipos.TipoMantenimiento;
import fp.utiles.tipos.TipoSegmento;


public record Coches(String marca, String modelo, Integer precio, Double kilometraje, TipoFuel tipoFuel, Double capacidad, TipoSegmento segmento, Double largo, Double ancho, LocalDate fecha) implements Comparable<Coches> {


    //Propiedad derivada, representa el area del coche, utilizado la longitud y el ancho del coche
    public Double areaCoche(){
        return this.ancho*this.largo; 
    }

    //Clasifica la consumicion de cada coche en caro, medio o barato
    public TipoMantenimiento  tipoMantenimiento(){

        Double d = 1.1;
        Double p = 1.7;
        Double consPetrol = p*this.areaCoche();
        Double consDiesel = d*this.areaCoche();
        TipoMantenimiento r =  TipoMantenimiento.MEDIO;
        if (tipoFuel == TipoFuel.PETROL){
            if (consPetrol < 25.73){
                r = TipoMantenimiento.BARATO;
            }
            if (consPetrol > 15.73){
                r = TipoMantenimiento.CARO;
            }
            if (consPetrol > 15.73 && consPetrol < 25.73){
                r = TipoMantenimiento.MEDIO;
            }
        }

        else{
            if (consDiesel < 18.41){
                r = TipoMantenimiento.BARATO;
            }
            if (consDiesel > 8.41){
                r = TipoMantenimiento.CARO;
            }
            if (consDiesel > 8.41 && consDiesel < 18.41){
                r = TipoMantenimiento.MEDIO;
            }
        }
        
        return r;

    }

    //Constructor con restricciones
    public Coches{
        Checkers.check("La distancia recorrida no puede ser negativa.",kilometraje>0); // Si kilometraje es negativo se parara el programa y sacara la frase por pantalla
        Checkers.check("El precio no puede ser cero o menor que cero.", precio>=0); // Si precio es negativo o cero se parara el programa y sacara la frase por pantalla
    }

    
    //Metodo hashcode devuelve un entero que es el codigo hash que representa a cada objeto
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((kilometraje == null) ? 0 : kilometraje.hashCode());
        result = prime * result + ((marca == null) ? 0 : marca.hashCode());
        result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
        return result;
    }

    //Metodo equals dice si el objeto es igual al que se le pasa por parametros(True si son iguales, False si son distintos)
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Coches other = (Coches) obj;
        if (kilometraje == null) {
            if (other.kilometraje != null)
                return false;
        } else if (!kilometraje.equals(other.kilometraje))
            return false;
        if (marca == null) {
            if (other.marca != null)
                return false;
        } else if (!marca.equals(other.marca))
            return false;
        if (modelo == null) {
            if (other.modelo != null)
                return false;
        } else if (!modelo.equals(other.modelo))
            return false;
        return true;
    }

    

    @Override
    public String toString() {
        return "Marca: " + this.marca + ". Modelo: " + this.modelo + ". Precio: " + this.precio + ". Kilometraje: " + this.kilometraje + ". Tipo de combustible: " + this.tipoFuel + ". Capacidad: " + this.capacidad + ". Segmento: " + this.segmento + ". Largo: " + this.largo + ". Ancho: " + this.ancho + ". Fecha de venta: " + this.fecha;
    }

    //Metodo compareTo devuelve un entero y compara el objeto y el objeto pasado por parametros 
    @Override
    public int compareTo(Coches o) {
        // TODO Auto-generated method stub
        int r;
        r = marca().compareTo(o.marca);
        if (r==0){
            r = modelo().compareTo(o.modelo);
            if(r==0){
                r=kilometraje().compareTo(o.kilometraje);
            }
        }
        return r;
    }

    

    


}


    


