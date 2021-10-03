/*
Taller 6
Programación II - Grupo 02
Daniel José Bonilla Guerra
*/
package Punto2;

public class Oficial extends Operario{
    
    public Oficial(){}
    
    public Oficial(String nombre){
        super(nombre);
    }
    
    @Override
    public String toString() {
        return super.toString()+" -> Oficial";
    }
}
