/*
Taller 6
Programación II - Grupo 02
Daniel José Bonilla Guerra
*/
package Punto2;

public class Operario extends Empleado {
    
    public Operario(){}
    
    public Operario(String nombre){
        super(nombre);
    }
    
    @Override
    public String toString() {
        return super.toString()+" -> Operario";
    }
}
