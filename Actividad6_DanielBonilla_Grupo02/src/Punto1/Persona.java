/*
Taller 6
Daniel José Bonilla Guerra
Programación II - Grupo 02
*/
package Punto1;

public class Persona {
   private int id;
   private String nombre;
   private String apellido;
   private int edad;
   
   public Persona(){
   }
   
   public Persona(int id, String nombre, String apellido, int edad){
       this.id = id;
       this.nombre = nombre;
       this.apellido = apellido;
       this.edad = edad;
   }
   
    public int getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    private void Concentrase(){
        System.out.println("Me gusta concentrarme");
    }
    
    private void viajar(){
        System.out.println("Amo viajar");
    }
}
