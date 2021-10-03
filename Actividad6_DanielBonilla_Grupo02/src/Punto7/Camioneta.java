/*
realizado por: Daniel José Bonilla Guerra
Programación - Grupo 02
 */
package Punto7;

public class Camioneta extends Vehiculo{
    
    private double carga;
    private int cantejes;
    private int cantrodadas;
    
    public Camioneta(){}
    
    public Camioneta(double carga, int cantejes, int cantrodadas){
        this.carga = carga;
        this.cantejes = cantejes;
        this.cantrodadas = cantrodadas;
    }

    public double getCarga() {
        return carga;
    }

    public int getCantejes() {
        return cantejes;
    }

    public int getCantrodadas() {
        return cantrodadas;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public void setCantejes(int cantejes) {
        this.cantejes = cantejes;
    }

    public void setCantrodadas(int cantrodadas) {
        this.cantrodadas = cantrodadas;
    }
}
