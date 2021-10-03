/*
Programación II - Grupo 02
Daniel José Bonilla Guerra
Taller 6
 */
package Punto3;

public class ProfesorInterino extends Profesor {
    
    protected String fecha;
    
    public ProfesorInterino(){}
    
    public ProfesorInterino(String fecha){
        this.fecha = fecha;
    }
    
    public String toString(){
        return "El profesor interino se incorporó en la fecha: ";
    }
}
