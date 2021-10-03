/*
realizado por: Daniel José Bonilla Guerra
Programación - Grupo 02
 */
package Punto7;

public class Vagoneta extends Vehiculo {
    
    private int pasajeros;
    
    public Vagoneta(){}
    
    public Vagoneta(int pasajeros)
    {
      this.pasajeros = pasajeros; 
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    } 
}
