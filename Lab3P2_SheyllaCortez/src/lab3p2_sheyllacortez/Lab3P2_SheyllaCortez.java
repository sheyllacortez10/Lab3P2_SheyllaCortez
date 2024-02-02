/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_sheyllacortez;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Lab3P2_SheyllaCortez {

    private static Scanner entrada = new Scanner(System.in);
    private static ArrayList<Pokemon> pokemoncito = new ArrayList<>();
    private static ArrayList<Pokeball> mispokes = new ArrayList<>();

    public static void main(String[] args) {
        int opcion = 0;
        do {
            System.out.println("Ingrese una opcion");
            System.out.println("1) Crear Pokemon ");
            System.out.println("2) Crear Pokebola ");
            System.out.println("3) Listar Pokemon ");
            System.out.println("4) Eliminar Pokemon ");
            System.out.println("5) Capturar Pokemon ");
            System.out.println("6) Salir");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    crearPoke();
                    break;
                case 2:

                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Que le vaya bien instructor ");
                    break;
                default:
                    System.out.println("SU opcion es invalida ");
            }
        } while (opcion != 6);
    }

    //Método para crear pokemon 
    public static void crearPoke() {
        int elijePoke = 0;
        do {
            System.out.println("Ingrese el pokemon a crear: ");
            System.out.println("1) Fuego");
            System.out.println("2) Agua");
            System.out.println("3) Planta");
            elijePoke = entrada.nextInt();
            switch (elijePoke) {
                case 1:
                    crearpkFuego();
                    break;
                case 2:
                    crearpkAgua();
                    break;
                case 3:
                    crearpkGrass();
                    break;
                default:
                    System.out.println("Su opcion no puede crear un pokemon");
            }

        } while (elijePoke < 1 || elijePoke > 3);

    }

    //Método para los pokemones de fuego 
    public static void crearpkFuego() {
        boolean atrapado = false;
        Pokeball poke = null;

        System.out.println("Ingrese nombre: ");
        entrada.nextLine();
        String nombre = entrada.nextLine();
        System.out.println("Ingrese numero del pokedex: ");
        int pokedex = entrada.nextInt();
        System.out.println("Ingrese la naturaleza del pokemon: ");
        entrada.nextLine();
        String naturaleza = entrada.nextLine();
        while ((!naturaleza.equalsIgnoreCase("Timido")) && (!naturaleza.equalsIgnoreCase("Energetico")) && (!naturaleza.equalsIgnoreCase("Misterioso"))) {
            System.out.println("Naturaleza incorrecta ");
            System.out.println("Ingrese la naturaleza del pokemon: ");
            naturaleza = entrada.nextLine();
        }
        System.out.println("Ingrese pontencia de las llamas del pokemon: ");
        int firepotent = entrada.nextInt();

        pokemoncito.add(new fireType(nombre, pokedex, naturaleza, atrapado, poke, firepotent));
    }

    //Método para crear pokemones de agua 
    public static void crearpkAgua() {
        boolean atrapado = false;
        Pokeball poke = null;

        System.out.println("Ingrese el nombre del pokemon: ");
        entrada.nextLine();
        String nombre = entrada.nextLine();
        System.out.println("Ingrese numero del pokedex: ");
        int pokedex = entrada.nextInt();
        System.out.println("Ingrese la naturaleza del pokemon: ");
        entrada.nextLine();
        String naturaleza = entrada.nextLine();
        while ((!naturaleza.equalsIgnoreCase("Timido")) && (!naturaleza.equalsIgnoreCase("Energetico")) && (!naturaleza.equalsIgnoreCase("Misterioso"))) {
            System.out.println("Naturaleza incorrecta ");
            System.out.println("Ingrese la naturaleza del pokemon: ");
            naturaleza = entrada.nextLine();
        }
        System.out.println("Su pokemon puede vivir fuera del agua {Si o No}:");
        String vivirAgua = entrada.nextLine();
        boolean viveAgua = false;
        if (vivirAgua.equalsIgnoreCase("si")) {
            viveAgua = true;
        } else if (vivirAgua.equalsIgnoreCase("no")) {
            viveAgua = false;
        } else {
            System.out.println("Su opcion es invalida");
            while ((!vivirAgua.equalsIgnoreCase("si")) && (!vivirAgua.equalsIgnoreCase("no"))) {
                System.out.println("Su pokemon puede vivir fuera del agua {Si o No}:");
                vivirAgua = entrada.nextLine();
                if (vivirAgua.equalsIgnoreCase("si")) {
                    viveAgua = true;
                } else if (vivirAgua.equalsIgnoreCase("no")) {
                    viveAgua = false;
                }
            }
        }
        System.out.println("Ingrese la velocidad para nadar: ");
        int rapidez = entrada.nextInt();

        pokemoncito.add(new waterType(rapidez, viveAgua, nombre, pokedex, naturaleza, atrapado, poke));
    }

    //Método para crear pokemones grass
    public static void crearpkGrass() {
        boolean atrapado = false;
        Pokeball poke = null;

        System.out.println("Ingrese el nombre del pokemon: ");
        entrada.nextLine();
        String nombre = entrada.nextLine();
        System.out.println("Ingrese numero del pokedex: ");
        int pokedex = entrada.nextInt();
        System.out.println("Ingrese la naturaleza del pokemon: ");
        entrada.nextLine();
        String naturaleza = entrada.nextLine();
        while ((!naturaleza.equalsIgnoreCase("Timido")) && (!naturaleza.equalsIgnoreCase("Energetico")) && (!naturaleza.equalsIgnoreCase("Misterioso"))) {
            System.out.println("Naturaleza incorrecta ");
            System.out.println("Ingrese la naturaleza del pokemon: ");
            naturaleza = entrada.nextLine();
        }
        System.out.println("Ingrese el tipo de habitat: ");
        String habitat = entrada.nextLine();
        System.out.println("Ingrese el dominio sobre las plantas [0-100]: ");
        int dominio = entrada.nextInt();
        while ((dominio < 0) || (dominio > 100)) {
            System.out.println("Ingrese el dominio sobre las plantas [0-100]: ");
            dominio = entrada.nextInt();
        }
        
        pokemoncito.add(new grassType(nombre, pokedex, naturaleza, atrapado, poke, habitat, dominio));
    }
}
