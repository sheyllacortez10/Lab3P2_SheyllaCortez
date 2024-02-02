/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_sheyllacortez;

/**
 *
 * @author DELL
 */
public class fireType extends Pokemon{
    private int firepotent = 0; 

    public fireType(String nombre, int numPokedex, String naturaleza, boolean atrapado, Pokeball poke, int firepotent) {
        super(nombre, numPokedex, naturaleza, atrapado, poke);
        this.firepotent = firepotent;
    }

    public int getFirepotent() {
        return firepotent;
    }

    public void setFirepotent(int firepotent) {
        this.firepotent = firepotent;
    }

    @Override
    public String toString() {
        return "fireType{" + "firepotent=" + firepotent + '}';
    }
    
    
}
