/*
Taller 6
Programación II - Grupo 02
Daniel José Bonilla Guerra
*/
package Punto2;

public class Directivo extends Empleado{
    
    public Directivo(){}
    
    public Directivo(String nombre){
        super(nombre);
    }
    
    @Override
    public String toString() {
        return super.toString()+" -> Directivo";
    }
}
