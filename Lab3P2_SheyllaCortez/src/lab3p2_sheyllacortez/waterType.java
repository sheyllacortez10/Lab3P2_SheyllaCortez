/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_sheyllacortez;

/**
 *
 * @author DELL
 */
public class waterType  extends Pokemon{
    private boolean lifeWater;
    private int rapidez = 0;

    public waterType(int rapidez, boolean lifeWater, String nombre, int numPokedex, String naturaleza, boolean atrapado, Pokeball poke) {
        super(nombre, numPokedex, naturaleza, atrapado, poke);
        this.lifeWater = lifeWater;
        this.rapidez = rapidez;
    }

    public boolean isLifeWater() {
        return lifeWater;
    }

    public void setLifeWater(boolean lifeWater) {
        this.lifeWater = lifeWater;
    }

    public int getRapidez() {
        return rapidez;
    }

    public void setRapidez(int rapidez) {
        this.rapidez = rapidez;
    }

    @Override
    public String toString() {
        return super.toString() + "waterType{" + "lifeWater=" + lifeWater + ", rapidez=" + rapidez + '}';
    }
    
    
}
