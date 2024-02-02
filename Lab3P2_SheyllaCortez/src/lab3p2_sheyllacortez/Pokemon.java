/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_sheyllacortez;

/**
 *
 * @author DELL
 */
public class Pokemon {
    protected String nombre = "";
    protected int numPokedex = 0;
    protected String naturaleza = "";
    protected boolean atrapado = false; 
    protected Pokeball poke;

    public Pokemon() {
    }

    public Pokemon(String nombre, int numPokedex, String naturaleza, boolean atrapado, Pokeball poke) {
        this.nombre = nombre;
        this.numPokedex = numPokedex;
        this.naturaleza = naturaleza;
        this.atrapado = atrapado;
        this.poke = poke;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumPokedex() {
        return numPokedex;
    }

    public void setNumPokedex(int numPokedex) {
        this.numPokedex = numPokedex;
    }

    public String getNaturaleza() {
        return naturaleza;
    }

    public void setNaturaleza(String naturaleza) {
        this.naturaleza = naturaleza;
    }

    public boolean isAtrapado() {
        return atrapado;
    }

    public void setAtrapado(boolean atrapado) {
        this.atrapado = atrapado;
    }

    public Pokeball getPoke() {
        return poke;
    }

    public void setPoke(Pokeball poke) {
        this.poke = poke;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "nombre=" + nombre + ", numPokedex=" + numPokedex + ", naturaleza=" + naturaleza + ", atrapado=" + atrapado + ", poke=" + poke + '}';
    }
    
    
    
}
