/*
Programación II - Grupo 02
Daniel José Bonilla Guerra
Taller 6
 */
package Punto4;

public class Ordenador {
    
    private String codigo;
    private int precio;
    
    public Ordenador(){}
    
    public Ordenador(String codigo, int precio){
        this.codigo = codigo;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}
