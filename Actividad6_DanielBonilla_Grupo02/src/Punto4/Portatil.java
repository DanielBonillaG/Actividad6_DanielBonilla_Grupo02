/*
Programación II - Grupo 02
Daniel José Bonilla Guerra
Taller 6
 */
package Punto4;

public class Portatil extends Ordenador{
    
    private double peso;
    
    public Portatil(){}
    
    public Portatil(double peso){
        this.peso = peso;
    }
    
    
    @Override
    public String toString(){
        return "Ideal para sus viajes...";
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
