/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_sheyllacortez;

/**
 *
 * @author DELL
 */
public class Pokeball {
    private String coloPoke = "";
    private int serie = 0;
    private int eficiencia = 0;

    public Pokeball(String coloPoke,int serie, int eficiencia ) {
        this.coloPoke = coloPoke; 
        this.serie = serie; 
        this.eficiencia = eficiencia;
    }

    public String getColoPoke() {
        return coloPoke;
    }

    public void setColoPoke(String coloPoke) {
        this.coloPoke = coloPoke;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(int eficiencia) {
        this.eficiencia = eficiencia;
    }

    @Override
    public String toString() {
        return "Pokeball{" + "coloPoke=" + coloPoke + ", serie=" + serie + ", eficiencia=" + eficiencia + '}';
    }
    
    
    
    
    
}
