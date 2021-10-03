/*
Programación II - Grupo 02
Daniel José Bonilla Guerra
Taller 6
 */
package Punto4;

public class Sobremesa extends Ordenador{
    
    private String tipotorre;
    
    public Sobremesa(){}
    
    public Sobremesa(String tipotorre){
        this.tipotorre = tipotorre;
    }
    
    @Override
    public String toString(){
        return "Es el que más pesa, pero el que menos cuesta...";
    }

    public String getTipotorre() {
        return tipotorre;
    }

    public void setTipotorre(String tipotorre) {
        this.tipotorre = tipotorre;
    }
}
