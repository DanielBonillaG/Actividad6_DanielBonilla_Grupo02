/*
Programación II - Grupo 02
Daniel José Bonilla Guerra
Taller 6
 */
package Punto3;

public class Profesor extends Persona{
    
    protected String id;
    
    public Profesor(){}
    
    public Profesor(String id){
        this.id = id;
    }
    
    @Override
    public String toString(){
        return super.getNombre()+ " con ID de profesor: "+id;
    }
}
