/*
Programación II - Grupo 02
Daniel José Bonilla Guerra
Taller 6
 */
package Punto3;

public class Persona {
    
    private String nombre;
    
    public Persona(){}
    
    public Persona (String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+nombre;
    }
}
