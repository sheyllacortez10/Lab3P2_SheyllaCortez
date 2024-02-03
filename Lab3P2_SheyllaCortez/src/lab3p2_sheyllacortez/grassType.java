/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_sheyllacortez;

/**
 *
 * @author DELL
 */
public class grassType  extends Pokemon{
    private String habitat = "";
    private int domain = 0;

    public grassType(String nombre, int numPokedex, String naturaleza, boolean atrapado, Pokeball poke, String habitat, int domain ) {
        super(nombre, numPokedex, naturaleza, atrapado, poke);
        this.habitat = habitat; 
        this.domain = domain;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getDomain() {
        return domain;
    }

    public void setDomain(int domain) {
        this.domain = domain;
    }

    @Override
    public String toString() {
        return super.toString() + "grassType{" + "habitat=" + habitat + ", domain=" + domain + '}';
    }
    
    
}
