/*
realizado por: Daniel José Bonilla Guerra
Programación - Grupo 02
 */
package Punto7;

public class Compacto extends Vehiculo{
    
    private int pasajeros;
    
    public Compacto(){}
    
    public Compacto(int pasajeros){
        this.pasajeros = pasajeros;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }
    
}
