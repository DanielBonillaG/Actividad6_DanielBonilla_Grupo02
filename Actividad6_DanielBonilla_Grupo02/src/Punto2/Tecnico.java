/*
Taller 6
Programación II - Grupo 02
Daniel José Bonilla Guerra
*/
package Punto2;

public class Tecnico extends Operario {
    
    public Tecnico(){}
    
    public Tecnico(String nombre){
        super(nombre);
    }
    
    @Override
    public String toString() {
        return super.toString()+" -> Tecnico";
    }
}
