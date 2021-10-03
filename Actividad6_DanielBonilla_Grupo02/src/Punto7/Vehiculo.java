/*
realizado por: Daniel José Bonilla Guerra
Programación - Grupo 02
 */
package Punto7;

public class Vehiculo {
    private String nserie;
    private String marca;
    private int año;
    private int precio;
    
    public Vehiculo(){}
    
    public Vehiculo(String nserie, String marca, int año, int precio){
        this.nserie = nserie;
        this.marca = marca;
        this.año = año;
        this.precio = precio;
    }

    public String getNserie() {
        return nserie;
    }

    public String getMarca() {
        return marca;
    }

    public int getAño() {
        return año;
    }

    public int getPrecio() {
        return precio;
    }

    public void setNserie(String nserie) {
        this.nserie = nserie;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    
}
